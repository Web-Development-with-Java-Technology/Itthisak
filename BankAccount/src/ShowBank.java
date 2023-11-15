import java.util.Scanner;
public class ShowBank {
    public static void main(String[] args) {
        Scanner ch = new Scanner(System.in);
        BankAccount bank1 = new BankAccount("65309010009", "Itthisak Sasirot", 1000 );
        System.out.println("====== Bank Account ======");
        System.out.println("ID Account : "+bank1.getId());
        System.out.println("Name       : "+bank1.getName());
        // System.out.println("Bank       : "+bank1.checkBalance());
        System.out.println("====== Menu ======");
        System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance");
        System.out.print("Please select your choice [1-3] : ");
        String choice = ch.nextLine();
        if(choice.equals("1")){
            Scanner de = new Scanner(System.in);
            System.out.print("[Deposit] Please enter amount : ");
            int amount = de.nextInt();
            bank1.deposit(amount);
        }else if(choice.equals("2")){
            Scanner de = new Scanner(System.in);
            System.out.print("[Withdraw] Please enter amount : ");
            int amount = de.nextInt();
            bank1.withdraw(amount);
        }else if(choice.equals("3")){
            System.out.println(bank1.checkBalance());
        }else{
            System.out.println("Please Again");
        }
        System.out.println("--------------------------------");
        System.out.println("Successfully");
        System.out.println("--------------------------------");
        System.out.println("Balance     :"+bank1.checkBalance());
        System.out.println("====== Thank you ======");
        // switch (choice) {
        //     case "1":
        //         Scanner de = new Scanner(System.in);
        //         System.out.print("[Deposit] Please enter amount : ");
        //         int amount = de.nextInt();
        //         bank1.deposit(amount);
        //         System.out.println(bank1.checkBalance());
        //     break;
        //     case "2":
        //         Scanner wd = new Scanner(System.in);
        //         System.out.print("[Withdraw] Please enter amount : ");
        //         int withdraw = wd.nextInt();
        //         bank1.deposit(100);
        //         System.out.println(bank1.checkBalance());
        //     break;
        //     case "3":
        //         System.out.println(bank1.checkBalance());
        //     break;
        //     default:
        //         break;
        // }

    }
}
