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


public class Register {
	@Given("User open URL tinggal.id web")
	public void user_open_URL_tinggal_id_web() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://tinggal.id/')
	}

	@When("User click button account")
	public void user_click_button_account() {
		WebUI.click(findTestObject('Register/btn_account'))
	}

	@When("User clik button daftar")
	public void user_clik_button_daftar() {
		WebUI.click(findTestObject('Register/btn_daftar'))
	}

	@When("User input correct credential")
	public void user_input_correct_credential() {
		WebUI.setText(findTestObject('Register/input_email'), 'quratest7@yopmail.com')
		WebUI.setText(findTestObject('Register/input_password'), 'qwertyuiop1')
	}

	@When("User clik checklist saya setuju")
	public void user_clik_checklist_saya_setuju() {
		WebUI.click(findTestObject('Register/checklist_saya setuju dengan syarat dan ketentuan'))
	}

	@When("User click button daftar")
	public void user_click_button_daftar() {
		WebUI.click(findTestObject('Register/btn_daftar 1'))
	}

	@Then("User input correct OTP")
	public void user_input_correct_OTP() {
		WebUI.verifyElementVisible(findTestObject('Register/msg_masukan OTP'))
	}

	@Then("User stay in register page")
	public void user_stay_in_register_page() {
		WebUI.verifyElementVisible(findTestObject('Register/msg_isi email'))
		WebUI.verifyElementVisible(findTestObject('Register/msg_isi kata sandi'))
		WebUI.verifyElementVisible(findTestObject('Register/msg_persetujuan syarat ketentuan'))
	}
}
