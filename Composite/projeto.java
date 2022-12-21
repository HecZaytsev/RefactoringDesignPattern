import java.util.List;

public class projeto implements item{

    private List<item> itens;

    public projeto(List<item> itens) {
        this.itens = itens;
    }

    public void addItem(item item) {
        this.itens.add(item);
    }

    @Override
    public double calcularPrecoFinal() {
        double precoFinal = 0;
        for (item item : itens) {
            precoFinal += item.calcularPrecoFinal();
            System.out.println("\nITEM " + item.calcularPrecoFinal());
        }
        return precoFinal;
    }

}
