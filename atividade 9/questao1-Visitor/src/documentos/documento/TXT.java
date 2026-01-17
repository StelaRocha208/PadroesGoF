package documentos.documento;

import documentos.visitor.Visitante;


public class TXT implements Documento {

    @Override
    public void aceitar(Visitante visitante) {
        visitante.visitarTXT(this);
    }

    public String getConteudo() {
        return "Conteúdo do documento TXT.";
    }
}
