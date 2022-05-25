package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    @Test
    @DisplayName("Тест страницы Women")
    void checkingCardTest() {
        step("Открытие главной страницы", () -> {
            open("http://automationpractice.com/index.php");
        });

        step("Переход во вкладку Women", () -> {
            $("ul.menu-content li").$("a").click();
        });

        step("Отбор товаров и проверка результата", () -> {
            $("#layered_category_4").click();
            $("#layered_id_attribute_group_1").click();
            $(".first-in-line").shouldHave(text("Faded Short Sleeve T-shirts"));
            $(".ajax_block_product:not(.first-in-line)").shouldHave(text("Blouse"));
        });
    }

    @Test
    @DisplayName("Проверка кнопки Best sellers")
    void checkingButtonBestSellers() {
        step("Открытие главной страницы", () -> {
            open("http://automationpractice.com/index.php");
        });

        step("Нажать на Best sellers", () -> {
            $(byText("Best Sellers")).click();
        });

        step("Проверка товаров", () -> {
            $("#blockbestsellers").shouldHave(text("Printed Chiffon Dress"));
            $("#blockbestsellers").shouldHave(text("Faded Short Sleeve T-shirts"));
            $("#blockbestsellers").shouldHave(text("Blouse"));
            $("#blockbestsellers").shouldHave(text("Printed Summer Dress"));
            $("#blockbestsellers").shouldHave(text("Printed Dress"));
            $("#blockbestsellers").shouldHave(text("Printed Summer Dress"));
            $("#blockbestsellers").shouldHave(text("Printed Dress"));
        });
    }

    @Test
    @DisplayName("Проверка наличия номера телефона на странице")
    public void checkingPhoneNumber() {
        step("Открытие главной страницы", () -> {
            open("http://automationpractice.com/index.php");
        });

        step("Поиск номера телефона", () -> {
            $(".shop-phone").shouldHave(text("0123-456-789"));
        });
    }

    @Test
    @DisplayName("Проверка загаловка сайта")
    void titleTest() {
        step("Открытие главной страницы", () ->
                open("http://automationpractice.com/index.php"));

        step("Проверка текста в заголовке 'My Store'", () -> {
            String expectedTitle = "My Store";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @DisplayName("Проверка ошибок в консоль логе")
    void consoleShouldNotHaveErrorsTest() {
        step("Открытие главной страницы", () ->
                open("http://automationpractice.com/index.php"));

        step("Проверка ошибок 'SEVERE' в консоль логе", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}
