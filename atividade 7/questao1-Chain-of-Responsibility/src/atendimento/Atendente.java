package atendimento;

// interface
public interface Atendente {
    void setProximo(Atendente proximo);
    void processar(Solicitacao solicitacao);
}
