import java.util.ArrayList;

public class DesignPatternComposite {

    public DesignPatternComposite(){

    }

    public void exemplo() {

        projeto projetoComputador = new projeto(new ArrayList<item>());
        projetoComputador.addItem(new produto("RAM 16 GB", 150));
        projetoComputador.addItem(new produto("PLACA DE VIDEO RTX 2060", 2000));

        projeto subProjetoPerifericos = new projeto(new ArrayList<item>());
        subProjetoPerifericos.addItem(new produto("Mouse", 34));
        subProjetoPerifericos.addItem(new produto("Teclado", 100));
        subProjetoPerifericos.addItem(new produto("Auto-falante", 300));
        projetoComputador.addItem(subProjetoPerifericos);

        projeto subProjetoDisplay = new projeto(new ArrayList<item>());
        subProjetoDisplay.addItem(new produto("CABO HDMI", 40));
        subProjetoDisplay.addItem(new produto("Monitor", 1500));

        projetoComputador.addItem(subProjetoDisplay);

        System.out.println("PRECO TOTAL DO PROJETO = " + projetoComputador.calcularPrecoFinal());
    }



}

