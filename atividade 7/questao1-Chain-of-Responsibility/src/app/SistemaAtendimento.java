package app;

import atendimento.*;

// classe teste
public class SistemaAtendimento {
    public static void main(String[] args) {
        
        // Criando os atendentes
        Atendente consulta = new AtendenteConsulta();
        Atendente reclamacao = new AtendenteReclamacao();
        Atendente sugestao = new AtendenteSugestao();

        // cadeia de responsabilidade
        consulta.setProximo(reclamacao);
        reclamacao.setProximo(sugestao);

        // solicitações
        Solicitacao s1 = new Solicitacao("consulta", "Qual é o horário de funcionamento?");
        Solicitacao s2 = new Solicitacao("reclamacao", "O produto veio danificado.");
        Solicitacao s3 = new Solicitacao("sugestao", "Sugiro que aumentem o horário de atendimento.");
        Solicitacao s4 = new Solicitacao("outro", "Quero saber sobre promoções.");

        System.out.println("--------------------------------------------------");
        // Processando
        consulta.processar(s1);
        consulta.processar(s2);
        consulta.processar(s3);
        consulta.processar(s4); // ninguém atende → nenhuma saída
        
        System.out.println("--------------------------------------------------");
    }
}
