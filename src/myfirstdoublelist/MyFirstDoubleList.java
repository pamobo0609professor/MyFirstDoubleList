/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myfirstdoublelist;

import container.List;

/**
 *
 * @author laboratorio
 */
public class MyFirstDoubleList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        List theList = new List();
        theList.add(2);
        theList.add("ikdas");
        theList.add(true);
        theList.add(0.4);
        theList.add('L');
        
        System.out.println(theList.size());
        System.out.println(theList.getHead().getNext().getNext().getNext().getNext());
    }
    
}
