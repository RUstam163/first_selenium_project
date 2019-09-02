package bookManager2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestAuthor extends WebDriverSettings {

    @Test
    public void authorCRUD() throws InterruptedException {

        driver.get("http://localhost:8086/");

        System.out.println("Page title is: " + driver.getTitle());

        WebElement find_author = driver.findElement(By.name("author"));
        find_author.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());

        WebElement find_link_add_author = driver.findElement(By.linkText("Добавить"));
        find_link_add_author.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());

        System.out.println("Добавляем нового автора");

        WebElement add_new_author_name = driver.findElement(By.name("name"));
        add_new_author_name.sendKeys("Иван");
        WebElement add_new_author_lastname = driver.findElement(By.name("lastname"));
        add_new_author_lastname.sendKeys("Иванович");
        WebElement add_new_author_fathername = driver.findElement(By.name("fathername"));
        add_new_author_fathername.sendKeys("Иванов");
        WebElement submit_add = driver.findElement(By.name("sub"));
        submit_add.click();
        Thread.sleep(2000);

        System.out.println("Находим добавленного автора для изменения");

        WebElement find_add_author = driver.findElement(By.xpath("//td[text()='Иван']/../td[text()='Иванович']/../td[text()='Иванов']/../td[5]/a[text()='Изменить']"));
        find_add_author.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Изменяем добавленного автора");

        WebElement edit_new_author_name = driver.findElement(By.name("name"));
        edit_new_author_name.clear();
        edit_new_author_name.sendKeys("Иван изменен");
        WebElement edit_new_author_lastname = driver.findElement(By.name("lastname"));
        edit_new_author_lastname.clear();
        edit_new_author_lastname.sendKeys("Иванович изменен");
        WebElement edit_new_author_fathername = driver.findElement(By.name("fathername"));
        edit_new_author_fathername.clear();
        edit_new_author_fathername.sendKeys("Иванов изменен");
        WebElement submit_edit = driver.findElement(By.name("sub"));
        submit_edit.click();
        Thread.sleep(2000);

        System.out.println("Удаляем измененного добавленного автора");

        WebElement delite_new_author = driver.findElement(By.xpath("//td[text()='Иван изменен']/../td[text()='Иванович изменен']/../td[text()='Иванов изменен']/../td[5]/a[text()='Удалить']"));
        delite_new_author.click();
        Thread.sleep(2000);

        System.out.println("Переходим на главную страницу");

        WebElement start_page = driver.findElementByClassName("current");
        start_page.click();
        Thread.sleep(2000);

    }

}
