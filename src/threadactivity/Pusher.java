/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadactivity;

/**
 *
 * @author charles_yu102
 */
public class Pusher extends Thread{
    
    MyStack s;
    
    public Pusher(MyStack s){
        this.s = s;
    }

    @Override
    public void run() {
        for(int i=0; i<10; i++){
            s.push(i);
        }
    }
    
}
