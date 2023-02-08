package stepDefinition

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class Login {
	@Given("User open URL User open URL tinggal.id web")
	public void user_open_URL_User_open_URL_tinggal_id_web() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://tinggal.id/')
	}

	@When("User clik button masuk")
	public void user_clik_button_masuk() {
		WebUI.click(findTestObject('Login/btn_masuk'))
	}

	@When("User input correct credantial")
	public void user_input_correct_credantial() {
		WebUI.setText(findTestObject('Login/input_email'), 'lin.linfauziah12@gmail.com')
		WebUI.setText(findTestObject('Login/input_password'), 'qwertyuiop12')
	}

	@When("User click button masuk")
	public void user_click_button_masuk() {
		WebUI.click(findTestObject('Login/btn_masuk 1'))
	}

	@Then("User successfully login")
	public void user_successfully_login() {
		WebUI.verifyElementVisible(findTestObject('Login/tinggal_icon'))
	}
	
	@When("User input incorrect credential")
	public void user_input_incorrect_credential() {
		WebUI.setText(findTestObject('Login/input_email'), 'linfauziah12@gmail.com')
		WebUI.setText(findTestObject('Login/input_password'), 'qwertyuiop12')
	}
	
	@When("User click button of Masuk on Login page")
	public void user_click_button_of_Masuk_on_Login_page() {
		WebUI.click(findTestObject('Login/btn_masuk 1'))
	}
	
	@Then("User will see a popup or notification that explains if the password was wrong")
	public void user_will_see_a_popup_or_notification_that_explains_if_the_password_was_wrong() {
		WebUI.verifyElementVisible(findTestObject('Login/msg_email atau kata sandi salah'))
	}
	
	@When("User input incorrect email")
	public void user_input_incorrect_email() {
		WebUI.setText(findTestObject('Login/input_email'), 'lkaajakjaksj')
	}
	
	@Then("User will see a popup or notification that explains if the email was wrong")
	public void user_will_see_a_popup_or_notification_that_explains_if_the_email_was_wrong() {
		WebUI.verifyElementVisible(findTestObject('Login/msg_format email tidak sah'))
	}
	
	@Then("User will see a popup or notification that explains if user need input password")
	public void user_will_see_a_popup_or_notification_that_explains_if_user_need_input_password() {
		WebUI.verifyElementVisible(findTestObject('Login/msg_anda belum mengisi kata sandi'))
	}
}
