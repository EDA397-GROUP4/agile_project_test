package se.chalmers.group4.codenavigator.test;

import com.robotium.solo.Solo;

import se.chalmers.group4.codenavigator.LoginActivity;
import se.chalmers.group4.codenavigator.ProjectListActivity;
import se.chalmers.group4.codenavigator.R;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

public class LoginTest extends ActivityInstrumentationTestCase2<LoginActivity> {

	private Solo solo;

	public LoginTest() {
		super(LoginActivity.class);
		// TODO Auto-generated constructor stub
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
	}
	
	public void testLogin (){
		solo.assertCurrentActivity("check first activity", LoginActivity.class);
		EditText user = (EditText)solo.getCurrentActivity().findViewById(R.id.editText1);
		EditText pass = (EditText)solo.getCurrentActivity().findViewById(R.id.editText2);
		solo.typeText(user, "ipopova");
		solo.typeText(pass, "git_pass123");
		solo.clickOnButton("Login");
		solo.assertCurrentActivity("check activity after login", ProjectListActivity.class);
	}


}
