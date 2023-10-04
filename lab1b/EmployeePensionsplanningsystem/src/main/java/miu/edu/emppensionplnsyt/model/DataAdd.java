package miu.edu.emppensionplnsyt.model;

import java.util.ArrayList;
import java.util.List;

public class DataAdd {
    private List<Employee> employees;
    private List<PensionPlan> pensionPlans;

    public DataAdd() {
        employees = new ArrayList<>();
        pensionPlans = new ArrayList<>();
    }

    // Add Employee to the store
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Add PensionPlan to the store
    public void addPensionPlan(PensionPlan pensionPlan) {
        pensionPlans.add(pensionPlan);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Get all pension plans
    public List<PensionPlan> getAllPensionPlans() {
        return pensionPlans;
    }
}

