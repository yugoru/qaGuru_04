package pageObjects;

import com.github.javafaker.Faker;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

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
    String subject = getRandomFromArray(subjects);
    String hobby = getRandomFromArray(hobbes);

    String[] genders = new String[]{"Female", "Male", "Other"};
    int randomGender = new Random().nextInt(3) + 1;
    String genderName = genders[randomGender];
    String gender = "label[for=gender-radio-" + randomGender + "]";

    Path fileP = Paths.get("1.jpeg");
    String fileName = fileP.getFileName().toString();

    private String getRandomFromArray(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

}
