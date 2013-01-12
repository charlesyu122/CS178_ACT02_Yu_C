/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package threadactivity;

import java.util.ArrayList;

/**
 *
 * @author charles_yu102
 */
public class MyStack {
    ArrayList<Integer> stack;
    
    public MyStack(int size){
        stack = new ArrayList<Integer>(size);
    }
    
    // methods
    public synchronized void push(int num){
        this.stack.add(0, num);
        System.out.println("Pushed "+num);    
    }
    
    public synchronized void pop(){
        int ret = this.stack.get(0);
        this.stack.remove(0);
        System.out.println("Popped "+ret);
    }
    
    public void display(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty.");
        }
    }
}
