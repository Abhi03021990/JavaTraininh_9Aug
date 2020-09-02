package classAndObjectEg;

import java.util.Scanner;

public class ConductExam {
	Student student=new Student();
	Exam exam =  new Exam();
	int num1;
	int num2;
	int result;

	public static void main(String[] args) {
		ConductExam conductExam = new ConductExam();
		conductExam.setExamdetails();
		conductExam.displayExamInfo();
		conductExam.generateQuestionsAndEvaluate();
		

	}

	public void setExamdetails() {
		 
		student.setStudentName("Ravish");
		exam.setExamName("Nursury Exam");
		exam.setSubjectName("Maths");
		exam.setMaxMarksPerQuestion(1);
		exam.setTotalNumberOfQuestions(5);
	}

	public int generateRandomNumber() {
		return (int) (Math.random() * 10);
	}

	public void displayExamInfo() {
		System.out.println("Hello !!" + student.getStudentName() + " welcome to " + exam.getExamName() + " "
				+ exam.getSubjectName() + " test");
	}

	public void generateQuestionsAndEvaluate() {
		for (int i = 0; i < exam.getTotalNumberOfQuestions(); i++) {
			num1 = generateRandomNumber();
			num2 = generateRandomNumber();
			Scanner input = new Scanner(System.in);

			System.out.println("Question No " + (i + 1));
			System.out.println(num1 + "+" + num2 + "= ?");
			result = input.nextInt();
			if(evaluateResult()) {
				System.out.println("Correct Answer");
			}else {
				System.out.println("Incorrect answer");
			}

		}

	}

	private boolean evaluateResult() {
		if (result == (num1 + num2)) {
			return true;
		} else {
			return false;
		}
	}

}
