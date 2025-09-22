package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MonopolyTest{
    private CircularLinkedList<String> monopolyBoard;

    @BeforeEach
    public void setUp() {
        monopolyBoard = new CircularLinkedList<>();

        monopolyBoard.append("Go");
        monopolyBoard.append("Mediterranean Avenue");
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
    }

    @Test
    public void testStartingPosition() {
        assertEquals("Go", monopolyBoard.getCurrentNode());
    }

    @Test
    public void testSteps() {
        monopolyBoard.step();
        assertEquals("Mediterranean Avenue", monopolyBoard.getCurrentNode());

        monopolyBoard.step();
        monopolyBoard.step();
        monopolyBoard.step();
        assertEquals("Income Tax", monopolyBoard.getCurrentNode());
    }

    //Test it loops back to beginning
    @Test
    public void testLoop() {
        for (int i = 0; i < 40; i++) {
            monopolyBoard.step();
        }
        assertEquals("Go", monopolyBoard.getCurrentNode());
    }
}
