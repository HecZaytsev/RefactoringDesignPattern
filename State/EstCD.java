package State;

public class EstCD implements iStates{
    int faixa = 1;
    @Override
    public void botaoProximo() {
        faixa = faixa + 1;

    }

    @Override
    public void botaoAnterior() {
       faixa = faixa - 1;
    }

    @Override
    public String ExibirDisplay() {

        String Displayfinal = "CD Song - " + faixa;
        return Displayfinal;
    }

    @Override
    public iStates botaoModo() {
        EstUSB usb = new EstUSB();
        return usb;

    }

    public EstCD() {
        this.faixa = 1;
    }

}
