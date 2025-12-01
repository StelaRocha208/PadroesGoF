package biblioteca;

import java.util.List;

import iterator.IteratorLivro;
import modelo.Livro;

public class BibliotecaIterator implements IteratorLivro {

    private List<Livro> livros;
    private int posicao = 0;

    public BibliotecaIterator(List<Livro> livros) {
        this.livros = livros;
    }

    @Override
    public boolean hasNext() {
        return posicao < livros.size();
    }

    @Override
    public Livro next() {
        return livros.get(posicao++);
    }
}
