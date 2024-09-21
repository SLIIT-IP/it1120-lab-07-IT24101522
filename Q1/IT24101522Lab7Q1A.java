import java.util.Scanner;
public class IT24101522Lab7Q1A {
	public static void main(String[] args) {

	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter marks for four subjects: ");


	double totalMarks = 0;
	for (int subject = 1; subject<=4; subject++) {
		System.out.print("Enter marks for subject " + subject + ":");

	int marks = scanner.nextInt();
	totalMarks += marks;
	}

	double averageMarks = totalMarks / 4;
	System.out.println("Average is : " + totalMarks / 4);

	String grade;

	if (averageMarks >= 75) {
		grade = "Distinction";
	}
		else if (averageMarks >= 50) {
			grade = "Credit";
		}
		else {
			grade = "Fail";
		}

	System.out.println("Overall Grade is : " + grade);
	System.out.println();
	
	scanner.close();
 }
}