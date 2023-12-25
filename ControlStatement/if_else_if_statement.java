package ControlStatement;

public class if_else_if_statement {

	public static void main(String[] args) {
// Syntax-->if(condition1){
// statement 1
// }
//	else if(condition 2) {
// statement 2
//	}
//	else if(condition 3) {
//		statement 3
//	}
//	else {
//		statement
//	}
		int marks=80;
		if (marks>=70) {
			System.out.println("Distinction");
		}
		else if(marks>=60) {
			System.out.println("First Class");
		}
		else if(marks>=55) {
			System.out.println("Higher second class");
		}
		else if(marks>=50) {
			System.out.println("Second class");
		}
		else if(marks>=40) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

	}

}
