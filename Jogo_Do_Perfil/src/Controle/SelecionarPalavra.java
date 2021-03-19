
package Controle;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class SelecionarPalavra {
    String PalavraEscolhida = new String();
    
    String caminho_Objeto = new File("Temas&Palavras\\Objeto.txt").getAbsolutePath();
    String caminho_Lugar = new File("Temas&Palavras\\Lugar.txt").getAbsolutePath();
    String caminho_Pessoa = new File("Temas&Palavras\\Pessoa.txt").getAbsolutePath();
    String caminho_Tempo = new File("Temas&Palavras\\Tempo.txt").getAbsolutePath();
    
    Random valor = new Random();
    int linha = valor.nextInt((3 - 0) + 1) + 0;
    
    public String PalavraEscolhida(String Tema){
        
        try {
            switch(Tema){
                case "Pessoa":{
                    Path caminho = Paths.get(caminho_Pessoa);
                    List<String> PalavrasArray =  Files.readAllLines(caminho);
                    PalavraEscolhida = PalavrasArray.get(linha);
                    break;
                }
                case "Tempo":{
                    Path caminho = Paths.get(caminho_Tempo);
                    List<String> PalavrasArray =  Files.readAllLines(caminho);
                    PalavraEscolhida = PalavrasArray.get(linha);
                    break;
                }
                case "Lugar":{
                    Path caminho = Paths.get(caminho_Lugar);
                    List<String> PalavrasArray =  Files.readAllLines(caminho);
                    PalavraEscolhida = PalavrasArray.get(linha);
                    break;
                }
                case "Objeto":{
                    Path caminho = Paths.get(caminho_Objeto);
                    List<String> PalavrasArray =  Files.readAllLines(caminho);
                    PalavraEscolhida = PalavrasArray.get(linha);
                    break;
                }                 
            }
        } catch (IOException e) {
            System.out.println("Erro "+ e.getMessage());
        }
        
        return PalavraEscolhida;
    }
}
