package Botoes;

import jplay.GameImage;

public class Btm_1 extends BotaoAbstrato{
    
    public void btm(){
        this.Estado = false;
        this.botao = new GameImage("Img/Botoes_Img/Botoes_Num_Img/Dica - N1.jpg");
        this.conteudo = "1";
        
        this.botao.x = 125;
        this.botao.y = 12;
        
        this.botao.height = 30;
        this.botao.width = 30;
    } 
    
    @Override
    public GameImage getBotao() {
     return this.botao;   
    }
    @Override
    public void draw() {
        this.botao.draw();
    }

    @Override
    public boolean BotaoEstado() {
        return this.Estado;
    }

    @Override
    public String getConteudo() {
        return this.conteudo;
    }

    @Override
    public void MudarEstado(){
        if(Estado == false){
           Estado = true;
        }
    }   
}
