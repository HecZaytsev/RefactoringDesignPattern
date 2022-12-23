package Builder;

public class DesignPatternBuilder {

    public DesignPatternBuilder(){

    }

    public void exemplo() {

      // No momento de construir objeto, utiliza de todos metódos Sets chamado pelas funções

        BankAccount newAccount = new BankAccount
          .BankAccountBuilder("Hector", "22738022275")
          .withEmail("hectoram2000@hotmail.com.com")
          .wantNewsletter(true)
          .build();

        System.out.println("Name: " + newAccount.getName());
        System.out.println("AccountNumber:" + newAccount.getAccountNumber());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Want News letter?: " + newAccount.isNewsletter());
    }
}
