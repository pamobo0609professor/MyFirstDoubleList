/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package container;

/**
 *
 * @author laboratorio
 */
public class List<T> {

    private int size;
    private Node<T> head;

    public List() {
        this.size = 0;
        this.head = null;
    }

    public int size() {
        return size;
    }

    public Node<T> getHead() {
        return head;
    }
    
    

    public boolean add(T data) {
        final Node<T> nNew = new Node<>(data);

        if (null == head) {
            head = nNew;
        } else {
            Node aux = head;
            while (aux.getNext() != null) {
                aux = aux.getNext();
            }
            
            aux.setNext(nNew);
            nNew.setPrev(aux);
        }

        ++size;
        return true;
    }

}
