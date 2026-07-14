class StudentAdmission {
    String collegeName;
    String studentName;
    String course;

    // Instance Initializer Block
    {
        this.collegeName = "ABC College";
        System.out.println("Admission Process Started");
    }

    // Default constructor
    public StudentAdmission() {
        this("Unknown", "General");
    }

    // Constructor with student name
    public StudentAdmission(String studentName) {
        this(studentName, "MCA"); // Matching output example course
    }

    // Constructor with student name and course
    public StudentAdmission(String studentName, String course) {
        this.studentName = studentName;
        this.course = course;
        System.out.println("College: " + this.collegeName);
        System.out.println("Student: " + this.studentName);
        System.out.println("Course: " + this.course);
    }

    public static void main(String[] args) {
        new StudentAdmission("Neha");
    }
}