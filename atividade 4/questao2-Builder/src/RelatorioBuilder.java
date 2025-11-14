//interface
public interface RelatorioBuilder {
    void adicionarTitulo(String titulo);
    void adicionarCorpo(String corpo);
    void adicionarGrafico(String grafico);
    void adicionarRodape(String rodape);
    String getRelatorio();
}
