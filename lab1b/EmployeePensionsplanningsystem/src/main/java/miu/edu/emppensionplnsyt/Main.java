package miu.edu.emppensionplnsyt;

import miu.edu.emppensionplnsyt.model.DataAdd;
import miu.edu.emppensionplnsyt.model.Employee;
import miu.edu.emppensionplnsyt.model.PensionPlan;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        DataAdd dataStore = new DataAdd();

                // Populate Employee data
                Employee employee1 = new Employee(1l, "Daniel", "Agar", LocalDate.of(2023,10,03), 105945.50);
                Employee employee2 = new Employee(2l, "Bernard", "Shaw", LocalDate.of(2023,10,04), 90750.00);
                dataStore.addEmployee(employee1);
                dataStore.addEmployee(employee2);

                // Populate PensionPlan data
                PensionPlan plan1 = new PensionPlan(123, LocalDate.of(2023,10,03), 100.00);
                PensionPlan plan2 = new PensionPlan(456, LocalDate.of(2023,10,04), 950.00);
                dataStore.addPensionPlan(plan1);
                dataStore.addPensionPlan(plan2);

                // Display data in a single table
                List<Employee> employees = dataStore.getAllEmployees();
                List<PensionPlan> pensionPlans = dataStore.getAllPensionPlans();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Employee and Pension Plan Table:");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("| Plan Ref. No. | First Name | Last Name | Employment Date | Enrollment Date | Monthly Contrib. |");
        System.out.println("-----------------------------------------------------------------------------------------------");

        int maxRecords = Math.max(employees.size(), pensionPlans.size());
        for (int i = 0; i < maxRecords; i++) {
            String planRefNumber = (i < pensionPlans.size()) ? pensionPlans.get(i).getPlanReferenceNumber() : "";
            String empFirstName = (i < employees.size()) ? employees.get(i).getFirstName() : "";
            String empLastName = (i < employees.size()) ? employees.get(i).getLastName() : "";

            double yearlySalary = (i < employees.size()) ? employees.get(i).getYearlySalary() : 0.0;
            String empEmploymentDate = (i < employees.size()) ? employees.get(i).getEmploymentDate().toString() : "";
            String enrollmentDate = (i < pensionPlans.size()) ? pensionPlans.get(i).getEnrollmentDate().toString() : "";
            String monthlyContribution = (i < pensionPlans.size()) ? String.valueOf(pensionPlans.get(i).getMonthlyContribution()) : "";

            System.out.printf("| %-13s | %-10s | %-9s | %-15s | %-14s | $%-15s |\n",
                    planRefNumber, empFirstName, empLastName, empEmploymentDate, enrollmentDate, monthlyContribution);
        }
        System.out.println("-----------------------------------------------------------------------------------------------");
    }
}











