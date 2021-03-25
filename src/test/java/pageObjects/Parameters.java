package pageObjects;

import com.github.javafaker.Faker;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Parameters {

    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            subject = "Hindi",
            subject2 = "Maths",
            currentAddress = faker.address().fullAddress(),
            email = faker.internet().emailAddress(),

    gender = "label[for=gender-radio-2]",
            genderName = "Female",
            hobby2 = "Music",
            hobby3 = "Reading",
            month = "April",
            year = "1991",
            day = ".react-datepicker__day--026",
            convertedDate = "26 " + month + "," + year,
            state = "Haryana",
            city = "Panipat",
            endPoint = "https://demoqa.com/automation-practice-form",
            phone = faker.number().digits(10);


    Path fileP = Paths.get("/Volumes/Macintosh HD - Data/JavaLesson/qaGuru_2/src/files/1.jpeg");
    File file = new File(fileP.toString());
    String fileName = fileP.getFileName().toString();


}
