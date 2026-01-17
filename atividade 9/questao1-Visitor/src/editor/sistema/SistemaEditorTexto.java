package editor.sistema;

import editor.documento.Documento;
import editor.editor.Editor;


//Classe de teste do editor 
public class SistemaEditorTexto {

    public static void main(String[] args) {

        Documento documento = new Documento();

        Editor editor = new Editor(documento);

        // Versão 1
        documento.setConteudo("Versão 1 do documento.");
        editor.salvarEstado();
        editor.mostrarConteudo();

        // Versão 2
        documento.setConteudo("Versão 2 do documento.");
        editor.salvarEstado();
        editor.mostrarConteudo();

        // Versão 3
        documento.setConteudo("Versão 3 do documento.");
        editor.salvarEstado();
        editor.mostrarConteudo();

        // Desfazendo alterações
        editor.desfazer(); 
        editor.desfazer(); 
        editor.desfazer(); 
    }
}
