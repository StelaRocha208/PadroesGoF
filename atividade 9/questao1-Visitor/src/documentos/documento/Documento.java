package documentos.documento;

import documentos.visitor.Visitante;


//Interface Element do padrão Visitor
public interface Documento {

    void aceitar(Visitante visitante);
}
