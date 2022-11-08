
package OtpAction;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.HttpURLConnection;
import java.util.*;
 
class  OTPAction
{
	public int sendSms() 
        {
                int l=0;
		try {
    // Construct data
    String apiKey = "apikey=" + "2+XKCAW9nco-QZ0dXAigUyKGKrDtRX2xMETRuJ5yXC";
    l=(int)(Math.random()*100000);

    String message = "&message=" + "Your Otp is:"+l;
    String sender = "&sender=" + "TXTLCL";

    Scanner s=new Scanner(System.in);
    String mobile=s.next();

    String numbers = "&numbers=" + "91"+mobile;

    // Send data
    HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
    String data = apiKey + numbers + message + sender;
    conn.setDoOutput(true);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
    conn.getOutputStream().write(data.getBytes("UTF-8"));
    final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    final StringBuffer stringBuffer = new StringBuffer();
    String line;
    while ((line = rd.readLine()) != null) {
            stringBuffer.append(line);
    }
    rd.close();
			
			
		}
		 catch (Exception e) {
			System.out.println("Error SMS "+e);
			
		}
           return l;
             
	}

 public static void main(String arg[])
 {
     OTPAction otp=new OTPAction();
     System.out.println(otp.sendSms());
 }


}
