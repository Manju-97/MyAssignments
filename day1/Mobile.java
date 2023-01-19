package week1.day1;

public class Mobile {
	public void SendSms() {
		System.out.println("Going to send sms");
		

	}
	
	public void takeSnap() {
		System.out.println("Going to take snapshot");
		

	}
	
	public static void main(String[] args) {
		
		Mobile No = new Mobile();
		No.SendSms();
		No.takeSnap();
		System.out.println("Thank you");
		
		
	}
	
	

}
