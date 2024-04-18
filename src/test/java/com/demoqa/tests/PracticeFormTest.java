package com.demoqa.tests;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.PracticeFormPage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm();
    }

    @Test
    public void createStudentAccountTest(){
        //
        new PracticeFormPage(driver).hideIframes();
        // enter personal data
        new PracticeFormPage(driver).enterPersonalData("John","Smith","john@gmail.com","1234567890")
                // select gender(radiobutton)
                .selectGender("Male")
                // enter birthday
                .enterBirthDay("10 September 1992")
                // enter subjects
                .enterSubjects(new String[]{"Maths","Chemistry"})
                // select hobby(check box)
                .selectHobby(new String[]{"Sports","Reading"})
                // uploadFile
                .uploadFile("C:/Tools/Screenshot.png")
                // select state
                .selectState("NCR")
                // select city
                .selectCity("Delhi")
                // click on submit button
                .clickOnSubmit()
                // assert student form appears
                .verifySuccessTitle("Thanks for submitting the form");
    }
}
