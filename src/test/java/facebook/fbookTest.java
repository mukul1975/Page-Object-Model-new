package facebook;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class fbookTest extends browserDetails{
	@Test(dataProvider="getData")
	public void sad(String email,String pass,String fname,String lname,String mob,String npass,String month,String day,String year) throws IOException
	{
		driver=browser();
		driver.get(prob.getProperty("url"));
		driver.manage().window().maximize();
//		Assert.assertEquals(driver.getTitle(), "Facebook - Log In or Sign Up");
		
		data dt=new data(driver);
	
		dt.name1(email);
		dt.pass1(pass);
		dt.ftname1(fname);
		dt.lname1(lname);
		dt.mobile1(mob);
		dt.newpassword1(npass);
		dt.smonth(month);
		dt.sday(day);
		dt.syear(year);
		dt.gender1();
		dt.select2("2");
		
		driver.close();
	}
		@DataProvider
		public Object[][] getData()
		{
			Object[][] data=new Object[3][9];
			data[0][0]="Aman@Kaman";
			data[0][1]="123345";
			data[0][2]="kans";
			data[0][3]="lans";
			data[0][4]="78654556";
			data[0][5]="yyyyyy";
			data[0][6]="Jan";
			data[0][7]="15";
			data[0][8]="2001";
			
			
			data[1][0]="Kaman@Aman";
			data[1][1]="543212";
			data[1][2]="Jana";
			data[1][3]="Fana";
			data[1][4]="768655656";
			data[1][5]="xxxxxx";
			data[1][6]="Feb";
			data[1][7]="21";
			data[1][8]="2015";
			
			
			data[2][0]="jolly@Kaman";
			data[2][1]="876543";
			data[2][2]="ytrags";
			data[2][3]="kjhgh";
			data[2][4]="878787877";
			data[2][5]="zzzzzzz";
			data[2][6]="Jun";
			data[2][7]="25";
			data[2][8]="2012";
			return data;
			
		}
		
					
		
}
		
	
		



