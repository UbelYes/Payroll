package CodeBase;

public class SalaryCalculations {
    Payroll payrollObject = new Payroll();
    // Method to calculate overtime pay
    public double calculateOvertimePay() {

        return 0;
    }
   
    //Method to calculate gross pay
    public double calculateGrossPay(double basicSalary, double overtimePay) {
        double grossPayCalculation = basicSalary + overtimePay;
        payrollObject.setGrossPay(grossPayCalculation);
        return payrollObject.getGrossPay();
    }

    //Method to calculate total deductions
    public double totalDeductions() {
        return 0;
    }

    //Method to calculate total net pay
    public double calculateNetPay() {
        return 0;
    }
}
