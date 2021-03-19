
package Controle;

public class VerificarPalpite {
    boolean acerto = false;
    public boolean Verificar(String pp, String plv){
        
        if(pp.equals(plv)){
            acerto = true;
        }
        else{
            acerto = false;
        }
        return acerto;
    }
}
