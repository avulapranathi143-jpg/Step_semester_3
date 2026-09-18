package week6.assigment_problems;

public class EmpInfo {

    String empName;
    double salary;

    static String companyName =
            "Bright Horizon Technologies";

    static int employeeCount = 0;

    EmpInfo(
            String empName,
            double salary) {

        this.empName = empName;
        this.salary = salary;

        employeeCount++;
    }

    static void printCompanyInfo() {

        System.out.println(companyName);

        System.out.println(
                "Employees on record: " +
                        employeeCount
        );
    }

    public static void main(String[] args) {

        EmpInfo e1 =
                new EmpInfo("Arun", 40000);

        EmpInfo e2 =
                new EmpInfo("Priya", 50000);

        EmpInfo e3 =
                new EmpInfo("Rahul", 45000);

        EmpInfo.printCompanyInfo();
    }
}