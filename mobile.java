package assignment1;

public class mobile {
	public void sendMessage() {
		System.out.println(" Message is sent");
	}
	public void shareDocument() {
		System.out.println(" Document is sent");
	}
	public void call() {
		System.out.println(" Make a call");
	}
	public static void main(String[] args) {
		mobile object=new mobile();
		object.sendMessage();
		object.shareDocument();
		object.call();
	}

}
