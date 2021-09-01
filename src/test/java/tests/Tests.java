package tests;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

import org.junit.jupiter.api.Test;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class Tests extends TestBase {

    @Test
    void checkKrutoTest() {

        step("Открыть стартовую страницу", () -> open(baseUrl));
        step("Навести курсор мыши на \"умные банки\"", () ->
                $(withText("умные банки")).hover());
        step("Дождаться всплывающего сообщения", () ->
                $(".tooltipster-fade-show .t300__content-text").shouldBe(visible, Duration.ofSeconds(10)));
        step("Проверка текста всплывающего сообщения", () ->
                assertThat($(".tooltipster-fade-show .t300__content-text").shouldHave(text("Такие, как Газпромбанк, ВТБ и Открытие"))));
    }

    @Test
    void contactsTest() {
        step("Открыть стартовую страницу", () -> open(baseUrl));
        step("Нажать \"Связаться с нами\"", () -> $(".t228__right_buttons_but td").click());
        step("Проверить, что появилась форма обратной связи", () ->
                assertThat($(".tn-elem__2402566121566896915276").shouldBe(visible, Duration.ofSeconds(10)).isDisplayed()));
    }
    @Test
    void  aboutTest(){
        step("Открыть стартовую страницу", () -> open(baseUrl));
        step("Кликнуть \"О компании\"", () ->
                $(withText("О компании"))
                .shouldBe(visible,Duration.ofSeconds(3))).click();
        step("Проверить, что открылась страница \"О нас\"", () ->
                assertThat($("[field=tn_text_1566803783349]").shouldHave(text("О нас"))));
    }
    @Test
    void productsTest() {
        step("Открыть стартовую страницу", () -> open(baseUrl));
        step("Выбрать пункт меню \"Продукты\"", () ->$(".t228__list_item .t-menusub__target-link").hover());
        step("Выбрать продукт \"Salto.Avanti\"", () ->$(byText("Salto.Avanti")).click());
        step("Проверить, что открылась страница \"ДБО для бизнеса\"", () ->$("[field=tn_text_1566803783349]").shouldHave(text("ДБО для бизнеса")));
    }

    @Test
    void locationTest() {
        step("Открыть стартовую страницу", () -> open(baseUrl));
        step("Кликнуть по городу \"Рязань\"", () -> {
            $("#rec240558010").scrollTo();
            $("[field=title4]").click();
        });
        step("Проверить, что адрес на ул. Маяковского", () -> $(byXpath("//div[@field='title' and contains(text(),'Рязань')]/..//div[@data-customstyle='yes']"))
                .scrollTo().shouldHave(text("ул. Маяковского, дом 1А, литер А")));
    }


}
