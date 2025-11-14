public class RelatorioHTMLBuilder implements RelatorioBuilder {
    private StringBuilder relatorio;

    public RelatorioHTMLBuilder() {
        relatorio = new StringBuilder();
        relatorio.append("<html><body>\n");
    }

    @Override
    public void adicionarTitulo(String titulo) {
        relatorio.append("<h1>").append(titulo).append("</h1>\n");
    }

    @Override
    public void adicionarCorpo(String corpo) {
        relatorio.append("<p>").append(corpo).append("</p>\n");
    }

    @Override
    public void adicionarGrafico(String grafico) {
        relatorio.append("<img src='").append(grafico).append("' alt='Gráfico'/>\n");
    }

    @Override
    public void adicionarRodape(String rodape) {
        relatorio.append("<footer>").append(rodape).append("</footer>\n");
    }

    @Override
    public String getRelatorio() {
        relatorio.append("</body></html>");
        return relatorio.toString();
    }
}

