/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadactivity;

/**
 *
 * @author charles_yu102
 */
public class Popper extends Thread{
 
    MyStack s;
    
    public Popper(MyStack s){
        this.s = s;
    }

    @Override
    public void run() {
        while(!s.stack.isEmpty()){
            s.pop();
        }
    }
    
}
