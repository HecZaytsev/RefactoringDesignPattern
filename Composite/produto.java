public class produto implements item{

    private String nome;
    private double preco;

    public produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }


}
