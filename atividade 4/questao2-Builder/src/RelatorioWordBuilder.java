public class RelatorioWordBuilder implements RelatorioBuilder {
    private StringBuilder relatorio;

    public RelatorioWordBuilder() {
        relatorio = new StringBuilder();
    }

    @Override
    public void adicionarTitulo(String titulo) {
        relatorio.append("WORD Título: ").append(titulo).append("\n");
    }

    @Override
    public void adicionarCorpo(String corpo) {
        relatorio.append("WORD Corpo: ").append(corpo).append("\n");
    }

    @Override
    public void adicionarGrafico(String grafico) {
        relatorio.append("WORD Gráfico: ").append(grafico).append("\n");
    }

    @Override
    public void adicionarRodape(String rodape) {
        relatorio.append("WORD Rodapé: ").append(rodape).append("\n");
    }

    @Override
    public String getRelatorio() {
        return relatorio.toString();
    }
}
