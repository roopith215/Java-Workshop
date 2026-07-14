class PatientRegistration {
    String patientName;
    String disease;

    // Instance Initializer Block
    {
        System.out.println("Patient Registration Started");
    }

    // Default constructor
    public PatientRegistration() {
        this("Unknown", "General Checkup");
    }

    // Constructor with patient name
    public PatientRegistration(String patientName) {
        this(patientName, "Fever"); // Matching output example disease
    }

    // Constructor with patient name and disease
    public PatientRegistration(String patientName, String disease) {
        this.patientName = patientName;
        this.disease = disease;
        System.out.println("Patient: " + this.patientName);
        System.out.println("Disease: " + this.disease);
    }

    public static void main(String[] args) {
        new PatientRegistration("Rohan");
    }
}