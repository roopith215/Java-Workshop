class CourseStudent {
    private String studentName;
    private String courseName;
    private double courseFee;
    private double discountPercent;

    // Setters
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseFee(double courseFee) {
        this.courseFee = courseFee;
    }
    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    // Getters
    public String getStudentName() {
        return studentName;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getCourseFee() {
        return courseFee;
    }
    public double getDiscountPercent() {
        return discountPercent;
    }

    // Calculation via getter logic
    public double getFinalFee() {
        return courseFee - (courseFee * discountPercent / 100.0);
    }
}

public class OnlineCourseEnrollmentSystem {
    public static void main(String[] args) {
        CourseStudent student = new CourseStudent();
        student.setStudentName("Ayush");
        student.setCourseName("Full-Stack Web Development");
        student.setCourseFee(10000);
        student.setDiscountPercent(10);

        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Course: " + student.getCourseName());
        System.out.println("Final Payable Fee: ₹" + student.getFinalFee());
    }
}