import proxy.Account;
import proxy.BankConverterWS;
import proxy.BankService;

public class Consumer {
    public static void main(String[] args) {
        BankService proxy = new BankConverterWS().getBankServicePort();
        Account account = proxy.getAccount(5);
        System.out.println(account.getCode());
        System.out.println(account.getSolde());
        System.out.println(account.getCreationDate());

        System.out.println("----------------accout list :---------------- ");

        proxy.getAccountList().forEach(account1 -> {
            System.out.println(account1.getCode());
            System.out.println(account1.getSolde());
            System.out.println(account1.getCreationDate());
        }
        );

        System.out.println("----------------convert :---------------- ");
        double amount = 15;
        System.out.println(amount +"Euro in DH is : "+ proxy.euroToDHConverter(15));

    }
}
