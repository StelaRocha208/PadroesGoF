public class Contrato implements Documento {
    private String titulo;
    private String corpo;
    private String clausulas;
    private String rodape;

    public Contrato(String titulo, String corpo, String clausulas, String rodape) {
        this.titulo = titulo;
        this.corpo = corpo;
        this.clausulas = clausulas;
        this.rodape = rodape;
    }

    // Construtor de cópia 
    private Contrato(Contrato contratoOriginal) {
        this.titulo = contratoOriginal.titulo;
        this.corpo = contratoOriginal.corpo;
        this.clausulas = contratoOriginal.clausulas;
        this.rodape = contratoOriginal.rodape;
    }

    @Override
    public Documento clone() {
        return new Contrato(this); // cria nova instância com os mesmos dados
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCorpo(String corpo) {
        this.corpo = corpo;
    }

    public void setClausulas(String clausulas) {
        this.clausulas = clausulas;
    }

    public void setRodape(String rodape) {
        this.rodape = rodape;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Corpo: " + corpo);
        System.out.println("Cláusulas: " + clausulas);
        System.out.println("Rodapé: " + rodape);
        System.out.println("--------------------------------------------");
    }
}
