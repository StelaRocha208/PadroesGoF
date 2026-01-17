package documentos.visitor;

import documentos.documento.*;


//Visitante concreto responsável pela operação de impressão.
public class ImpressaoVisitor implements Visitante {

    @Override
    public void visitarPDF(PDF pdf) {
        System.out.println("Imprimindo: " + pdf.getConteudo());
    }

    @Override
    public void visitarDOCX(DOCX docx) {
        System.out.println("Imprimindo: " + docx.getConteudo());
    }

    @Override
    public void visitarTXT(TXT txt) {
        System.out.println("Imprimindo: " + txt.getConteudo());
    }
}
