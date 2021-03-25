package pageObjects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class StudentFormPageAssert extends Parameters {

    public void successfulTest() {

        $(".table-responsive").
                shouldHave((text(firstName + " " + lastName)),
                        text(email),
                        text(genderName),
                        text(phone),
                        text(convertedDate),
                        text(subject),
                        text(subject2),
                        text(hobby2),
                        text(hobby3),
                        text(fileName),
                        text(currentAddress),
                        text(state + " " + city));
        $(".modal-footer").find(byCssSelector("#closeLargeModal")).
                click();
    }
}
