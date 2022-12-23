package Proxy;

public class ExpensiveObjectImpl implements ExpensiveObject {

    public ExpensiveObjectImpl() {
        heavyInitialConfiguration();
    }

    @Override
    public void process() {
        System.out.println("Processamento completo.");
    }

    private void heavyInitialConfiguration() {
        System.out.println("Configurações iniciais..");
    }

}