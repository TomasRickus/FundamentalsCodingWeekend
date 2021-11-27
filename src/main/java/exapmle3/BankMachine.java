package exapmle3;

import java.util.Scanner;

public class BankMachine {
    private int balance;
    private int previousTransactions;
    private String customerName;
    private String customerId;

    public BankMachine(String customerName, String customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
            previousTransactions = amount;
        } else {
            System.out.println("Neigiama suma negalima!");
        }
    }

    public void showPreviousTransaction() {
        if (previousTransactions > 0) {
            System.out.println("Buvo ivesta " + previousTransactions + "euru.");
        } else if (previousTransactions < 0) {
            System.out.println("Buvo isimta " + previousTransactions + "euru.");
        } else {
            System.out.println("Jokiu operaciju nerasta.");
        }
    }

    public void withdraw(int amount) {
        if (balance > amount) {
            balance = balance - amount;
            previousTransactions = -amount;
        } else {
            System.out.println("Isimkite pinigu negalite. Jus tiek neturite.");
        }

    }

    public void showMenu(CreditCard creditCard) {

        boolean isAuthenticated = authenticate(creditCard);

        if (isAuthenticated) {
            char selection = 'X';
            Scanner scanner = new Scanner(System.in);

            printGreetingInfo();


            do { //daryk sita veiksma
                selection = printMenuSelections(scanner);

                switch (selection) {
                    case 'A':
                        System.out.println("Saskaitos likutis = " + balance);
                        System.out.println();
                        break;

                    case 'B':
                        System.out.println("Iveskite suma, kuria norite prideti: ");
                        int amountToAdd = scanner.nextInt();
                        deposit(amountToAdd);
                        System.out.println();
                        break;

                    case 'C':
                        System.out.println("Iveskite suma, kuria norite ismiti: ");
                        int amountToWithdraw = scanner.nextInt();
                        withdraw(amountToWithdraw);
                        System.out.println();
                        break;

                    case 'D':
                        System.out.println("Jusu paskutinis atliktas veiksmas: ");
                        showPreviousTransaction();
                        System.out.println();
                        break;

                    case 'E':
                        System.out.println("Aciu. Viso gero. Nepamirskite korteles");


                }

            } while (selection != 'E'); //kol sita salyga yra teisinga

        } else {
            System.out.println("Neteisingas Pin kodas! Bandykite dar karta!");
        }
    }

    private char printMenuSelections(Scanner scanner) {
        char selection;
        System.out.println("A. Saskaitos likutis ");
        System.out.println("B. Prideti pinigu ");
        System.out.println("C. Isimti pinigu ");
        System.out.println("D. Paskutinis atliktas veiksmas");
        System.out.println("E. Iseiti/exit");

        System.out.println("____________________");
        System.out.println("Pasirinkite norima operacija");
        System.out.println("____________________");
        selection = scanner.next().charAt(0);
        System.out.println();
        return selection;
    }

    private void printGreetingInfo() {
        System.out.println("Sveikiname prisijungus!");
        System.out.println("Jusu vartotojo ID yra " + customerId);
        System.out.println("Jusu vartotojo vardas yra " + customerName);
        System.out.println();
    }

    private boolean authenticate(CreditCard creditCard) {
        System.out.println("Iveskite Pin: ");
        Scanner scanner = new Scanner(System.in);
        int pinCode = scanner.nextInt();
        return pinCode == creditCard.getCardPin();

    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getPreviousTransactions() {
        return previousTransactions;
    }

    public void setPreviousTransactions(int previousTransactions) {
        this.previousTransactions = previousTransactions;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
