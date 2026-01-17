package consultas.sistema;

import consultas.interpretador.ConsultaSelect;
import consultas.interpretador.ConsultaWhere;
import consultas.interpretador.Contexto;
import consultas.interpretador.Expressao;


//Classe de teste do sistema de consultas
public class SistemaConsultas {

    public static void main(String[] args) {

        Contexto contexto = new Contexto();

        // Expressão SELECT
        Expressao select = new ConsultaSelect();
        select.interpretar(contexto);

        System.out.println();

        // Expressão WHERE 
        Expressao where = new ConsultaWhere("calça");
        where.interpretar(contexto);
    }
}
