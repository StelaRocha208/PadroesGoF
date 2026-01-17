package documentos.visitor;

import documentos.documento.*;


//Visitante concreto responsável pela operação de visualização

public class VisualizacaoVisitor implements Visitante {

    @Override
    public void visitarPDF(PDF pdf) {
        System.out.println("Visualizando: " + pdf.getConteudo());
    }

    @Override
    public void visitarDOCX(DOCX docx) {
        System.out.println("Visualizando: " + docx.getConteudo());
    }

    @Override
    public void visitarTXT(TXT txt) {
        System.out.println("Visualizando: " + txt.getConteudo());
    }
}

