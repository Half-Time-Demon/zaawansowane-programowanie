/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soundtest;
import java.util.Random;
import javax.sound.sampled.*;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/**
 *
 * @author Kamil
 */
public class SoundTest {

    static byte[] generateSaple (int length){
        byte[] result = new byte[length];
        Random r = new Random();
        r.nextBytes(result);
        return result;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //SoundTest s = new SoundTest();
        byte[] sample = generateSaple (100000);
        try{

            AudioFormat audioFormat = new AudioFormat(44100.0f, 16, 1, true, false);
            AudioInputStream ain = new AudioInputStream(new ByteArrayInputStream(sample),audioFormat, sample.length / audioFormat.getFrameSize());
            DataLine.Info dataLineInfo = new DataLine.Info(SourceDataLine.class, audioFormat);
            
            SourceDataLine speaker = (SourceDataLine) AudioSystem.getLine(dataLineInfo);
            speaker.open(audioFormat);
            speaker.start();
            int cnt = 0;
            byte tempBuffer[] = new byte[10000];
            try {
                while ((cnt = ain.read(tempBuffer, 0,tempBuffer.length)) != -1) {
                    if (cnt > 0) {
                        // Write data to the internal buffer of
                        // the data line where it will be
                        // delivered to the speaker.
                        speaker.write(tempBuffer, 0, cnt);
                    }// end if
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            // Block and wait for internal buffer of the
            // data line to empty.
            speaker.drain();
            speaker.close();
        }
        catch(Exception e){
            System.out.println("ERROR:");
            e.printStackTrace();
        }
        
    }
    
}
