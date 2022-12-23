package State;

public class EstRadio implements iStates {
    double Frequencia;

    @Override
    public void botaoProximo() {

        Frequencia = Frequencia + 0.1;

    }

    @Override
    public void botaoAnterior() {
        Frequencia = Frequencia - 0.1;
    }

    @Override
    public String ExibirDisplay() {
        String fm = String.valueOf(Frequencia);
        String Displayfinal = "FM " + fm.substring(0,4);
        return Displayfinal;
    }

    @Override
    public iStates botaoModo() {
        EstCD cd = new EstCD();
        return cd;
    }

    public EstRadio() {
        Frequencia = 87.7;
    }
}
