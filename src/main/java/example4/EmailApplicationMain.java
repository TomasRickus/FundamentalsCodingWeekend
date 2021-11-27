package example4;

import java.io.FileNotFoundException;
import java.util.List;

public class EmailApplicationMain {


    public static void main(String[] args) throws FileNotFoundException {
       List<Account> accountsList = AccountService.getAccountsFromDataBase();
       Account newEmployeeAccount = new Account("Petras", "Vasiley");
        System.out.println(newEmployeeAccount);



    }
}
