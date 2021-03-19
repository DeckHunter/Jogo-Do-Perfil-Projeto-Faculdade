package Controle;

import Cartas.CartaLugar;
import Cartas.CartaObjeto;
import Cartas.CartaPessoa;
import Cartas.CartaTempo;
import jplay.GameImage;

public class MostrarCarta {
    
    public GameImage img;
 
    public CartaPessoa carta_P;
    public CartaTempo carta_T;
    public CartaLugar carta_L;
    public CartaObjeto carta_Ob;
    
    public GameImage MontarImagem(String caminho){
        
        this.img = new GameImage(caminho);
        this.img.x = 600;
        this.img.y = 0;
        
        return this.img;
    }

    public GameImage Carta(String BotaoClick ,String TemaCarta, String PalavraCarta){
   
        carta_L = new CartaLugar();
        carta_P = new CartaPessoa();
        carta_Ob = new CartaObjeto();
        carta_T = new CartaTempo();
        GameImage C = new GameImage(""); 
        
        String CaminhoCarta = new String();
        
        switch(TemaCarta){
            case "Pessoa":{
                CaminhoCarta = carta_P.IdentificarCaminho(PalavraCarta, BotaoClick);
                break;
            }
            case "Tempo":{
                CaminhoCarta = carta_T.IdentificarCaminho(PalavraCarta, BotaoClick);
                break;
            }
            case "Lugar":{
                CaminhoCarta = carta_L.IdentificarCaminho(PalavraCarta, BotaoClick);
                break;
            }
            case "Objeto":{
                CaminhoCarta = carta_Ob.IdentificarCaminho(PalavraCarta, BotaoClick);
                break;
            }
        }
        C = MontarImagem(CaminhoCarta);
        return C;
    }

}
