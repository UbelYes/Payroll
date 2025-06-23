package CodeBase;

public class StatutoryDeductions {
    private Payroll payrollObject = new Payroll();
    private double totalSSSContribution;

    public double calculateSSSContribution() {
        double basicSalary = payrollObject.getBasicSalary();
        double startOfRangeEnd = 5249.99;
        double baseSSSEnd = 5749.99;
        double baseSSSStart= 5250;
        double baseContribution = 500;
        if (basicSalary <= baseSSSEnd){
            totalSSSContribution = baseContribution;
            return totalSSSContribution;
        }else { //TODO: fix the logic of incrementation
            while (basicSalary >= baseSSSStart && basicSalary <= baseSSSEnd){
                baseSSSStart = baseSSSStart + 500;
                baseSSSEnd = baseSSSStart + 500;
                baseContribution = baseContribution + 50;
            }
        }
        return totalSSSContribution;
    }

    public double calculatePhilHealthContribution() {
        double basicSalary = payrollObject.getBasicSalary();
        if (basicSalary <= 10000){
            return 250;
        } else if (basicSalary >= 100000){
            return 2500;
        } else if (basicSalary >= 50000){
            return 1250;
        } else {
            // Linear interpolation between ₱10,000 and ₱50,000
            return 250 + ((basicSalary - 10000) / 40000) * 1000;
        }
    }
    
    public double calculatePagIbigContribution() {

        return 0;
    }

    public double calculateIncomeTax(double grossPay) {
        return 0;
    }
}