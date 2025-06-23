package CodeBase;

public class StatutoryDeductions {
    private Payroll payrollObject = new Payroll();
    private double totalSSSContribution;

    public double calculateSSSContribution(double basicSalary) {
        double baseSSSEnd = 5249.99;
        double baseSSSStart = 0;
        double baseContribution = 500;

        if (basicSalary >= baseSSSStart && basicSalary <= baseSSSEnd) {
            totalSSSContribution = baseContribution;
            return totalSSSContribution;
        }

        while (basicSalary > baseSSSEnd) {
            baseSSSStart = baseSSSEnd + 0.01;
            baseSSSEnd = baseSSSStart + 499.99;
            baseContribution += 50;

            if(basicSalary >= baseSSSStart && basicSalary <= baseSSSEnd) {
                totalSSSContribution = baseContribution;
                return totalSSSContribution;
            }
        }
        totalSSSContribution = baseContribution;
        return totalSSSContribution;
    }

    public double calculatePhilHealthContribution(double basicSalary) {
        if (basicSalary <= 10000) {
            return 250;
        } else if (basicSalary >= 100000) {
            return 2500;
        } else if (basicSalary >= 50000) {
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