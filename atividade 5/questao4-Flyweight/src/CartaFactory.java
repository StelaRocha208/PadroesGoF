import java.util.HashMap;
import java.util.Map;

public class CartaFactory {

    private Map<String, Carta> cartas = new HashMap<>();

    public Carta getCarta(String valor, String naipe) {
        String chave = valor + "-" + naipe;
        if (!cartas.containsKey(chave)) {
            Carta carta = new Carta(valor, naipe);
            cartas.put(chave, carta);
            System.out.println("Criando nova carta: " + valor + " de " + naipe);
        }
        return cartas.get(chave);
    }

    public int totalCartasCriadas() {
        return cartas.size();
    }
}
