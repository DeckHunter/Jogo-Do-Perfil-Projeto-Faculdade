package Controle;

public class ContadorDeCasa {
    
    private static int Qtd_Casas_Jogador;
    private static int Qtd_Casas_Maquina;

    public static int getQtd_Casas_Jogador() {
        return Qtd_Casas_Jogador;
    }

    public static void setQtd_Casas_Jogador(int Qtd_Casas_Jogador,int i) {
        ContadorDeCasa.Qtd_Casas_Jogador = Qtd_Casas_Jogador + i;
    }

    public static int getQtd_Casas_Maquina() {
        return Qtd_Casas_Maquina;
    }

    public static void setQtd_Casas_Maquina(int Qtd_Casas_Maquina, int i) {
        ContadorDeCasa.Qtd_Casas_Maquina = Qtd_Casas_Maquina + i;
    }

   
}
