import java.util.Scanner;
import java.util.ArrayList;


	public class AIBob {
			//Array list of users
		public static ArrayList<User> userList = new ArrayList<User>();

		public static void main (String args[]){
		
		
		System.out.println("Hello! My name is Bob, what is your name? ");
		
		Scanner scanner = new Scanner(System.in);
		
		//Create new user, assign name and user number
		
		User newUser = new User(scanner.nextLine());	//Takes the user input and saves into a User-name.
		
		userList.add(newUser); // Creates a new user in the User class.
		
		System.out.println("Hi "+newUser.getUserName()+"! Can you tell me how old are you?");
		int Userage = scanner.nextInt();
		newUser.setAge(Userage);
		
		System.out.println("If you are lactose intolerant, please write y/n\n");
		String input = scanner.nextLine();		
		newUser.LactoseFinder(input);
		
		System.out.println("If you want your food glutten free, please write y/n\n");
		String otherinput = scanner.nextLine();		
		newUser.GluttenFinder(otherinput);
		
		
		System.out.println("Hi "+newUser.getUserName()+". What can I do for you today? \n");
		
		
		
		
		// User UserName = new User();
		
		
		String Foodwish = scanner.nextLine();
		
		FoodLibrary.FoodSorter(Foodwish); // Ask the user what sort of food he/she wants.
		
		System.out.println("What sort of Food do you want?");
		String Demand = scanner.nextLine();
		
		FoodLibrary.FoodBringer(Demand); // Calls the FoodLibrary to ask what type of food the user wants.
		
		
	
		}
	}
	
		
		