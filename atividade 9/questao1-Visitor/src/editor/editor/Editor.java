package editor.editor;

import java.util.Stack;

import editor.documento.Documento;
import editor.memento.Memento;


public class Editor {

    private Documento documento;
    private Stack<Memento> historico = new Stack<>();

    public Editor(Documento documento) {
        this.documento = documento;
    }

    public void salvarEstado() {
        historico.push(documento.salvar());
    }

    public void desfazer() {
        if (!historico.isEmpty()) {
            Memento memento = historico.pop();
            documento.restaurar(memento);
            System.out.println("Conteúdo do Documento: " + documento.getConteudo());
        } else {
            System.out.println("Conteúdo do Documento:");
            System.out.println("Nenhum estado para desfazer.");
        }
    }

    public void mostrarConteudo() {
        System.out.println("Conteúdo do Documento: " + documento.getConteudo());
    }
}
