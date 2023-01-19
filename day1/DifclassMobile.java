package week1.day1;

public class DifclassMobile {
	
	public void makeCalls() {
		System.out.println("We can make call");
		String mobileModel = "Manju";
		int mobileWeight = 10;
		System.out.println(mobileWeight);
		

	}
	
	public void sendMsg() {
		System.out.println("Message Sent");
		boolean isFullCharged = false;
		int mobileCost = 10000;
		

	}
	
	public static void main(String[] args) {
		DifclassMobile obj=new DifclassMobile();
		obj.makeCalls();
		obj.sendMsg();
		System.out.println("This is my mobile");
		
	}

}
