package Interface;

import Controle.MostrarCarta;
import Botoes.Btm_1;
import Botoes.Btm_10;
import Botoes.Btm_11;
import Botoes.Btm_12;
import Botoes.Btm_13;
import Botoes.Btm_14;
import Botoes.Btm_15;
import Botoes.Btm_16;
import Botoes.Btm_17;
import Botoes.Btm_18;
import Botoes.Btm_19;
import Botoes.Btm_2;
import Botoes.Btm_20;
import Botoes.Btm_3;
import Botoes.Btm_4;
import Botoes.Btm_5;
import Botoes.Btm_6;
import Botoes.Btm_7;
import Botoes.Btm_8;
import Botoes.Btm_9;


import Botoes.Btm_Palpite;
import Controle.ContadorDeCasa;
import Controle.SelecionarPalavra;
import Controle.SelecionarTema;
import Controle.VerificarPalpite;
import Movimento.Movimento;
import java.util.Scanner;
import jplay.GameImage;
import jplay.Mouse;
import jplay.Sprite;
import jplay.Window;

public class Tela_Jogo {
    
    public Btm_1 b_1 = new Btm_1();
    public Btm_2 b_2 = new Btm_2();
    public Btm_3 b_3 = new Btm_3();
    public Btm_4 b_4 = new Btm_4();
    public Btm_5 b_5 = new Btm_5();
    public Btm_6 b_6 = new Btm_6();
    public Btm_7 b_7 = new Btm_7();
    public Btm_8 b_8 = new Btm_8();
    public Btm_9 b_9 = new Btm_9();
    public Btm_10 b_10 = new Btm_10();
    public Btm_11 b_11 = new Btm_11();
    public Btm_12 b_12 = new Btm_12();
    public Btm_13 b_13 = new Btm_13();
    public Btm_14 b_14 = new Btm_14();
    public Btm_15 b_15 = new Btm_15();
    public Btm_16 b_16 = new Btm_16();
    public Btm_17 b_17 = new Btm_17();
    public Btm_18 b_18 = new Btm_18();
    public Btm_19 b_19 = new Btm_19();
    public Btm_20 b_20 = new Btm_20();
    
    public Btm_Palpite btm_P = new Btm_Palpite();
    
    public MostrarCarta IMG;
    public GameImage Carta = null;
    
    public Window janela;  
    public Mouse mouse;  
    
    GameImage backGround = new GameImage("Img/Vazio.jpg");  
    
    public VerificarPalpite Verificar_Palpite = new VerificarPalpite();
    
    public String pp;
    public Scanner scn;
    public Mensagens msg;

    public Sprite sprite_P;
    public Sprite sprite_M;
    public static SelecionarPalavra SPalavra = new SelecionarPalavra();
    public static SelecionarTema STema = new SelecionarTema();
    
    public static String Tema = new String();
    public static String Palavra = new String();

    public Movimento mov = new Movimento();
    
    public void InicarBtms(){
        btm_P.btm();
        b_1.btm();
        b_2.btm();
        b_3.btm();
        b_4.btm();
        b_5.btm();
        b_6.btm();
        b_7.btm();
        b_8.btm();
        b_9.btm();
        b_10.btm();
        b_11.btm();
        b_12.btm();
        b_13.btm();
        b_14.btm();
        b_15.btm();
        b_16.btm();
        b_17.btm();
        b_18.btm();
        b_19.btm();
        b_20.btm();    
    }
    
    public void DesenharBtms(){
        btm_P.draw();
        b_1.draw();
        b_2.draw();
        b_3.draw();
        b_4.draw();
        b_5.draw();
        b_6.draw();
        b_7.draw();
        b_8.draw();
        b_9.draw();
        b_10.draw();
        b_11.draw();
        b_12.draw();
        b_13.draw();
        b_14.draw();
        b_15.draw();
        b_16.draw();
        b_17.draw();
        b_18.draw();
        b_19.draw();
        b_20.draw();
    }
    
