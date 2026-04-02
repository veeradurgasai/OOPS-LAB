class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(String name, double salary) {
        super(name);
        this.monthlySalary = salary;
    }

    double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(String name, int hours, double rate) {
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    double calculateSalary() {
        return hours * rate;
    }
}

public class pol1 {
    public static void main(String[] args) {
        Employee e;

        e = new FullTimeEmployee("Amit", 50000);
        System.out.println("Salary: " + e.calculateSalary());

        e = new PartTimeEmployee("Riya", 5, 500);
        System.out.println("Salary: " + e.calculateSalary());
    }
}