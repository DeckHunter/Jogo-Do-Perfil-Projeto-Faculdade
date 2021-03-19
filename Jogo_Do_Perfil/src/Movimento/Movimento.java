
package Movimento;

import Controle.ContadorDeCasa;

public class Movimento {

    public int MovimentoPlayer(){
        if(ContadorDeCasa.getQtd_Casas_Jogador() > 0){
            return 20 - ContadorDeCasa.getQtd_Casas_Jogador();
        }else{
            return 20 + ContadorDeCasa.getQtd_Casas_Jogador();
        }
    }
    public int MovimentoMaquina(){
        return ContadorDeCasa.getQtd_Casas_Maquina();
    }
}
