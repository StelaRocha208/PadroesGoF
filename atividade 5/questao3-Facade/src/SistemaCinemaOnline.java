public class SistemaCinemaOnline {

    public static void main(String[] args) {

        CinemaFacade cinema = new CinemaFacade();

        // Dados de teste
        String usuario = "maria";
        String senha = "123";
        String filme = "O jardim secreto";
        double preco = 15.90;

        cinema.assistirFilme(usuario, senha, filme, preco);
    }
}
