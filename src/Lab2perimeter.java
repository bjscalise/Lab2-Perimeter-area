import java.util.Scanner;

public class Lab2perimeter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		
		Scanner scan = new Scanner(System.in);
		
		double length = 0;
		double width = 0; 
		double height = 0;
		double perimeter;
		double area;
		double volume;
		
		System.out.println("Enter Length: ");
		
		length = scan.nextDouble();
		
		System.out.println("Enter Width: ");
		
		width = scan.nextDouble();
		
		System.out.println("Enter Height: ");
		
		height = scan.nextDouble();
		
		perimeter = ((length * 2) + (width * 2));
		
		area = (length * width);
		
		volume = length * width * height;
		
		System.out.println("Area: " + area);
		
		System.out.println("Perimeter: " + perimeter);
		
		System.out.println("Volume: " + volume);
		
		scan.nextLine();
		
		System.out.println("Continue? (y/n)");
		String yesNo =  scan.nextLine();
		
		while(yesNo.equals("Y") || yesNo.equals("y")) {
			System.out.println("Enter Length: ");
			
			length = scan.nextDouble();
			
			System.out.println("Enter Width: ");
			
			width = scan.nextDouble();
			
			System.out.println("Enter Height: ");
			
			height = scan.nextDouble();
			
			perimeter = ((length * 2) + (width * 2));
			
			area = (length * width);
			
			volume = length * width * height;
			
			System.out.println("Area: " + area);
			
			System.out.println("Perimeter: " + perimeter);
			
			System.out.println("Volume: " + volume);
			
			scan.nextLine();
			
			System.out.println("Continue? (y/n)");
			
			yesNo =  scan.nextLine(); //
			
			
		}
		
			
		}
		
		
	
	    }
		
//		String userInput = scan.nextLine();
//		
//		if(userInput == 'y' || userInput == 'Y') {
//			main();
//		}
//		else {
//			System.out.println("Thanks for using the Grand Circus Room Detail Generator!");
//		}
//		

//
//		input();
//
//	}
//
//	public static void input() {
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Please enter the length of a classroom in feet: ");
//		System.out.println("Ex) 12'6\" should be entered as 12.5");
//
//		double length = 0;
//		double width = 0;
//
//		length = validate(scanner);
//
//		System.out.println("Please enter the width of a classroom in feet: ");
//		System.out.println("Ex) 12'6\" should be entered as 12.5");
//
//		width = validate(scanner);
//		
//		calculate();
//
//		//System.out.println(length + " " + width);
//
//	}
//
//	public static void validate() {
//	
//		if(scanner.nextDouble) {
//		}
//		else {
//			System.out.println("That input was not valid. Please try again.");
//			input();
//		}
//		
//			
//	}	
//	
//	public static void calculate() {
//		
//		double perimeter;
//		double area;
//		
//		perimeter = ((length * 2) + (width * 2));
//		
//		area = (length * width);
//		
//		scanner.close();
//		
//		System.out.println("Continue? (y/n)");
//		
//		if (scanner.nextLine() = y) {
//			input();
//		}
//		else {
//			System.out.println("Thank you for using the Room Detail Generator");
//		}
			
