/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import jplay.GameImage;

public class Btm_Andar extends BotaoAbstrato{
    public void btm(){
        this.Estado = false;
        this.botao = new GameImage("Img/Botoes_Img/Botao Andar.jpg");
        this.conteudo = "Andar";
        
        this.botao.x = 12;
        this.botao.y = 60;
        
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
