package bookManager2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestBook extends WebDriverSettings {

    @Test
    public void bookCRUD() throws InterruptedException {

        driver.get("http://localhost:8086/");

        System.out.println("Page title is: " + driver.getTitle());

        WebElement find_book = driver.findElement(By.name("book"));
        find_book.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());

        WebElement find_link_add_book = driver.findElement(By.linkText("Добавить"));
        find_link_add_book.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());

        System.out.println("Добавляем новую книгу");

        WebElement add_new_book_name = driver.findElement(By.name("bookName"));
        add_new_book_name.sendKeys("тестовая книга");
        WebElement find_select_author = driver.findElement(By.name("author.id"));
        Select select_author = new Select(find_select_author);
        select_author.selectByValue("1");
        WebElement find_select_genre = driver.findElement(By.name("genre.id"));
        Select select_genre = new Select(find_select_genre);
        select_genre.selectByValue("3");
        WebElement add_new_book_publisher = driver.findElement(By.name("publisher"));
        add_new_book_publisher.sendKeys("тестовый издатель");
        WebElement add_new_book_year = driver.findElement(By.name("year"));
        add_new_book_year.sendKeys("1991");
        WebElement add_new_book_city = driver.findElement(By.name("city"));
        add_new_book_city.sendKeys("тестовый город");
        WebElement submit_add = driver.findElement(By.name("sub"));
        submit_add.click();
        Thread.sleep(2000);

        System.out.println("Находим добавленную книгу для изменения");

        WebElement find_add_book = driver.findElement(By.xpath("//td[text()='тестовый город']/../td[8]/a[text()='Изменить']"));
        find_add_book.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Изменяем добавленную книгу");

        WebElement edit_new_book_name = driver.findElement(By.name("bookName"));
        edit_new_book_name.clear();
        edit_new_book_name.sendKeys("тестовая книга изменил");
        WebElement edit_select_author = driver.findElement(By.name("author.id"));
        Select edit_author = new Select(edit_select_author);
        edit_author.selectByValue("8");
        WebElement edit_select_genre = driver.findElement(By.name("genre.id"));
        Select edit_genre = new Select(edit_select_genre);
        edit_genre.selectByValue("7");
        WebElement edit_new_book_publisher = driver.findElement(By.name("publisher"));
        edit_new_book_publisher.clear();
        edit_new_book_publisher.sendKeys("тестовый издатель изменил");
        WebElement edit_new_book_year = driver.findElement(By.name("year"));
        edit_new_book_year.clear();
        edit_new_book_year.sendKeys("2222");
        WebElement edit_new_book_city = driver.findElement(By.name("city"));
        edit_new_book_city.clear();
        edit_new_book_city.sendKeys("тестовый город изменен");
        WebElement submit_edit = driver.findElement(By.name("sub"));
        submit_edit.click();
        Thread.sleep(2000);

        System.out.println("Удаляем измененную добавленную книгу");

        WebElement delite_new_book = driver.findElement(By.xpath("//td[text()='тестовый город изменен']/../td[8]/a[text()='Удалить']"));
        delite_new_book.click();
        Thread.sleep(2000);

        System.out.println("Переходим на главную страницу");

        WebElement start_page = driver.findElementByClassName("current");
        start_page.click();
        Thread.sleep(2000);
    }
}
