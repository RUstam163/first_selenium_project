package bookManager2;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestGenre extends WebDriverSettings {

    @Test
    public void genreCRUD() throws InterruptedException {
        driver.get("http://localhost:8086/");

        System.out.println("Page title is: " + driver.getTitle());

        WebElement find_genre = driver.findElement(By.name("genre"));
        find_genre.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());

        WebElement find_link_add_genre = driver.findElement(By.linkText("Добавить"));
        find_link_add_genre.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());

        System.out.println("Добавляем новый жанр");

        WebElement add_new_genre = driver.findElement(By.name("genreName"));
        add_new_genre.sendKeys("Тестовый жанр");
        WebElement submit_add = driver.findElement(By.name("sub"));
        submit_add.click();
        Thread.sleep(2000);

        System.out.println("Находим добавленный жанр для изменения");

        WebElement find_add_genre = driver.findElement(By.xpath("//td[text()='Тестовый жанр']/../td[3]/a[text()='Изменить']"));
        find_add_genre.click();
        Thread.sleep(2000);

        System.out.println("Page title is: " + driver.getTitle());
        System.out.println("Изменяем добавленный жанр");

        WebElement edit_new_genre = driver.findElement(By.name("genreName"));
        edit_new_genre.clear();
        edit_new_genre.sendKeys("Измененный тестовый жанр");
        WebElement submit_edit = driver.findElement(By.name("sub"));
        submit_edit.click();
        Thread.sleep(2000);

        System.out.println("Удаляем измененный добавленный жанр");

        WebElement delite_new_genre = driver.findElement(By.xpath("//td[text()='Измененный тестовый жанр']/../td[3]/a[text()='Удалить']"));
        delite_new_genre.click();
        Thread.sleep(2000);

        System.out.println("Переходим на главную страницу");

        WebElement start_page = driver.findElementByClassName("current");
        start_page.click();
        Thread.sleep(2000);


    }


}
