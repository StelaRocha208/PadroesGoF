package documentos.visitor;

import documentos.documento.*;


//Interface Visitor do padrão Visitor, define um método para cada tipo de documento

public interface Visitante {

    void visitarPDF(PDF pdf);

    void visitarDOCX(DOCX docx);

    void visitarTXT(TXT txt);
}

