
package Movimento;

import jplay.GameImage;
import jplay.Sprite;
import jplay.Window;

public class MovimentoCompetidores {
    public void MoveCompetidores(int Mov_Player, int Mov_Maquina, Window wind, Sprite P, Sprite M){
        
       
        int evento = 0;
        
        while(evento < 100){
                P.draw();
                wind.update();
                
                P.moveTo(150, P.y , 1);

                if (P.x == 100){
                    P.moveTo(P.x, 500, 1);
                    
                } 
                if(P.y == 500){
                    P.moveTo(700, P.y , 1);
                }
                
                wind.delay(4);
                evento++;
        }
        evento = 0;
        
        while(evento < Mov_Maquina){
            M.draw();
            wind.update();

            M.moveTo(150, P.y , 1);

            if (M.x == 100){
                M.moveTo(M.x, 500, 1);

            } 
            if(M.y == 500){
                M.moveTo(700, M.y , 1);
            }
            wind.delay(4);
            evento++;
        }
    }
}
