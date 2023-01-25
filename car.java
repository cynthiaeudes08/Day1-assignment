package assignment1;

public class car {
	public void applyBreak() {
		System.out.println(" Break is working");
	}
	public void applyGear() {
		System.out.println(" Gear is working");
	}
	public void switchOnAc() {
		System.out.println(" AC is working");
	}
	public static void main(String[] args) {
		car object=new car();
		object.applyBreak();
		object.applyGear();
		object.switchOnAc();
	}

}
