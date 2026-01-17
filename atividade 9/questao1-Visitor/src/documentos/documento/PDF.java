package documentos.documento;

import documentos.visitor.Visitante;


public class PDF implements Documento {

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarPDF(this);
    }

    public String getConteudo() {
        return "Conteúdo do documento PDF.";
    }
}
