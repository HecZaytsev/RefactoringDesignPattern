package State;

public class EstUSB implements iStates{
    int musica = 1;

    @Override
    public void botaoProximo() {
        musica = musica + 1 ;
    }

    @Override
    public void botaoAnterior() {
        musica = musica - 1;
    }

    @Override
    public String ExibirDisplay() {
        String Displayfinal = "USB - " + musica;
        return Displayfinal;
    }

    public EstUSB() {
        this.musica =1;
    }

    @Override
    public iStates botaoModo() {
        EstRadio radio = new EstRadio();
        return radio;
    }
}
