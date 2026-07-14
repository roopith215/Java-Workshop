class StudentResult {
    private String studentName;
    private double mathMarks;
    private double scienceMarks;
    private double englishMarks;

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setMathMarks(double mathMarks) {
        this.mathMarks = mathMarks;
    }
    public void setScienceMarks(double scienceMarks) {
        this.scienceMarks = scienceMarks;
    }
    public void setEnglishMarks(double englishMarks) {
        this.englishMarks = englishMarks;
    }

    // Getters & Logic
    public double getTotalMarks() {
        return mathMarks + scienceMarks + englishMarks;
    }

    public double getAverage() {
        return getTotalMarks() / 3.0;
    }

    public char getGrade() {
        double avg = getAverage();
        if (avg >= 90) return 'A';
        if (avg >= 75) return 'B';
        if (avg >= 50) return 'C';
        return 'F'; // Fail
    }
}

public class SchoolResultSystem  {
    public static void main(String[] args) {
        StudentResult result = new StudentResult();
        result.setStudentName("Rahul");
        result.setMathMarks(85);
        result.setScienceMarks(92);
        result.setEnglishMarks(78);

        System.out.println("Total Marks: " + result.getTotalMarks());
        System.out.println("Average: " + result.getAverage());
        System.out.println("Grade: " + result.getGrade());
    }
}