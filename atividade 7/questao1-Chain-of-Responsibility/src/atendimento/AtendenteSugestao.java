package atendimento;


public class AtendenteSugestao implements Atendente {

    private Atendente proximo;

    @Override
    public void setProximo(Atendente proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Solicitacao solicitacao) {
        if (solicitacao.getTipo().equalsIgnoreCase("sugestao")) {
            System.out.println("Atendente de Sugestão: " + solicitacao.getMensagem());
        } else if (proximo != null) {
            proximo.processar(solicitacao);
        }
    }
}

