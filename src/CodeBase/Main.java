package CodeBase;

import java.util.Scanner;

public class Main {
    private String idFormat = "^EMP-\\d{4}$"; // string format
    private static String employeeID;
    private static String employeeFullName;
    private static String department;
    private static double basicSalary;
    private static double overtimeHours;

    public static void main(String[] args) {
        System.out.println("Welcome to ABC Payroll System");
        displayPayroll(); // method call
        /**
         *
         * Complete the code
         */
    }

    public static void displayPayroll() { // loops until all conditions are met

        Scanner scanner = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Enter Employee ID (Format: EMP-1024: ");
                employeeID = scanner.nextLine();
                if (!employeeID.isEmpty() && employeeID.matches("^EMP-\\d{4}$")) {
                    break;
                } else {
                    System.out.println("Invalid Employee ID. Try Again.");
                }
            }

            while (true) {
                System.out.print("Enter Employee Full Name: ");
                employeeFullName = scanner.nextLine();
                if (!employeeFullName.isEmpty()) {
                    break;
                } else {
                    System.out.println("Enter Full Name");
                }
            }

            while (true) {
                System.out.print("Enter Department: ");
                department = scanner.nextLine();
                if (!department.isEmpty()) {
                    break;
                } else {
                    System.out.print("Enter Department");
                }
            }

            while (true) {
                System.out.print("Enter Basic Monthly Salary (In PHP): ");
                basicSalary = scanner.nextInt();
                if (basicSalary < 0) {
                    System.out.println("Number entered must not be negative");
                } else {
                    break;
                }
            }

            while (true) {
                System.out.print("Enter Overtime Hours: ");
                overtimeHours = scanner.nextInt();
                if (overtimeHours < 0) {
                    System.out.println("Number entered must not be negative");
                } else {
                    break;
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Try again with numbers only.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong!");
        }

        printPayslip();

        /**
         *
         * Complete the code
         */
    }

    public static void printPayslip() {


        System.out.println("\nABC Solutions - Employee Payslip (2025)");
        System.out.println("=================================");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + employeeFullName);
        System.out.println("Department: " + department);
        System.out.println(" ");
        System.out.println("EARNINGS:");
        System.out.println("=================================");

    }
}
