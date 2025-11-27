// Classe de teste
public class SistemaStreaming {
    public static void main(String[] args) {

        System.out.println("=== Tentando assistir sem autenticação ===");
        Video videoNaoAutenticado = new ProxyVideo("Filme: Lorax", false);
        videoNaoAutenticado.exibir();

        System.out.println("\n=== Tentando assistir com autenticação ===");
        Video videoAutenticado = new ProxyVideo("Filme: Lorax", true);
        videoAutenticado.exibir();
    }
}
