package Interpreter;

import java.util.ArrayList;

public class DesignPatternInterpreter {

    public void DesignPatternInterpreter(){

    }

    public void exemplo() { 
        System.out.println("Realiza tradução de numeros romanos");
        ArrayList<NumeroRomanoInterpreter> interpretadores = new ArrayList<NumeroRomanoInterpreter>();
        interpretadores.add(new QuatroDigitosRomano());
        interpretadores.add(new TresDigitosRomano());
        interpretadores.add(new DoisDigitosRomano());
        interpretadores.add(new UmDigitoRomano());

        String numeroRomano = "XX";
        Contexto contexto = new Contexto(numeroRomano);
        for (NumeroRomanoInterpreter numeroRomanoInterpreter : interpretadores) {
            numeroRomanoInterpreter.interpretar(contexto);
        }

        System.out.println(numeroRomano + " = "
                + Integer.toString(contexto.getOutput()));
    }
}