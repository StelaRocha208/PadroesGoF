public class Camera implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Câmera iniciada.");
    }

    @Override
    public void desligar() {
        System.out.println("Câmera desligada.");
    }
}

