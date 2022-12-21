package Visitor;

/**
 *
 * @author hecto
 */
public class Socio extends Pessoa{

    public Socio(String nome, String endereco, String email) {
       super(nome, endereco, email);
    }

    @Override
    public void accept(Visitor visitor) { //função accept() nos objetos modelo criados, a função deve invocar o método visit() do objeto Visitor, passando como parâmetro o próprio objeto da classe atual
        visitor.visit(this);
    }
    
}
