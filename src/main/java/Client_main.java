import proxy.Account;
import proxy.BankService;
import proxy.BankWS;

import java.util.List;

public class Client_main {
    public static void main(String[] args) {
        BankService stub = new BankWS().getBankServicePort();
        System.out.println(stub.conversion(5000));

        System.out.println("****************************");
        Account cp = stub.getaccount(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getBalance());
        System.out.println("****************************");

        List<Account> accounts = stub.accountList();

        accounts.forEach(ac->{
            System.out.println(ac.getCode());
            System.out.println(ac.getBalance());
            System.out.println(ac.getCreationDate());
        });

        System.out.println("****************************");
    }
}
