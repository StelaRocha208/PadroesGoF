package consultas.interpretador;

import java.util.ArrayList;
import java.util.List;


//Armazena os dados simulados do "banco de dados"
public class Contexto {

    private List<String> dados;
    private List<String> resultado;

    public Contexto() {
        dados = new ArrayList<>();
        resultado = new ArrayList<>();

        // Dados simulados do banco
        dados.add("produto:camiseta;preco:29.99");
        dados.add("produto:calça;preco:49.99");
        dados.add("produto:tenis;preco:99.99");
    }

    public List<String> getDados() {
        return dados;
    }

    public List<String> getResultado() {
        return resultado;
    }

    public void setResultado(List<String> resultado) {
        this.resultado = resultado;
    }
}
