
public class VariablesandOperationsClass {

	public static void main(String[] args) {
		// variables start //
		int seatsAvailable = 4;
		double costGroceries = 13.50;
		char Initialmiddle = 'P';
		boolean isHotOutside = true;
		String firstName = "Andrew";
		String streetAddress = "1817 Southside Dr.";
		//variables end //
		
		System.out.println("There are " + seatsAvailable + " seats available");
		System.out.println(costGroceries);
		System.out.println(Initialmiddle);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
		//new questions //
		seatsAvailable = seatsAvailable - 2;
		System.out.println("There are now " + seatsAvailable + " seats available");
		
		costGroceries += 2.15;
		System.out.println(costGroceries);
		
		isHotOutside = !isHotOutside;
		System.out.println(isHotOutside + " is the reality now.");
		
		//etc//
		

	}

}
