package biblioteca;

import java.util.ArrayList;
import java.util.List;

import iterator.Colecao;
import iterator.IteratorLivro;
import modelo.Livro;

public class Biblioteca implements Colecao {

    private List<Livro> livros = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    @Override
    public IteratorLivro criarIterator() {
        return new BibliotecaIterator(livros);
    }
}
