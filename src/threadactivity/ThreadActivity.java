/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadactivity;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author charles_yu102
 */
public class ThreadActivity {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        MyStack s = new MyStack(20);
        
        Pusher pusher = new Pusher(s);
        Pusher pusher2 = new Pusher(s);
        Popper popper = new Popper(s);
        
        pusher.start();
        popper.start();
        pusher2.start();
        
        s.display();
    }
    
    
}
