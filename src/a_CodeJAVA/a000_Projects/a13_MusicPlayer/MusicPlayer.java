package a_CodeJAVA.a000_Projects.a13_MusicPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        String audioPath = "C:\\Users\\Wadoud\\IdeaProjects\\javaProjects\\src\\a_BroCodeJAVA\\a000_Projects\\a13_MusicPlayer\\pianos.wav";
        File file = new File(audioPath);

        try(Scanner in = new Scanner(System.in);
            AudioInputStream audio = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            String choice = "";
            clip.open(audio);

            while ( !choice.equals("Q") ) {

                System.out.println("P = Play");
                System.out.println("S = Stop");
                System.out.println("R = Reset");
                System.out.println("Q = Quit");

                System.out.print("Enter you choice: ");
                choice = in.nextLine().toUpperCase();

                switch (choice) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Wrong Choice");
                }
            }

        }catch (Exception e){
            System.out.println("Exception: " + e);
        }
        finally {
            System.out.println("Bye!");
        }

    }
}
