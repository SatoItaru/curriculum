package study;

public class Main{

	public static void main(String[] args) {
		
		String firstName = "Itaru";
		
		String lastName = "Sato";
		
		System.out.println(getName(firstName, lastName));
		
		System.out.println();
		
		int[] arr = {11,12,13,14,15,16,17,18,19,20};
		
		for (int n = 0; n <arr.length; n++) {
			
			if (n % 2 != 0) {
				
				System.out.println(n + "は奇数です。");
			}
		}
}
		
	public static Object getName(String firstName, String lastName){
		
		return firstName + lastName;
	}
	
	public static void isOdd(int num) {
		
		if( num % 2 != 0) {
			
			System.out.println(num + "は奇数です。");
			
		}
	}
}