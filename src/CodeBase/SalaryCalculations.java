package CodeBase;

public class SalaryCalculations {
    Payroll payrollObject = new Payroll();
    // Method to calculate overtime pay
    public double calculateOvertimePay(double basicSalary, double overtimeHours) {
        double overtimePay = ((basicSalary/160.0)*1.25) * overtimeHours;
        return overtimePay;
    }
   
    //Method to calculate gross pay
    public double calculateGrossPay(double basicSalary, double overtimePay) {
        double grossPayCalculation = basicSalary + overtimePay;
        return grossPayCalculation;
    }

    //Method to calculate total deductions
    public double totalDeductions(double sss, double philHealth, double pagIBIG, double incomeTax) {
        double totalDeductions = sss + philHealth + pagIBIG + incomeTax;
        return totalDeductions;
    }

    //Method to calculate total net pay
    public double calculateNetPay(double grossPay, double totalDeductions) {
        double netPay = grossPay - totalDeductions;
        return netPay;
    }
}
