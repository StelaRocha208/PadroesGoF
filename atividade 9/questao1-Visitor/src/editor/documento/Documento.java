package editor.documento;

import editor.memento.Memento;


public class Documento {

    private String conteudo;

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public Memento salvar() {
        return new Memento(conteudo);
    }

    public void restaurar(Memento memento) {
        this.conteudo = memento.getEstado();
    }
}
