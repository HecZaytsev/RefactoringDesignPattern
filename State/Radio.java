package State;

public class Radio {
   boolean ligado;
   iStates estado;
   String display;

   public void botaoproximo(){
      this.estado.botaoProximo();
}

   public void botaoanterior(){
      this.estado.botaoAnterior();
   }

   public void botaopower(){

   }

   public void botaoModo(){
      this.estado = this.estado.botaoModo();
   }

   public Radio() {
      this.estado = new EstRadio();
      this.display = this.estado.ExibirDisplay();
   }
}
