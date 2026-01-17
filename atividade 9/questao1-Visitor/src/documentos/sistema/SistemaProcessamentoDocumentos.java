package documentos.sistema;

import documentos.documento.*;
import documentos.visitor.*;


//Classe de teste do sistema de processamento de documentos
public class SistemaProcessamentoDocumentos {

    public static void main(String[] args) {

        // Criação dos documentos
        Documento pdf = new PDF();
        Documento docx = new DOCX();
        Documento txt = new TXT();

        // Criação dos visitantes
        Visitante impressao = new ImpressaoVisitor();
        Visitante visualizacao = new VisualizacaoVisitor();

        // Operação de Impressão
        System.out.println("Operação de Impressão:");
        pdf.aceitar(impressao);
        docx.aceitar(impressao);
        txt.aceitar(impressao);

        // Operação de Visualização
        System.out.println("Operação de Visualização:");
        pdf.aceitar(visualizacao);
        docx.aceitar(visualizacao);
        txt.aceitar(visualizacao);
    }
}

