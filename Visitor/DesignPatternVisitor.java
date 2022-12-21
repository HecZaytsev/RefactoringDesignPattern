package Visitor;

import java.util.List;

/**
 *
 * @author hecto
 */
public class DesignPatternVisitor {

    public DesignPatternVisitor(){

    }

    public void exemplo(){
        List<Pessoa> pessoas = List.of(
            new Socio("Socio1", "EndereçoSocio1", "socio1@gmail.com"),
            new Funcionario("Funcionario1", "EndereçoFuncionario1", "Funcionario1@gmail.com"),
            new Cliente("Cliente1", "EndereçoCliente1", "Cliente1@gmail.com")
            );
    
            EnviaMailVisitor visitor = new EnviaMailVisitor();
            visitor.enviaEmails(pessoas);
    }

}
