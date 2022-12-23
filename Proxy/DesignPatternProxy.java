package Proxy;


public class DesignPatternProxy {

    public DesignPatternProxy(){

    }
    public void exemplo() {
        ExpensiveObject object = new ExpensiveObjectProxy();
        object.process();
        object.process();
    }
}
