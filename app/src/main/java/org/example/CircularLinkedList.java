package org.example;

public class CircularLinkedList<T> {
    private Node<T> start;
    private Node<T> end;
    private Node<T> current;

    public CircularLinkedList(){
        start = null;
        end = null;
        current = null;
    }
    
    public void append(T data){ //The ability to append new nodes
        Node<T> newNode = new Node<>(data);

        if(start == null){ //if empty
            start = newNode;
            end = newNode;
            current = start;
            newNode.next = start;
        }
        else { //add to the end
            end.next = newNode;
            end = newNode;
            end.next = start;
        }
    }

    public void step(){ //Moving a step
        if(current != null){
            current = current.next;
        }
    }

    public T getCurrentNode(){ //Getting the data stored at this node
        if(current != null){return current.data;}
        else{return null;}

    }

    public void rollDice(){ //Just rolling 2 dice to see how many Step() are made
        int roll1 = (int)(Math.random() * 6) + 1;
        int roll2 = (int)(Math.random() * 6) + 1;
        int rolltotal = roll1 + roll2;

        System.out.println("You have rolled: '" + roll1 + "' and '" + roll2 + "' = '" + rolltotal);

        for(int i = 0; i < rolltotal; i++){
            step();
        }
    }

}
