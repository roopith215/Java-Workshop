class Employee {
    private String EmployeeName;
    private double salary;
    private int yearsOfService;

    // Setters
    public void setEmployeeName(String employeeName) {
        this.EmployeeName = employeeName;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    // Getters & Logic
    public double getFinalSalaryWithBonus() {
        double bonusPercentage;
        if (yearsOfService >= 10) {
            bonusPercentage = 0.20;
        } else if (yearsOfService >= 5) {
            bonusPercentage = 0.10;
        } else {
            bonusPercentage = 0.05;
        }
        return salary + (salary * bonusPercentage);
    }
}

public class EmployeeBonusSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmployeeName("Preeti");
        emp.setSalary(50000);
        emp.setYearsOfService(6);

        System.out.println("Final Salary with Bonus: ₹" + emp.getFinalSalaryWithBonus());
    }
}