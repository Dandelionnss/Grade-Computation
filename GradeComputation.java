package practice;

import java.util.Scanner;
public class GradeComputation {

	public static void main(String[] args) {


		Scanner user = new Scanner(System.in);
		
		// input the data of user
		
		System.out.print("Enter your Name : ");
		String name = user.nextLine();
		
		System.out.print("Enter your Prelim Grade : ");
		double PrelimGrade = user.nextDouble();
		
		System.out.print("Enter your Midterm Grade : ");
		double MidtermGrade = user.nextDouble();
		
		System.out.print("Enter your Pre-Final Grade : ");
		double PrefinalGrade = user.nextDouble();
		
		System.out.print("Enter your Final Grade : ");
		double FinalGrade = user.nextDouble();
		
		// Computation of Grades
		double Result1 = PrelimGrade * .2; //20% of Prelim
		double Result2 = MidtermGrade * .2; //20% of Midterm
		double Result3 = PrefinalGrade * .2; //20% of Pre-Fianal
		double Result4 = FinalGrade * .4; //40% of Final
		double Result = Result1 + Result2 + Result3 + Result4;
		
		// Display the output //
		System.out.println("\nName : " + name);
		System.out.println("Your Grade for this Semester is : " + Result);
		
		// Condition if passed or Not
		
		if (Result <= 74.49) {
			System.out.println("College Grade : Failed (5.00)");
		}else if (Result >=74.50 && Result <= 76.49) {
			System.out.println("College Grade : Fair (3.00)");
		}else if (Result >= 76.50 && Result <= 79.49 ) {
			System.out.println("College Grade : Fair (2.75)");
		}else if (Result >= 79.50 && Result <= 82.49) {
			System.out.println("College Grade : Satisfactory (2.50)");
		}else if (Result >= 82.50 && Result <= 85.49) {
			System.out.println("College Grade : Satisfactory (2.25)");
		}else if (Result >= 85.50 && Result <= 88.49) {
			System.out.println("College Grade : Satisfactory (2.00)");
		}else if (Result >= 88.50 && Result <= 91.49) {
			System.out.println("College Grade : Very Good (1.75)");
		}else if (Result >= 91.50 && Result <= 94.49) {
			System.out.println("College Grade : Very Good (1.50)");
		}else if (Result >= 94.50 && Result <= 97.49) {
			System.out.println("College Grade : Very Good (1.25)");
		}else {
			System.out.println("College Grade : Excellent (1.00)");
		}
		
		

	}

}
