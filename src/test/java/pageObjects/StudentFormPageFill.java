package pageObjects;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class StudentFormPageFill extends Parameters {


    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    public void fillTheForm() {
        open(endPoint);
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(gender).click();
        $("#userNumber").setValue(phone);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").find(byText(month)).click();
        $(".react-datepicker__year-select").find(byText(year)).click();
        $(day).click();
        $("#subjectsInput").sendKeys(subject);
        $(".css-26l3qy-menu div").find(byText(subject)).click();
        $("#subjectsInput").sendKeys(subject2);
        $(".css-26l3qy-menu div").find(byText(subject2)).click();
        $("#hobbiesWrapper").find(byText(hobby2)).click();
        $("#hobbiesWrapper").find(byText(hobby3)).click();
        $("#uploadPicture").uploadFile(file);
        $("#currentAddress").setValue(currentAddress);
        $("#stateCity-wrapper").scrollIntoView(true);
        $("#stateCity-wrapper").find(byId("state")).click();
        $(".css-26l3qy-menu div").find(byText(state)).click();
        $("#stateCity-wrapper").find(byId("city")).click();
        $(".css-26l3qy-menu div").find(byText(city)).click();
        $("#submit").click();


    }
}