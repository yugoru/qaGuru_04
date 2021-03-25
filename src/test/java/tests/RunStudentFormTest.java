package tests;

import pageObjects.StudentFormPageFill;

public class RunStudentFormTest {

    public static void main(String[] args) {

        StudentFormPageFill pageFill = new StudentFormPageFill();

        pageFill.fillTheForm();
        pageFill.fillTheFormWithoutNumber();




    }


}
