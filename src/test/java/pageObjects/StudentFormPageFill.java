package pageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class StudentFormPageFill extends Parameters {

    public void openForm() {open(endPoint);}

    public void fillTheForm() {
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(gender).click();
        $("#userNumber").setValue(phone);
        setupBirthDay();
        $("#subjectsInput").sendKeys(subject);
        $(".css-26l3qy-menu div").find(byText(subject)).click();
        $("#hobbiesWrapper").find(byText(hobby)).click();
        $("#uploadPicture").uploadFromClasspath(fileName);
        $("#currentAddress").setValue(currentAddress);
        $("#stateCity-wrapper").scrollIntoView(true);
        chooseStateAndCity();
        $("#submit").click();

    }

    public void closeTheForm() {
        $(".modal-footer").find(byCssSelector("#closeLargeModal")).
                click();
    }

    public void checkTheForm() {
        $(".table-responsive").
                shouldHave((text(firstName + " " + lastName)),
                        text(email),
                        text(genderName),
                        text(phone),
                        text(convertedDate),
                        text(subject),
                        text(hobby),
                        text(fileName),
                        text(currentAddress),
                        text(state + " " + city));
    }


    public void fillCheckTheFormWithoutNumber() {
        $("#firstName").setValue(firstName);
        $("#lastName").setValue(lastName);
        $("#userEmail").setValue(email);
        $(gender).click();
        setupBirthDay();
        $("#subjectsInput").sendKeys(subject);
        $(".css-26l3qy-menu div").find(byText(subject)).click();
        $("#hobbiesWrapper").find(byText(hobby)).click();
        $("#uploadPicture").uploadFromClasspath(fileName);
        $("#currentAddress").setValue(currentAddress);
        $("#stateCity-wrapper").scrollIntoView(true);
        chooseStateAndCity();
        $("#submit").click();
        $("#userNumber").shouldHave(Condition.attribute("pattern", "\\d*"));
    }

    public void chooseStateAndCity() {
        $("#stateCity-wrapper").find(byId("state")).click();
        $(".css-26l3qy-menu div").find(byText(state)).click();
        $("#stateCity-wrapper").find(byId("city")).click();
        $(".css-26l3qy-menu div").find(byText(city)).click();
    }

    public void setupBirthDay() {
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").find(byText(month)).click();
        $(".react-datepicker__year-select").find(byText(year)).click();
        $(".react-datepicker__day--0" + day).click();
    }

}