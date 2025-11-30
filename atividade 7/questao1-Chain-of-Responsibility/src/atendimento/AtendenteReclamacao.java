package atendimento;


public class AtendenteReclamacao implements Atendente {

    private Atendente proximo;

    @Override
    public void setProximo(Atendente proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Solicitacao solicitacao) {
        if (solicitacao.getTipo().equalsIgnoreCase("reclamacao")) {
            System.out.println("Atendente de Reclamação: " + solicitacao.getMensagem());
        } else if (proximo != null) {
            proximo.processar(solicitacao);
        }
    }
}
