/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enggakqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author User
 */
public class EnggakQueue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();
            queue.add("Nama Anda");
            queue.add("Nama Teman 1 Anda");
            queue.add("Nama Teman 2 Anda");
            queue.add("Nama Teman 3 Anda");
            queue.add("Nama Teman 4 Anda");
            queue.add("Nama Teman 5 Anda");

        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
            
    }
    
}
}