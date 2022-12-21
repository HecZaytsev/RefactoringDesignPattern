package designpatterns;

/**
 *
 * @author hecto
 */
public interface Visitor { // Interface com todos metodos visitantes que serão utilizadas

    void visit(Socio socio);

    void visit(Funcionario funcionario);

    void visit(Cliente cliente);

}