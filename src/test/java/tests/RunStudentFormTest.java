package tests;

import pageObjects.StudentFormPageAssert;
import pageObjects.StudentFormPageFill;

public class RunStudentFormTest {

    public static void main(String[] args) {

        StudentFormPageFill pageFill = new StudentFormPageFill();
        StudentFormPageAssert resultAssertion = new StudentFormPageAssert();

        pageFill.fillTheForm();
        resultAssertion.successfulTest();

    }


}
