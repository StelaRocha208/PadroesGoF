package consultas.interpretador;

import java.util.ArrayList;
import java.util.List;


//Expressão concreta do tipo WHERE
public class ConsultaWhere implements Expressao {

    private String criterio;

    public ConsultaWhere(String criterio) {
        this.criterio = criterio;
    }

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("Resultados da consulta WHERE:");

        List<String> filtrados = new ArrayList<>();

        for (String registro : contexto.getResultado()) {
            if (registro.contains(criterio)) {
                filtrados.add(registro);
            }
        }

        contexto.setResultado(filtrados);

        for (String registro : filtrados) {
            System.out.println(registro);
        }
    }
}
