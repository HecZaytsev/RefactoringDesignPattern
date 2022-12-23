package AbstractFactory;
// A aplicação seleciona o tipo de fábrica dependendo da atual
// configuração do ambiente e cria o widget no tempo de execução
public class White implements Color {

    @Override
    public String getColor() {
        return "White";
    }

}
