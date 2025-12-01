package app;

import biblioteca.Biblioteca;
import iterator.IteratorLivro;
import modelo.Livro;

//classe teste
public class SistemaBiblioteca {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        // Adicionando livros
        biblioteca.adicionarLivro(new Livro("1984", "George Orwell"));
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien"));
        biblioteca.adicionarLivro(new Livro("Dom Casmurro", "Machado de Assis"));

        System.out.println("--------------------------------------------------");

        // Criando iterador
        IteratorLivro iterator = biblioteca.criarIterator();

        // Percorrendo os livros
        while (iterator.hasNext()) {
            Livro livro = iterator.next();
            System.out.println("Título: " + livro.getTitulo() + ", Autor: " + livro.getAutor());
        }

        System.out.println("--------------------------------------------------");
    }
}
