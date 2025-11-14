public class App {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Relatórios ===\n");

        // PDF
        RelatorioBuilder pdfBuilder = new RelatorioPDFBuilder();
        Director directorPDF = new Director(pdfBuilder);
        directorPDF.construirRelatorioCompleto();
        System.out.println("PDF:\n" + pdfBuilder.getRelatorio());

        System.out.println("--------------------------------------------------");

        // HTML
        RelatorioBuilder htmlBuilder = new RelatorioHTMLBuilder();
        Director directorHTML = new Director(htmlBuilder);
        directorHTML.construirRelatorioResumido();
        System.out.println("HTML:\n" + htmlBuilder.getRelatorio());

        System.out.println("--------------------------------------------------");

        // Word
        RelatorioBuilder wordBuilder = new RelatorioWordBuilder();
        Director directorWord = new Director(wordBuilder);
        directorWord.construirRelatorioCompleto();
        System.out.println("Word:\n" + wordBuilder.getRelatorio());

        System.out.println("=== Fim dos Relatórios ===");
    }
}
