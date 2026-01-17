package consultas.interpretador;

import java.util.ArrayList;
import java.util.List;


//Expressão concreta do tipo SELECT
public class ConsultaSelect implements Expressao {

    @Override
    public void interpretar(Contexto contexto) {
        System.out.println("Resultados da consulta SELECT:");

        // SELECT retorna todos os dados
        List<String> resultado = new ArrayList<>(contexto.getDados());
        contexto.setResultado(resultado);

        for (String registro : resultado) {
            System.out.println(registro);
        }
    }
}
