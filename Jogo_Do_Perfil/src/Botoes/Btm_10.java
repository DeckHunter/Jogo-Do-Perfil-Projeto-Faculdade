/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import jplay.GameImage;

/**
 *
 * @author Deck
 */
public class Btm_10 extends BotaoAbstrato{
    public void btm(){
        this.Estado = false;
        this.botao = new GameImage("Img/Botoes_Img/Botoes_Num_Img/Dica - N10.jpg");
        this.conteudo = "10";

        this.botao.x = 440;
        this.botao.y = 12;

        this.botao.height = 30;
        this.botao.width = 30;
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
        if(this.Estado == false){
           this.Estado = true;
        }
    }  
}