package pageObjects;

import com.github.javafaker.Faker;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Parameters {

    Faker faker = new Faker();

    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            currentAddress = faker.address().fullAddress(),
            email = faker.internet().emailAddress(),
            month = "April",
            year = "1991",
            day = "12", //дата из двух цифр, например 03
            convertedDate = day + " " + month + "," + year,
            state = "Haryana",
            city = "Panipat",
            endPoint = "https://demoqa.com/automation-practice-form",
            phone = faker.number().digits(10);

    String[] subjects = new String[]{"Maths", "English", "Biology", "Computer Science"};
    String[] hobbes = new String[]{"Reading", "Music", "Sports"};
    String subject = subjects[(int) (0 + (Math.random() * 3))];
    String hobby = hobbes[(int) (0 + (Math.random() * 2))];

    String[] genders = new String[]{"Female", "Male", "Other"};
    int randomGender = (int) (0 + (Math.random() * 2));
    String genderName = genders[randomGender];
    String gender = "label[for=gender-radio-" + randomGender +"]";

    Path fileP = Paths.get("/Volumes/Macintosh HD - Data/JavaLesson/qaGuru_2/src/files/1.jpeg");
    File file = new File(fileP.toString());
    String fileName = fileP.getFileName().toString();

}
