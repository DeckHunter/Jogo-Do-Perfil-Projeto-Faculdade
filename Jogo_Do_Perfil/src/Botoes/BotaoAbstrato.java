/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Botoes;

import jplay.GameImage;
import jplay.GameObject;

public abstract class BotaoAbstrato{
    
    boolean Estado;
    String conteudo;
    GameImage botao;
    
    public abstract GameObject getBotao();
    public abstract String getConteudo();
    public abstract void draw();
    public abstract boolean BotaoEstado();
    public abstract void MudarEstado();
}
