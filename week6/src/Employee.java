public class Employee {
    private String empId;
    private String empName;
    private double salary;

    public Employee(){
        this.empId = "1001";
        this.empName = "Itthisak Sasirot";
        this.salary = 15000;
    }

    public Employee(String empId, String empName, double salary){
        this.setEmpId(empId);
        this.setEmpName(empName);
        this.setSize(salary);
    }

    public void setEmpId(String empId){
        this.empId = empId;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    public void setSize(double salary){
        this.salary = salary;
    }

    public String getEmpId(){
        return this.empId;
    }

    public String getEmpName(){
        return this.empName;
    }

    public double getSalary(){
        return this.salary;
    }

    public void displayDetail(){
        System.out.println("======== Employee Detail ========");
        System.out.println(">>Employee ID : "+this.empId);
        System.out.println(">>Employee Name : "+this.empName);
        System.out.println(">>Salary : "+this.salary);
    }
}

