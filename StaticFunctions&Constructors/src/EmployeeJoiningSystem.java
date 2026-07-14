class EmployeeJoining {
    String name;
    String department;

    // Instance Initializer Block
    {
        System.out.println("Employee Registration Started");
    }

    // No arguments
    public EmployeeJoining() {
        this("Unknown", "Bench");
    }

    // Employee name
    public EmployeeJoining(String name) {
        this(name, "IT"); // Matching the output example department
    }

    // Employee name and department
    public EmployeeJoining(String name, String department) {
        this.name = name;
        this.department = department;
        System.out.println("Name: " + this.name);
        System.out.println("Department: " + this.department);
    }

    public static void main(String[] args) {
        new EmployeeJoining("Raj");
    }
}