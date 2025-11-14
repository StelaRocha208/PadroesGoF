public class SistemaDocumentos {
    public static void main(String[] args) {

        System.out.println("=== Sistema de Modelagem de Documentos ===\n");

        // Protótipo Base
        Contrato contratoBase = new Contrato(
                "Contrato Padrão",
                "Este contrato estabelece as diretrizes gerais...",
                "Cláusula 1: ... \nCláusula 2: ...",
                "Empresa XYZ - 2025");

        System.out.println(">> Contrato Base:");
        contratoBase.exibirInformacoes();

        // clone 1
        Contrato contratoCliente1 = (Contrato) contratoBase.clone();
        contratoCliente1.setTitulo("Contrato para Cliente Marcos");
        contratoCliente1.setCorpo("Contrato personalizado para prestação de serviços de TI.");
        contratoCliente1.setRodape("Emitido para Marcos - 2025.");

        System.out.println(">> Contrato Clonado e Personalizado (Cliente Marcos):");
        contratoCliente1.exibirInformacoes();

        // clone 2
        Contrato contratoCliente2 = (Contrato) contratoBase.clone();
        contratoCliente2.setTitulo("Contrato para Cliente Bruna");
        contratoCliente2.setClausulas("Cláusula Especial: Suporte 24h incluso.\nCláusula Adicional: Treinamento mensal.");
        contratoCliente2.setRodape("Emitido para Bruna - 2025.");

        System.out.println(">> Contrato Clonado e Personalizado (Cliente Bruna):");
        contratoCliente2.exibirInformacoes();

        // Verificando se o protótipo base permaneceu intacto
        System.out.println(">> Verificando se o contrato base permaneceu inalterado:");
        contratoBase.exibirInformacoes();
    }
}

