public class Director {
    private RelatorioBuilder builder;

    public Director(RelatorioBuilder builder) {
        this.builder = builder;
    }

    // Relatório completo
    public void construirRelatorioCompleto() {
        builder.adicionarTitulo("Relatório Financeiro 2025");
        builder.adicionarCorpo("Resumo de transações e desempenho anual.");
        builder.adicionarGrafico("grafico_desempenho.png");
        builder.adicionarRodape("Confidencial - Empresa X");
    }

    // Relatório resumido 
    public void construirRelatorioResumido() {
        builder.adicionarTitulo("Relatório Resumido 2025");
        builder.adicionarCorpo("Resumo resumido das transações.");
        builder.adicionarRodape("Confidencial - Empresa X");
    }
}

