public class Programmer extends Employee {
    private double bonus;

    public Programmer(){
        super.setEmpId("4001");
        super.setEmpName("Phet");
        super.setSize(50000);
        this.bonus = 6000;
    }

    public Programmer(double bonus){
        this.setBonus(bonus);
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus(){
        return this.bonus;
    }

    public double computerSalary(){
        return this.bonus + super.getSalary();
    }
    public void displayDetail(){
        System.out.println("======== Programmer Detail ========");
        System.out.println(">>Employee ID : "+super.getEmpId());
        System.out.println(">>Employee Name : "+super.getEmpName());
        System.out.println(">>Base Salary : "+super.getSalary());
        System.out.println("......................................");
        System.out.println(">>Bonus 2023 : "+ this.bonus);
        System.out.println(">>Total Salary : "+this.computerSalary());
    }
    public static void main(String[] args) {
        Programmer a = new Programmer();
        a.displayDetail();
    }
}
