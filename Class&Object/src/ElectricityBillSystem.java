class ElectricityBill {
    private String customerName;
    private int unitsConsumed;
    private double pricePerUnit;

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    // Getters & Logic
    public String getCustomerName() {
        return customerName;
    }
    public int getUnitsConsumed() {
        return unitsConsumed;
    }
    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalBill() {
        double totalBill = unitsConsumed * pricePerUnit;
        if (unitsConsumed > 500) {
            totalBill += totalBill * 0.10; // 10% surcharge
        }
        return totalBill;
    }
}

public class ElectricityBillSystem {
    public static void main(String[] args) {
        ElectricityBill bill = new ElectricityBill();
        bill.setCustomerName("Amit Sharma");
        bill.setUnitsConsumed(550);
        bill.setPricePerUnit(7.5);

        System.out.println("Customer: " + bill.getCustomerName());
        System.out.println("Total Bill (with surcharge if applicable): ₹" + bill.getTotalBill());
    }
}