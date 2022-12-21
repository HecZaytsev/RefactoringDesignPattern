package designpatterns;

/**
 *
 * @author hecto
 */

public abstract class Pessoa {

    private String nome;
    private final String endereco;
    private final String email;

    public abstract void accept(Visitor visitor); //classe abstrata accept() que recebe um objeto Visitor como parâmetro.

    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }
}