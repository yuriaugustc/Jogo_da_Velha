import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class Sons {

    public static void som_botao() {
        try {
            AudioInputStream audioBotao = AudioSystem.getAudioInputStream(new File("lapis_escrevendo.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioBotao);
            clip.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void som_vitoria() {
        try {
            AudioInputStream audioVitoria = AudioSystem.getAudioInputStream(new File("vitoria.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioVitoria);
            clip.start();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void som_derrota() {
        try{
            AudioInputStream audioDerrota = AudioSystem.getAudioInputStream(new File("derrota.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioDerrota);
            clip.start();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void som_empate() {
        try{
            AudioInputStream audioEmpate = AudioSystem.getAudioInputStream(new File("empate.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioEmpate);
            clip.start();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
