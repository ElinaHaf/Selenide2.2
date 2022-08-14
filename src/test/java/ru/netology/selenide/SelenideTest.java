package ru.netology.selenide;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;


public class SelenideTest {

    // @BeforeAll
    // static void setupAll() {
    // WebDriverManager.chromedriver().setup();
    //}

    @Test
    void shouldTestFullCycle() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Михаил Александров");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestCityCapitalLetters() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("КАЗАНЬ");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Михаил Александров");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestPopularRussianName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Иван Иванов");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestРyphenatedName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Иван Копытин-Иванов");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestNameSpaces() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Иван Копытин Иванов");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestDoubleName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Анна - Мария Серго");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestNameWithYo() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Аушева Алёна");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestNameWithBigGap() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Аушева     Наталья");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestBigName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("ыуалоарыуопрокпрвжпрважлопрважопрвжпщквшпрвкдопадвжло");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestSmallName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("О В");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestNameCapitalLetters() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("САТТАРОВ АЛЕКСЕЙ");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestDistantDate() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        //$("[data-test-id=date] .input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("23.08.2025");
        $("[name='name']").setValue("Аушева     Наталья");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Успешно!')]").shouldBe(Condition.visible, Duration.ofSeconds(12));
    }

    @Test
    void shouldTestForeignCity() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Копенгаген");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Михаил Александров");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Доставка в выбранный город недоступна')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestEnglishCity() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Moscow");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Михаил Александров");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Доставка в выбранный город недоступна')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestJustName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Наталья");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.')]").shouldBe(Condition.visible);
        ;
    }

    @Test
    void shouldTestEmptyName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");

        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Поле обязательно для заполнения')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestEnglishName() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Ivan Petrov");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.')]").shouldBe(Condition.visible);
        ;
    }

    @Test
    void shouldTestEmptyPhone() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");

        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Поле обязательно для заполнения')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestPhoneWithoutPlus() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");
        $("[name='phone']").setValue("79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestBigPhone() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");
        $("[name='phone']").setValue("+79991234567812");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestPhoneSymbols() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");
        $("[name='phone']").setValue("%^^^^^^^^^^");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestSmallPhone() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");
        $("[name='phone']").setValue("+7999123456");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestPhoneWithWords() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");
        $("[name='phone']").setValue("Саттаров Алексей");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestEmptyCheckBox() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("22.08.2022");
        $("[name='name']").setValue("Саттаров Алексей");
        $("[name='phone']").setValue("+799912345678");

        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Я соглашаюсь с условиями обработки и использования моих персональных данных')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestOnlyCheckBox() {
        Configuration.headless = true;
        open("http://localhost:9999/");

        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Поле обязательно для заполнения')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestEmptyForm() {
        Configuration.headless = true;
        open("http://localhost:9999/");

        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Поле обязательно для заполнения')]").shouldBe(Condition.visible);
    }

    @Test
    void shouldTestEarlyDate() {
        Configuration.headless = true;
        open("http://localhost:9999/");
        $("[data-test-id=city] .input__control").setValue("Казань");
        //$("[data-test-id=date] .input").doubleClick().sendKeys(Keys.BACK_SPACE);
        $("[data-test-id=date] .input__control").doubleClick().sendKeys("14.08.2022");
        $("[name='name']").setValue("Аушева     Наталья");
        $("[name='phone']").setValue("+79991234567");
        $(By.className("checkbox__box")).click();
        $(By.className("button__text")).click();
        $x("//*[contains(text(),'Заказ на выбранную дату невозможен')]").shouldBe(Condition.visible);
    }
}
