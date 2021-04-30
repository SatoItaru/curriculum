package check;

import constants.Constants;

public class Check {

	private static String firstName;
	
	private static String lastName;
	
	public static void main(String[] args) {
		
		firstName = "佐藤";
		
		lastName = "至";
		
		System.out.println(printName(firstName, lastName));
		
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		
		pet.introduce();
		
		RobotPet rp = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		rp.introduce();
		
	}

	private static String printName(String firstName, String lastName) {
		
		return "printNameメソッド→" + firstName + lastName ;
	}
	
}