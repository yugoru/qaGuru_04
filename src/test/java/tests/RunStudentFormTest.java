package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pageObjects.StudentFormPageFill;

public class RunStudentFormTest {

    StudentFormPageFill pageFill = new StudentFormPageFill();

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void SuccessfulTest() {

        pageFill.openForm();
        pageFill.fillTheForm();
        pageFill.checkTheForm();
        pageFill.closeTheForm();

    }

    @Test
    void UnsuccessfulTest() {

        pageFill.openForm();
        pageFill.fillCheckTheFormWithoutNumber();
    }


}
