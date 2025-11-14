public class RelatorioPDFBuilder implements RelatorioBuilder {
    private StringBuilder relatorio;

    public RelatorioPDFBuilder() {
        relatorio = new StringBuilder();
    }

    @Override
    public void adicionarTitulo(String titulo) {
        relatorio.append("PDF Título: ").append(titulo).append("\n");
    }

    @Override
    public void adicionarCorpo(String corpo) {
        relatorio.append("PDF Corpo: ").append(corpo).append("\n");
    }

    @Override
    public void adicionarGrafico(String grafico) {
        relatorio.append("PDF Gráfico: ").append(grafico).append("\n");
    }

    @Override
    public void adicionarRodape(String rodape) {
        relatorio.append("PDF Rodapé: ").append(rodape).append("\n");
    }

    @Override
    public String getRelatorio() {
        return relatorio.toString();
    }
}

