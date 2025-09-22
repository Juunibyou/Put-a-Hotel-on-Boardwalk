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
        monopolyBoard.append("Jail / Just Visiting");
        monopolyBoard.append("St. Charles Place");
        monopolyBoard.append("Electric Company");
        monopolyBoard.append("States Avenue");
        monopolyBoard.append("Virginia Avenue");
        monopolyBoard.append("Pennsylvania Railroad");
        monopolyBoard.append("St. James Place");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Tennessee Avenue");
        monopolyBoard.append("New York Avenue");
        monopolyBoard.append("Free Parking");
        monopolyBoard.append("Kentucky Avenue");
        monopolyBoard.append("Chance");
        monopolyBoard.append("Indiana Avenue");
        monopolyBoard.append("Illinois Avenue");
        monopolyBoard.append("B. & O. Railroad");
        monopolyBoard.append("Atlantic Avenue");
        monopolyBoard.append("Ventnor Avenue");
        monopolyBoard.append("Water Works");
        monopolyBoard.append("Marvin Gardens");
        monopolyBoard.append("Go To Jail");
        monopolyBoard.append("Pacific Avenue");
        monopolyBoard.append("North Carolina Avenue");
        monopolyBoard.append("Community Chest");
        monopolyBoard.append("Pennsylvania Avenue");
        monopolyBoard.append("Short Line Railroad");
        monopolyBoard.append("Chance");
        monopolyBoard.append("Park Place");
        monopolyBoard.append("Luxury Tax");
        monopolyBoard.append("Boardwalk");
    
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

        monopolyBoard.rollDice();
        System.out.println(monopolyBoard.getCurrentNode());

        monopolyBoard.rollDice();
        System.out.println(monopolyBoard.getCurrentNode());

        monopolyBoard.rollDice();
        System.out.println(monopolyBoard.getCurrentNode());
    }
}
