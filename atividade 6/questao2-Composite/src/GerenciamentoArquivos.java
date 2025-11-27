// Classe responsável por simular o uso do padrão Composite
public class GerenciamentoArquivos {

    public static void main(String[] args) {

        // novos arquivos
        Arquivo arq1 = new Arquivo("foto.png");
        Arquivo arq2 = new Arquivo("documento.pdf");
        Arquivo arq3 = new Arquivo("musica.mp3");
        Arquivo arq4 = new Arquivo("anotacoes.txt");

        // novas pastas
        Pasta pastaRaiz = new Pasta("RAIZ");
        Pasta pastaImagens = new Pasta("Imagens");
        Pasta pastaDocs = new Pasta("Documentos");
        Pasta pastaMusicas = new Pasta("Músicas");

        // hierarquia
        pastaRaiz.adicionar(pastaImagens);
        pastaRaiz.adicionar(pastaDocs);
        pastaRaiz.adicionar(pastaMusicas);

        pastaImagens.adicionar(arq1);
        pastaDocs.adicionar(arq2);
        pastaMusicas.adicionar(arq3);
        pastaDocs.adicionar(arq4);

        // estrutura inicial
        System.out.println("----- ESTRUTURA INICIAL -----");
        pastaRaiz.exibir("");

        // Removendo um arquivo
        System.out.println("\nRemovendo 'anotacoes.txt' da pasta Documentos...");
        pastaDocs.remover(arq4);

        // estrutura final
        System.out.println("\n----- ESTRUTURA APÓS REMOÇÃO -----");
        pastaRaiz.exibir("");
    }
}