    public void MostrarTela(){

        IMG = new MostrarCarta();
        
        janela = new Window(800,600);  
        mouse = janela.getMouse();  
        
        backGround = new GameImage("Img/Vazio.jpg");   
        backGround.x = 0;
        janela.update();
        
        sprite_P = new Sprite("Img/Jogadores/Player.jpg");
        sprite_M = new Sprite("Img/Jogadores/Maquina.jpg");
        sprite_P.y = 115;
        sprite_P.x = 560;

        sprite_M.y = 90;
        sprite_M.x = 560;
        
        
        boolean executando = true;
        boolean Partida = true;
        IniciarJogo(executando, Partida);
    }
    
    public void IniciarJogo(boolean Rodada, boolean Partida){

        while(Partida == true){

            backGround.draw();
            InicarBtms();
            
            Tema = STema.TemaEscolhido();
            Palavra = SPalavra.PalavraEscolhida(Tema);
            String palpitePlayer = new String();
            msg = new Mensagens(); 

            sprite_P.draw();
            sprite_M.draw();
            
            janela.update();

            while(Rodada){

                DesenharBtms();
                janela.update();

                if (mouse.isOverObject(btm_P.getBotao()) && mouse.isLeftButtonPressed()){ 
                    System.out.println("Digitar Palpite : ");

                    scn = new Scanner(System.in);
                    palpitePlayer = scn.nextLine();
                    boolean confirmacao = Verificar_Palpite.Verificar(palpitePlayer, Palavra);

                    if(confirmacao == true){
                        msg.MenssagemAcerto(confirmacao);
                        Rodada = false;
                    }
                }
                if(mouse.isOverObject(b_1.getBotao()) && mouse.isLeftButtonPressed() && b_1.BotaoEstado() == false){ 
                    b_1.MudarEstado();
                    Carta = IMG.Carta(b_1.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_2.getBotao()) && mouse.isLeftButtonPressed() && b_2.BotaoEstado() == false){  
                    b_2.MudarEstado();
                    Carta = IMG.Carta(b_2.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_3.getBotao()) && mouse.isLeftButtonPressed() && b_3.BotaoEstado() == false){  
                    b_3.MudarEstado();
                    Carta = IMG.Carta(b_3.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_4.getBotao()) && mouse.isLeftButtonPressed() && b_4.BotaoEstado() == false){  
                    b_4.MudarEstado();
                    Carta = IMG.Carta(b_4.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }   
                if(mouse.isOverObject(b_5.getBotao()) && mouse.isLeftButtonPressed() && b_5.BotaoEstado() == false){ 
                    b_5.MudarEstado();
                    Carta = IMG.Carta(b_5.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();

                }
                if(mouse.isOverObject(b_6.getBotao()) && mouse.isLeftButtonPressed() && b_6.BotaoEstado() == false){  
                    b_6.MudarEstado();
                    Carta = IMG.Carta(b_6.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }   
                if(mouse.isOverObject(b_7.getBotao()) && mouse.isLeftButtonPressed() && b_7.BotaoEstado() == false){  
                    b_7.MudarEstado();
                    Carta = IMG.Carta(b_7.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_8.getBotao()) && mouse.isLeftButtonPressed() && b_8.BotaoEstado() == false){  
                    b_8.MudarEstado();
                    Carta = IMG.Carta(b_8.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }            
                if(mouse.isOverObject(b_9.getBotao()) && mouse.isLeftButtonPressed() && b_9.BotaoEstado() == false){  
                    b_9.MudarEstado();
                    Carta = IMG.Carta(b_9.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_10.getBotao()) && mouse.isLeftButtonPressed() && b_10.BotaoEstado() == false){  
                    b_10.MudarEstado();
                    Carta = IMG.Carta(b_10.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_11.getBotao()) && mouse.isLeftButtonPressed() && b_11.BotaoEstado() == false){  
                    b_11.MudarEstado();
                    Carta = IMG.Carta(b_11.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_12.getBotao()) && mouse.isLeftButtonPressed() && b_12.BotaoEstado() == false){  
                    b_12.MudarEstado(); 
                    Carta = IMG.Carta(b_12.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }   
                if(mouse.isOverObject(b_13.getBotao()) && mouse.isLeftButtonPressed() && b_13.BotaoEstado() == false){  
                    b_13.MudarEstado();
                    Carta = IMG.Carta(b_13.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_14.getBotao()) && mouse.isLeftButtonPressed() && b_14.BotaoEstado() == false){  
                    b_14.MudarEstado();
                    Carta = IMG.Carta(b_14.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }   
                if(mouse.isOverObject(b_15.getBotao()) && mouse.isLeftButtonPressed() && b_15.BotaoEstado() == false){  
                    b_15.MudarEstado();
                    Carta = IMG.Carta(b_15.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_16.getBotao()) && mouse.isLeftButtonPressed() && b_16.BotaoEstado() == false){  
                    b_16.MudarEstado();
                    Carta = IMG.Carta(b_16.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }  
                if(mouse.isOverObject(b_17.getBotao()) && mouse.isLeftButtonPressed() && b_17.BotaoEstado() == false){  
                    b_17.MudarEstado();
                    Carta = IMG.Carta(b_17.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_18.getBotao()) && mouse.isLeftButtonPressed() && b_18.BotaoEstado() == false){  
                    b_18.MudarEstado();
                    Carta = IMG.Carta(b_18.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }   
                if(mouse.isOverObject(b_19.getBotao()) && mouse.isLeftButtonPressed() && b_19.BotaoEstado() == false){  
                    b_19.MudarEstado();
                    Carta = IMG.Carta(b_19.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isOverObject(b_20.getBotao()) && mouse.isLeftButtonPressed() && b_20.BotaoEstado() == false){  
                    b_20.MudarEstado();
                    Carta = IMG.Carta(b_20.getConteudo(), Tema, Palavra);
                    Carta.draw();
                    janela.update();
                }
                if(mouse.isLeftButtonPressed() && mouse.isOverObject(Carta)){               
                    backGround.draw();
                    DesenharBtms();
                    janela.update();
                }
                if((mouse.isLeftButtonPressed() || mouse.isMiddleButtonPressed()) && mouse.isOverObject(backGround) ){
                    System.out.println("Vazio");
                }

            }

            System.out.println("Movimento Player : "+mov.MovimentoPlayer());
            System.out.println("Movimento Maquina : "+mov.MovimentoMaquina());
            
            int i = 0;
            int j = 0;
        
            while(i < mov.MovimentoPlayer()){
                
                backGround.draw();
                sprite_M.draw();
                sprite_P.draw();
                InicarBtms();
                janela.update();

                sprite_P.moveTo(20, sprite_P.y , 0.5);
                if (sprite_P.x == 20){
                    sprite_P.moveTo(sprite_P.x, 570, 0.5);
                    if(sprite_P.y == 570){
                        msg.MensasgemVitoria(true, "Jogador");
                        Partida = false;
                        sprite_P = new Sprite("");
                        sprite_M = new Sprite("");
                        backGround = new GameImage("Img/Vitoria.jpg");
                        backGround.height = 600;
                        backGround.width = 800;
                        backGround.draw();
                        janela.update();
                        break;
                    }
                } 
                i++;
            }
            while(j < mov.MovimentoMaquina()*10){
                
                backGround.draw();
                sprite_M.draw();
                sprite_P.draw();
                InicarBtms();
                janela.update();

                sprite_M.moveTo(20, sprite_M.y , 0.5);
                if (sprite_M.x == 20){
                    sprite_M.moveTo(sprite_M.x, 570, 0.5);
                    if(sprite_M.y == 570){
                        msg.MensasgemVitoria(true, "Maquina");
                        Partida = false;
                        sprite_P = new Sprite("");
                        sprite_M = new Sprite("");
                        backGround = new GameImage("Img/Derrota.jpg");
                        backGround.height = 600;
                        backGround.width = 800;
                        backGround.draw();
                        janela.update();
                        break;
                    }
                } 
                j++;
            }
            ContadorDeCasa.setQtd_Casas_Jogador(0, 0);
            ContadorDeCasa.setQtd_Casas_Maquina(0, 0);
            Rodada = true;
        }
        
     }
}
