import java.util.Scanner;
abstract class Bank{
    public String Name="myBank";
    public String IFSC="myBank123";
    public void bankDetail(){
        System.out.println("Bank_Name:"+Name+" "+"Bank_IFSC Code:"+IFSC);
    }
    abstract void Deposite();
    abstract void Withdraw();
    abstract  void checkBal();
}
class bankService extends Bank {
    private double bal = 5000;
    private int pwd;
    public double money;

    public void Deposite() {
        System.out.println("Enter Password:");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Enter Deposite Amount:");
            money = s.nextDouble();
            bal = bal + money;
            System.out.println("Deposited Money:" + money);
            System.out.println("Total Balance:" + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
    }

    public void Withdraw() {
        System.out.println("Enter Password:");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Enter Withdraw Amount:");
            money = s.nextDouble();
            bal = bal - money;
            System.out.println("Withdrawn Money:" + money);
            System.out.println("Total Balance:" + bal);
        } else {
            System.out.println("Incorrect Password...");
        }


    }

    public void checkBal() {
        System.out.println("Enter Password:");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Total Balance:" + bal);
        } else {
            System.out.println("Incorrect Password...");
        }
    }
}
class Customer{
    public static void main(String[]args){
        bankService b = new bankService();
        b.bankDetail();
        int ch;
        System.out.println("1.Deposite:");
        System.out.println("2.Withdrawn:");
        System.out.println("3.checkBalance:");
        System.out.println("\n Enter your Choice:");
        Scanner s = new Scanner(System.in);
        ch= s.nextInt();
        switch(ch) {
            case 1:
            b.Deposite();
            break;
            case 2:
            b.Withdraw();
            break;
            case 3:
            b.checkBal();
            break;
            default:
                System.out.println("Invalid Choice:");
        }
    }
}