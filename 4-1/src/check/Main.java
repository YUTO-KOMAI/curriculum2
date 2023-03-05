package check;

import constants.Constants;

public class Main {
	
	private static String firstName = "駒井";
	private static String lastName  = "悠人";
	
	public Main(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	private void printName() {
		System.out.println(this.firstName + this.lastName);
	}

	public static void main(String[] args) {
		
		Main main = new Main("printNameメソッド　→　" + firstName, lastName);
		main.printName();
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
	
		RobotPet RP = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		RP.introduce();
			
	}
}