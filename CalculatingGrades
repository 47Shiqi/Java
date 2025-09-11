package javaPack;

import java.util.Scanner;

public class CalculatingGrades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the name of the corse: ");
		String courseName = input.nextLine();
		
		System.out.print("Enter the time you spent on this course per week in minutes: ");
		int time = input.nextInt();
		
		System.out.print("Enter the first homework score(enter an integer): ");
		int hw1 = input.nextInt();

		System.out.print("Enter the second homework score(enter an integer): ");
		int hw2 = input.nextInt();
		
		System.out.print("Enter the third homework score(enter an integer): ");
		int hw3 = input.nextInt();
		
		System.out.print("Enter the fourth homework score(enter an integer): ");
		int hw4 = input.nextInt();
		
		System.out.print("Enter first quiz score: ");
		double quiz1 = input.nextDouble();
		
		System.out.print("Enter second quiz score: ");
		double quiz2 = input.nextDouble();
		
		System.out.print("Enter your final exam score: ");
		double exam = input.nextDouble();
		
		System.out.println("Course name: " + courseName);
		
		int hour = time / 60;
		int min = (time % 60);
		System.out.println("Average time spent for it in a week: " + hour + " hour and " + min + " minute(s)");
		
		double avg_hw = (hw1 + hw2 + hw3 + hw4) / 4.0; 
		double avg_quiz = (quiz1 + quiz2) / 2;
		double overall = (0.35 * avg_hw) + (0.15 * avg_quiz) + (0.50 * exam);
		System.out.println("Average homework grade: " + avg_hw);
		System.out.println("Average quiz grade: " + avg_quiz);
		System.out.println("Final exam grade: " + exam);
		System.out.println("Overall grade: " + (int)overall);		
	}
}
