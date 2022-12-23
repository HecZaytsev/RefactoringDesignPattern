package ChainOfRespostability;

public class DesignPatternChain {
    Processor chain;
    public DesignPatternChain(){

        buildChain();
    }

    //Corrente é criada
    private void buildChain() {
        chain = new NegativeProcessor(new ZeroProcessor(new PositiveProcessor(null)));
    }
    public void process(Number request) {

        chain.process(request); // Executa neste handler
        System.out.println("Processando"); 
    }
}

abstract class Processor {
    private Processor nextProcessor;
    public Processor(Processor nextProcessor){

        this.nextProcessor = nextProcessor; // Passa para proximo handler
        System.out.println("Novo processador");
    }

    public void process(Number request){
        if(nextProcessor != null)
            nextProcessor.process(request);
    }
}

class Number {
    private int number;

    public Number(int number) {

        this.number = number;
    }

    public int getNumber() {

        return number;
    }
}

class NegativeProcessor extends Processor {
    public NegativeProcessor(Processor nextProcessor){
        super(nextProcessor);
    }

    public void process(Number request) {
        if (request.getNumber() < 0) {
            System.out.println("NegativeProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

class ZeroProcessor extends Processor {
    public ZeroProcessor(Processor nextProcessor){

        super(nextProcessor);
    }

    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

class PositiveProcessor extends Processor {

    public PositiveProcessor(Processor nextProcessor){

        super(nextProcessor);
    }

    public void process(Number request) {
        if (request.getNumber() > 0) {
            System.out.println("PositiveProcessor : " + request.getNumber());
        } else {
            super.process(request);
        }
    }
}

class TestChain {
    public static void main(String[] args) {
        DesignPatternChain chain = new DesignPatternChain();

        //Classe de testes que invoca a cadeia de responsabilidades
        chain.process(new Number(90));
        chain.process(new Number(-50));
        chain.process(new Number(0));
        chain.process(new Number(91));
    }
}
