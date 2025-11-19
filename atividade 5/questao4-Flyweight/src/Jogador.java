import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private List<Carta> mao;

    public Jogador(String nome) {
        this.nome = nome;
        this.mao = new ArrayList<>();
    }

    public void receberCarta(Carta carta) {
        mao.add(carta);
        System.out.println(nome + " recebeu a carta: " + carta.getValor() + " de " + carta.getNaipe());
    }

    public void mostrarMao() {
        System.out.println("\nMão de " + nome + ":");
        for (Carta c : mao) {
            c.mostrarCarta();
        }
    }
}

