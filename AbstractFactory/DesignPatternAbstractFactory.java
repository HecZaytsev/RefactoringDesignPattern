package AbstractFactory;

public class DesignPatternAbstractFactory {

    public DesignPatternAbstractFactory(){

    }

    public void exemplo() {
        AbstractFactory abstractFactory;
        
        //creating a brown toy dog
        abstractFactory = FactoryProvider.getFactory("Toy");
        Animal toy =(Animal) abstractFactory.create("Dog");
        
        abstractFactory = FactoryProvider.getFactory("Color");
        Color color =(Color) abstractFactory.create("Brown");
        
        String result = "A " + toy.getType() + " with " + color.getColor() + " color " + toy.makeSound();
        
        System.out.println(result);
    }
}
