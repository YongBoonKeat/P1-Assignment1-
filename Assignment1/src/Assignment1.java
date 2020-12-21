import java.util.Scanner;
public class Assignment1 {
	static String name; 
	static char gender;
	static String ic;
	static int age;
	static String marital;
	static String citizen;
	static String work;
	static int salary;
	static int choice;
	static int housingloan;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		printName();
		printGender();
		printIc();
		printAge();
		printMarital();
		printCitizen();
		printWork();
		printSalary();
		printToH();
		printHousingloan();
		printFinalform();
	}
	public static void printName() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your name: ");
		name=input.nextLine();
	}
	public static void printGender() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your gender: ");
		gender=input.next().charAt(0);
	}
	
	public static void printIc() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your IC: ");
		ic=input.nextLine();
		
	}
		
	public static void printAge() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your age:");
		age=input.nextInt();
		
	}
	public static void printMarital() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your marital:");
		marital=input.next();
	}
	public static void printCitizen() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your citizen:");
		citizen=input.next();
	}
	public static void printWork() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your work:");
		work=input.next();
		
	}
	public static void printSalary() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your salary: ");
		salary=input.nextInt();
		
	}
	
	public static void printToH() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Type of house: ");
		System.out.println("1: Banglo ");
		System.out.println("2: Condo ");
		System.out.println("3: Hometown ");
		System.out.println("Please enter your choice: ");
		choice = input.nextInt();
		if(choice==1) {
			System.out.println("Banglo");
			System.out.println("Maximum housing loan = RM500000");
			System.out.println("Payment limited: 10years ");
			System.out.println("Changers: 3% ");
		}
	    else if(choice==2) {
	    	System.out.println("Condo");
			System.out.println("Maximum housing loan = RM200000");
			System.out.println("Payment limited: 3years ");
			System.out.println("Changers: 2% ");
	    }
	    else if(choice==3) {
	    	System.out.println("Hometown");
			System.out.println("Maximum housing loan = RM400000");
			System.out.println("Payment limited: 5years ");
			System.out.println("Changers: 3% ");
	    }
	    else {
	    	 System.out.print("Invalid number !!!");
	}
	}
	public static void printHousingloan() {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter your Housingloan: ");
		housingloan=input.nextInt();
		
	}
	public static void printFinalform() {
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("IC: " + ic);
		System.out.println("Age: " + age);
		System.out.println("Marital: " + marital);
		System.out.println("Citizen: " + citizen);
		System.out.println("Work: " + work);
		System.out.println("Salary: " + salary);
		System.out.println("Type of house: " + choice);
		System.out.println("Housingloan: " + housingloan);
	}
}
