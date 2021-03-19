/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

public class Mensagens {
    public void MenssagemAcerto(boolean confirmacao){
        if(confirmacao == true){
            System.out.println("Parabens Vc Acertou A Palavra");
        }else{
            System.out.println("Palavra Incorreta");
        }
    }
    public void MensasgemVitoria(boolean confirmacao, String vencedor){
        if(confirmacao && vencedor == "Jogador"){
            System.out.println("Parabens Vc Venceu o Jogo");
        }if(confirmacao && vencedor == "Maquina"){
            System.out.println("Infelizmente Vc Perdeu");
        }
    }
}
