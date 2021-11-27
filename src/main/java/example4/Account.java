package example4;

import java.util.Scanner;


public class Account {

    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailBoxCapacity = 500;
    private String domainName = "imone.lt";

    public Account(String firstName, String lastName, String password, String department, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.department = department;
        this.email = email;
    }

    public Account(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = assignDepartment();
        this.password = generatePassword(8);
    }


    private String generatePassword(int passwordLength) {
        String passwordSymbolSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        char[] password = new char[8];
        for (int i = 0; i < password.length; i++) {
            int randomNumber = (int) (Math.random() * passwordSymbolSet.length());
            password[i] = passwordSymbolSet.charAt(randomNumber);
        }

        return new String(password);
    }


    private String assignDepartment() {
        System.out.println("Enter the department \n 1 for Sales \n 2 for accounting \n 3 for Development ");
        Scanner scanner = new Scanner(System.in);
        int departmentSelection = scanner.nextInt();

        if (departmentSelection == 1) {
            return "Sales";
        } else if (departmentSelection == 2) {
            return "Accouting";
        } else if (departmentSelection == 3) {
            return "Development";
        } else {
            return null;
        }


    }


    @Override
    public String toString() {
        return "Account{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
