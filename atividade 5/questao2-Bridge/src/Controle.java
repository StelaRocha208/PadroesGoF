public abstract class Controle {

    protected Dispositivo dispositivo;

    public Controle(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void ligarDispositivo();
    public abstract void desligarDispositivo();
}
