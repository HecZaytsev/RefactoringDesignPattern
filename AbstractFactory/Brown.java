package AbstractFactory;

// Cada produto distinto de uma família de produtos deve ter uma
// interface base.
public class Brown implements Color {

    @Override
    public String getColor() {
        return "brown";
    }

}
