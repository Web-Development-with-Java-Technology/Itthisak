public class BankAccount {
    private String id;
    private String name;
    private double balance;

    public BankAccount(){
        this.id = "65309010009";
        this.name = "Itthisak Sasirot";
        this.balance =1000;
    }

    public BankAccount(String id, String name, double balance){
        this.setId(id);
        this.setName(name);
        this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void deposit(double amount){
        if(amount>0){
            this.balance += amount;
        }else{
            System.out.println("Enter again");
        }
        
    }

    public void withdraw(double amount){
        if (amount<=0) {
            System.out.println("Enter again");
        }else if (amount > this.balance) {
            System.out.println("No money");
        }else{
            this.balance -= amount;
        }
    }

    public double checkBalance(){
        return this.balance;
    }
}
