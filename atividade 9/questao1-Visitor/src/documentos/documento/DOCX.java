package documentos.documento;

import documentos.visitor.Visitante;


public class DOCX implements Documento {

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarDOCX(this);
    }

    public String getConteudo() {
        return "Conteúdo do documento DOCX.";
    }
}
