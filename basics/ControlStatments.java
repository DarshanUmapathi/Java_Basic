package basics;

public class ControlStatments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int marks = 70;
		if(marks>100) {
			System.out.println("Invalid Marks");
		}
		else if(marks > 90 && marks<=100) {
			System.out.println("Grade A");
		}
		else if (marks>=70) {
			System.out.println("Grade B");
		}
		else if(marks>=50) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
	}

}
