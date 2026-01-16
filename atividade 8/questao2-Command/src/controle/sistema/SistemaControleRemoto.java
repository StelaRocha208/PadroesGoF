package controle.sistema;

import controle.comando.*;
import controle.controle.ControleRemoto;
import controle.dispositivo.*;

/*
 * Classe de teste do sistema de controle remoto.
 * Simula o uso do controle remoto utilizando o padrão Command.
 */
public class SistemaControleRemoto {

    public static void main(String[] args) {

        Luz luz = new Luz();
        Ventilador ventilador = new Ventilador();

        Comando ligarLuz = new LigarLuz(luz);
        Comando desligarLuz = new DesligarLuz(luz);

        Comando ligarVentilador = new LigarVentilador(ventilador);
        Comando desligarVentilador = new DesligarVentilador(ventilador);

        ControleRemoto controle = new ControleRemoto();

        controle.pressionarBotao(ligarLuz);
        controle.pressionarBotao(ligarVentilador);
        controle.pressionarBotao(desligarLuz);
        controle.pressionarBotao(desligarVentilador);

        controle.pressionarDesfazer();
        controle.pressionarDesfazer();
    }
}

