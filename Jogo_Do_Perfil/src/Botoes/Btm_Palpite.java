package Botoes;

import jplay.GameImage;

public class Btm_Palpite extends BotaoAbstrato{
    public void btm(){
        this.Estado = false;
        this.botao = new GameImage("Img/Botoes_Img/Botao Palpite.jpg");
        this.conteudo = "Palpite";
        
        this.botao.x = 12;
        this.botao.y = 12;
        
        this.botao.height = 30;
        this.botao.width = 105;
    }
    
    @Override
    public void draw(){
        this.botao.draw();
    }
    
    @Override
    public GameImage getBotao(){
        return this.botao;
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
        this.Estado = false;
    }  
}
