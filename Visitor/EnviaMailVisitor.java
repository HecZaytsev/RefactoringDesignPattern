package designpatterns;

import java.util.List;

/**
 *
 * @author hecto
 */
public class EnviaMailVisitor implements Visitor{
    
    public void enviaEmails(List<Pessoa> pessoas) {
        for (Pessoa pessoa : pessoas) {
            pessoa.accept(this);
        }
    }
    // lógica de negócio para cada situação, sobrescrevendo a função
    // visit() herdada da classe Visitor.
    
    @Override
    public void visit(Socio socio) {
        System.out.println("Envia E-mail no formato específico para sócios");
    }

    @Override
    public void visit(Funcionario funcionario) {
        System.out.println("Envia E-mail no formato específico para funcionarios");
    }

    @Override
    public void visit(Cliente cliente) {
        System.out.println("Envia E-mail no formato específico para clientes");    
    }
    
}
