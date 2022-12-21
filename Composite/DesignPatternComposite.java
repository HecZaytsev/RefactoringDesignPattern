import java.util.ArrayList;

public class DesignPatternComposite {

    public DesignPatternComposite(){

    }

    public void exemplo() {

        projeto projetoLan = new projeto(new ArrayList<item>());
        projetoLan.addItem(new produto("RAM 256", 100));
        projetoLan.addItem(new produto("RAM 512", 150));
        projetoLan.addItem(new produto("PLACA DE VIDEO A4500", 2000));

        projeto subProjetoServidorLan = new projeto(new ArrayList<item>());
        subProjetoServidorLan.addItem(new produto("RAM 1024", 250));
        subProjetoServidorLan.addItem(new produto("RAM 1024", 250));
        subProjetoServidorLan.addItem(new produto("PLACA DE VIDEO B8900", 4000));
        projetoLan.addItem(subProjetoServidorLan);

        projeto subProjetoCabeamentoLan = new projeto(new ArrayList<item>());
        subProjetoCabeamentoLan.addItem(new produto("CABO CAT 5E 500M", 1400));
        subProjetoCabeamentoLan.addItem(new produto("CONECTORES RJ45 x 100", 1500));

        projetoLan.addItem(subProjetoCabeamentoLan);

        System.out.println("PRECO TOTAL DO PROJETO = " + projetoLan.calcularPrecoFinal());
    }



}

