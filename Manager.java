import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    static ArrayList<Account> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       boolean run = true;
       while (run) {
        display();
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                createAcc();
                break;
            case 2:
                checkBalance();
                break;
            case 3:
                deposit();
                break;
            case 4:
                withdraw();
                break;
            case 5:
                run = false;
                break;
            default:
                System.out.println("Enter a valid choice!");
        }
       }
    }

    static void display() {
        System.out.println("Chhose option :");
        System.out.println("1.create account");
        System.out.println("2.check balance");
        System.out.println("3.deposit");
        System.out.println("4.withraw");
        System.out.println("5.exit");
    }

    static void createAcc() {
        System.out.println("Enter name");
        sc.nextLine();
        String name = sc.nextLine();
        accounts.add(new Account(accounts.size(), name, 0.0f));
        System.out.println("Your account number is : " + (accounts.size()));
    }

    static void checkBalance() {
        System.out.println("Enter account number :");
        int a = sc.nextInt();
        if(a > accounts.size()) {
            System.out.println("Account does not exist");
        } else {
            System.out.println(accounts.get(a-1).checkBalance());
        }
    }
    static void deposit() {
        System.out.println("Enter account number :");
        int a = sc.nextInt();
        if(a > accounts.size()) {
            System.out.println("Account does not exist");
        } else {
            System.out.println("Enter amount to deposit :");
            float amount = sc.nextFloat();
            accounts.get(a-1).deposit(amount);
        }
    }

    static void withdraw() {
        System.out.println("Enter account number :");
        int a = sc.nextInt();
        if(a > accounts.size()) {
            System.out.println("Account does not exist");
        } else {
            System.out.println("Enter amount to withdraw :");
            float amount = sc.nextFloat();
            accounts.get(a-1).withdraw(amount);
        }
    }

}
