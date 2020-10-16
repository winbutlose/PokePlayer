import java.awt.event.KeyListener;

public class PokeAIDriver{

   public static void main(String[] args) throws Exception{
      PokeAI paul = new PokeAI();
      AsyncKeyListener listener = new AsyncKeyListener();
      listener.start();
      while(true){
         Thread.sleep(100);
         paul.guess();
      }
   }
}
