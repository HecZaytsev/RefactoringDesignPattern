package Bridge;

// Java code to demonstrate
// bridge design pattern

// abstraction in bridge pattern
abstract class Vehicle {
	protected Workshop workShop1;
	protected Workshop workShop2;

	protected Vehicle(Workshop workShop1, Workshop workShop2)
	{
		this.workShop1 = workShop1;
		this.workShop2 = workShop2;
	}

	abstract public void manufaturar();
}

// Refine abstraction 1 in bridge pattern
class Car extends Vehicle {
	public Car(Workshop workShop1, Workshop workShop2)
	{
		super(workShop1, workShop2);
	}

	@Override
	public void manufaturar()
	{
		System.out.print("Manufatura carro ");
		workShop1.work();
		workShop2.work();
	}
}

// Refine abstraction 2 in bridge pattern
class Bike extends Vehicle {
	public Bike(Workshop workShop1, Workshop workShop2)
	{
		super(workShop1, workShop2);
	}

	@Override
	public void manufaturar()
	{
		System.out.print("Manufatura Bicicleta ");
		workShop1.work();
		workShop2.work();
	}
}

// Implementor for bridge pattern
interface Workshop
{
	abstract public void work();
}

// Concrete implementation 1 for bridge pattern
class Produzir implements Workshop {
	@Override
	public void work()
	{
		System.out.print("Item produzido");
	}
}

// Concrete implementation 2 for bridge pattern
class Montar implements Workshop {
	@Override
	public void work()
	{
		System.out.print(" E");
		System.out.println(" Montado.");
	}
}

// Demonstration of bridge design pattern
public class DesignPatternBridge {

	public DesignPatternBridge(){
		
	}

	public void exemplo()
	{
		Vehicle vehicle1 = new Car(new Produzir(), new Montar());
		vehicle1.manufaturar();
		Vehicle vehicle2 = new Bike(new Produzir(), new Montar());
		vehicle2.manufaturar();
	}
}