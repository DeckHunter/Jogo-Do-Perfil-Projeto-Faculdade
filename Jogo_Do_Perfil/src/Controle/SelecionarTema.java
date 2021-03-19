
package Controle;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class SelecionarTema {

    public String TemaEscolhido(){
            
        String Tema = new String();
        String caminhoAb = new File("Temas&Palavras\\Temas.txt").getAbsolutePath();
    
        Path caminho = Paths.get(caminhoAb);
        
        try {
            List<String> textArray =  Files.readAllLines(caminho);
            
            Random valor = new Random();
            int linha = valor.nextInt((3 - 0) + 1) + 0;
            Tema = textArray.get(linha);   
            
        } catch (Exception e) {
            System.out.println("Erro "+ e.getMessage());
        } 
        return Tema;
    }
}
