package editor.memento;


//Classe Memento do padrão Memento.

public class Memento {

    // Estado salvo do documento
    private final String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}
