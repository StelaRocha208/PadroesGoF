package atendimento;


public class AtendenteConsulta implements Atendente {

    private Atendente proximo;

    @Override
    public void setProximo(Atendente proximo) {
        this.proximo = proximo;
    }

    @Override
    public void processar(Solicitacao solicitacao) {
        if (solicitacao.getTipo().equalsIgnoreCase("consulta")) {
            System.out.println("Atendente de Consulta: " + solicitacao.getMensagem());
        } else if (proximo != null) {
            proximo.processar(solicitacao);
        }
    }
}
