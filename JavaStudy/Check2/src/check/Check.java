package check;

public class Check {
	
    private String firstName;
	
	private String lastName;
	
	public static void main(String[] args) {
		
		String firstName = "佐藤";
		
		String lastName = "至";
		
		System.out.println(printName(firstName, lastName));
		
        Pet pet = new Pet("java吉", "hoge");
		
		pet.introduce();
		
		RobotPet rp = new RobotPet("R2D2", "ルーク");
		
		rp.introduce();
		
	}

	private static String printName(String firstName, String lastName) {
		
		return "printNameメソッド→" + firstName + lastName ;
	}
	
}