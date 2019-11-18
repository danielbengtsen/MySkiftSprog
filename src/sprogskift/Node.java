/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sprogskift;

public class Node {
    Dog data;
    Node next;
    
    public Node(Dog dog) {
        this.data = data; 
    }
    
    public void setNext(Node node) {
        this.next = node;
    }
    
    public Node getNext() {
        return this.next;
    }
    
    public Dog getData() {
        return this.data;
    }
}
