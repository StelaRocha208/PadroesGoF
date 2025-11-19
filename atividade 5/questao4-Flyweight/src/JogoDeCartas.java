public class JogoDeCartas {

    public static void main(String[] args) {

        CartaFactory factory = new CartaFactory();

        Jogador jogador1 = new Jogador("João");
        Jogador jogador2 = new Jogador("Luisa");

        // Jogador 1 recebe cartas
        jogador1.receberCarta(factory.getCarta("A", "Copas"));
        jogador1.receberCarta(factory.getCarta("10", "Espadas"));
        jogador1.receberCarta(factory.getCarta("K", "Ouros"));

        // Jogador 2 recebe cartas (algumas repetidas)
        jogador2.receberCarta(factory.getCarta("A", "Copas"));  
        jogador2.receberCarta(factory.getCarta("10", "Espadas")); 
        jogador2.receberCarta(factory.getCarta("3", "Paus"));    

        // Mostrar as mãos
        jogador1.mostrarMao();
        jogador2.mostrarMao();

        System.out.println("\nTotal de cartas únicas criadas: " + factory.totalCartasCriadas());
    }
}

