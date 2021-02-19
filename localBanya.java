package TWC;

import java.io.FileNotFoundException;
import java.io.IOException;

public class localBanya {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		StockManagSystem sms=new StockManagSystem();
//		sms.uploadProductFile();
		sms.customerDetails();
		
		sms.customernamecheck();
	}

}
