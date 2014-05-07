package se.chalmers.group4.codenavigator.test;

import com.robotium.solo.Solo;

import se.chalmers.group4.codenavigator.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

public class InitialTest extends ActivityInstrumentationTestCase2<MainActivity> {

	private Solo solo;
	public InitialTest() {
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		solo = new Solo(getInstrumentation(),getActivity());
	}
	
	public void testAddRemove (){
		solo.assertCurrentActivity("check first activity", MainActivity.class);
	}

}
