package exapmle3;

public class BankMachineMain {

    public static void main(String[] args) {
        CreditCard masterCard = new CreditCard(1234, "Tomas Rickus");
        BankMachine snoras = new BankMachine("Tomas", "1");
        snoras.showMenu(masterCard);

    }
}
