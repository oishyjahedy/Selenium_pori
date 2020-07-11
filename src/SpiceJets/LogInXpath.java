package SpiceJets;

public class LogInXpath {
	static String loginSignupBtn = "//li[contains(@class,'li-login')]/a[normalize-space('Login / Signup')]";
	static String clickTitle = "//div[@id='personalInputContent']//select/option[contains(text(), 'Select')]";
	static String title = "//div[@id='personalInputContent']//select/option[@value='MRS']";
	static String firstName = "//div[@class='fields-container']/div[2]/input[contains(@id,'FirstName')]";
	static String lastName = "//div[@class='fields-container c_last']/div[2]/input[contains(@id,'LastName')]";
	static String phoneCodeArrow = "//div[@class='iti-arrow']";
	static String phoneCode = "//div[@class='flag-container']//li[@data-dial-code='1']";
	static String phoneNum = "//input[contains(@id, 'MOBILENUMBER')]";
	static String passWord = "//div[@class='tooltipPwd']//input[contains(@id, 'Password')]";
	static String confrimPass = "//div[@class='fields-container c_pwd']//input[contains(@id, 'Password')]";
	static String clickBirthBox = "//div[@class='fields-container d_birth']//input";
	static String prevYr = "//th[@class='datepickerGoPrev']";
	static String birthYr = "//tbody[@class='datepickerYears']/tr[2]//span";
	static String birthMonth = "//tbody[@class='datepickerMonths']/tr[2]/td[3]";
	static String birthDay = "//tbody[@class='datepickerDays']/tr[1]/td[6]";
	static String email = "//div[@class='signup-field-wrapper']//input[contains(@id, 'Email')]";
	static String checkBox = "//input[@id='chkSpiceClubTnC']";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
