package classAndObjectEg;

public class Exam {
	private String examName;
	private String subjectName;
	private int totalNumberOfQuestions;
	private int maxMarksPerQuestion;
	public String getExamName() {
		return examName;
	}
	public void setExamName(String examName) {
		this.examName = examName;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public int getTotalNumberOfQuestions() {
		return totalNumberOfQuestions;
	}
	public void setTotalNumberOfQuestions(int totalNumberOfQuestions) {
		this.totalNumberOfQuestions = totalNumberOfQuestions;
	}
	public int getMaxMarksPerQuestion() {
		return maxMarksPerQuestion;
	}
	public void setMaxMarksPerQuestion(int maxMarksPerQuestion) {
		this.maxMarksPerQuestion = maxMarksPerQuestion;
	}
	
	public int getTotalMarks() {
		return totalNumberOfQuestions*maxMarksPerQuestion;
	}
	public double calculatePercentage(int marksObtainedByStudent) {
		return (marksObtainedByStudent/(double)getTotalMarks())*100;	 
	}

}
