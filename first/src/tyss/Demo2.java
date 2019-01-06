package tyss;

import org.testng.annotations.Test;

public class Demo2 {
	@Test(dataProvider="test1",dataProviderClass=DataProvider1.class)
	public void test(String un , String pw) {
		System.out.println(un + " " + pw);
	}

}
