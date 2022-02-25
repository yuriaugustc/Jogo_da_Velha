import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class Game_Data{
	
    private static String DataPlacar() {
        Date data = new Date(System.currentTimeMillis()); // obtendo a data do sistema, aparentemente em segundos;
        SimpleDateFormat formataData = new SimpleDateFormat("dd-MM-yyyy"); // criando o formatador para o tipo especificado;
        return formataData.format(data); // formatando para String;
    }

    public static void writePvP(int valorX, int valorO){
        try {
            FileWriter File = new FileWriter("Placar_PvP_" + DataPlacar() + ".txt");
            PrintWriter Writer = new PrintWriter(File);
            Writer.printf("-----------------------------------\n");
            Writer.printf("        Dados da partida:          \n");
            Writer.printf("-----------------------------------\n");
            Writer.printf("           Time X: " + valorX + "  \n");
            Writer.printf("           Time O: " + valorO + "  \n");
            Writer.printf("-----------------------------------\n");
            File.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void writePvB(int valorX, int valorO, String level){
        try {
                FileWriter File = new FileWriter("Placar_PvB_level_"+ level + "_" + DataPlacar() + ".txt");
                PrintWriter Writer = new PrintWriter(File);
                Writer.printf("-----------------------------------\n");
                Writer.printf("        Dados da partida:          \n");
                Writer.printf("-----------------------------------\n");
                Writer.printf("  (Player) Time X: " + valorX + "  \n");
                Writer.printf("   (Bot)   Time O: " + valorO + "  \n");
                Writer.printf("-----------------------------------\n");
                File.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
