//should we to speech recognition LOL?
//anyways, this is an AI that's gonna learn how to play pokemon i guess
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Random; 

public class PokeAI{

   Robot rob;
   Random rand;

   public PokeAI() throws Exception {
      rob = new Robot();
      rand = new Random(); 
   }
   
   public void guess() throws Exception{
      //int[] keys = {KeyEvent.VK_Z,KeyEvent.VK_X,KeyEvent.VK_S,KeyEvent.VK_A,KeyEvent.VK_I,KeyEvent.VK_K,KeyEvent.VK_J,KeyEvent.VK_L};
      int[] keys = {KeyEvent.VK_Z,KeyEvent.VK_X,KeyEvent.VK_I,KeyEvent.VK_K,KeyEvent.VK_J,KeyEvent.VK_L};
      //int[] keys = {KeyEvent.VK_I,KeyEvent.VK_K,KeyEvent.VK_J,KeyEvent.VK_L};
      int random_int = rand.nextInt(keys.length);
      System.out.println("KEYCODE="+random_int);
      rob.keyPress(keys[random_int]);
      Thread.sleep(100);
      rob.keyRelease(keys[random_int]);
   }

}