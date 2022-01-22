package week1.day1;

public class Mobile {
	public void sendMsg(String message) {
		System.out.println("Message delivered " + message);
	}
	public void makeCall(long mobileNum) {
		System.out.println("Call number "+ mobileNum);
	}
	private void saveContacts(String name) {
		System.out.println("Save Contacts " + name);
	}
	public static void main(String[] args) {
		Mobile mob = new Mobile();
		mob.saveContacts("Parthi");
		mob.sendMsg("Hello");
		mob.makeCall(9854761237L);
	}
	

}
