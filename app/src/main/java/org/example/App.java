package org.example;

public class App {
    public static void main(String[] args){
        CircularLinkedList<String> monopolyBoard = new CircularLinkedList<>();
    
        monopolyBoard.append("Go");
        monopolyBoard.append("Mediteranean Avenue");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Baltic Avenue");
        monopolyBoard.append("Income Tax");
        monopolyBoard.append("Reading Railroad");
        monopolyBoard.append("Oriental Avenue");
        monopolyBoard.append("Chance");
        monopolyBoard.append("Vermont Avenue");
        monopolyBoard.append("Connecticut Avenue");
    
        System.out.println(monopolyBoard.getCurrentNode()); //This should print "Go" to the console
    
        monopolyBoard.step();
    
        System.out.println(monopolyBoard.getCurrentNode()); //This should print "Mediteranean Avenue" to the console
    
        monopolyBoard.step();
        monopolyBoard.step();
        monopolyBoard.step();
    
        System.out.println(monopolyBoard.getCurrentNode()); //This should print "Income Tax" to the console
    
        for(int i = 0; i < 37; i++) {
            monopolyBoard.step();
        }
    
        System.out.println(monopolyBoard.getCurrentNode()); //This should print "Mediteranean Avenue" to the console
    }
}
