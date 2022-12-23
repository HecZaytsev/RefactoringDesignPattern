package Builder;

public class DesignPatternBuilder {

    public DesignPatternBuilder(){

    }

    public void exemplo() {
        BankAccount newAccount = new BankAccount
          .BankAccountBuilder("Jon", "22738022275")
          .withEmail("jon@example.com")
          .wantNewsletter(true)
          .build();

        System.out.println("Name: " + newAccount.getName());
        System.out.println("AccountNumber:" + newAccount.getAccountNumber());
        System.out.println("Email: " + newAccount.getEmail());
        System.out.println("Want News letter?: " + newAccount.isNewsletter());
    }
}
