/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enggakstack;

import java.util.Stack;

/**
 *
 * @author User
 */
public class EnggakStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // creating stack
      Stack st = new Stack();
      
      // populating stack
      st.push("A");
      st.push("B");
      st.push("C");
      st.push("D");
      st.push("E");
      
      // removing top object
      System.out.println("Yang di Pop adalah : "+st.pop());
      
      // elements after remove
      System.out.println("Elemen setelah di Pop : "+st);
      
      st.push("F");
      st.push("G");
      
      st.pop();
      st.pop();
      st.pop();
      
      System.out.println("Yang di Pop adalah : "+st.pop());
      System.out.println("Elemen setelah di Pop : "+st);
    }
    
}
