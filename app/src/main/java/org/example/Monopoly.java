package org.example;

public class Monopoly<T> {

    public static void main(String[] args) {
        CircularLinkedList<String> monopolyboard = new CircularLinkedList<String>();
        monopolyboard.add("Go");
        monopolyboard.add("Mediterranean Avenue");
        monopolyboard.add("Community Chest");
        monopolyboard.add("Baltic Avenue");
        monopolyboard.add("Income Tax");
        monopolyboard.add("Reading Railroad");
        monopolyboard.add("Oriental Avenue");
        monopolyboard.add("Chance");
        monopolyboard.add("Vermont Avenue");
        monopolyboard.add("Connecticut Avenue");
        monopolyboard.add("Jail (Just Visiting)");
        monopolyboard.add("St. Charles Place");
        monopolyboard.add("Electric Company");
        monopolyboard.add("States Avenue");
        monopolyboard.add("Virginia Avenue");
        monopolyboard.add("Pennsylvania Railroad");
        monopolyboard.add("St. James Place");
        monopolyboard.add("Community Chest");
        monopolyboard.add("Tennessee Avenue");
        monopolyboard.add("New York Avenue");
        monopolyboard.add("Free Parking");
        monopolyboard.add("Kentucky Avenue");
        monopolyboard.add("Chance");
        monopolyboard.add("Indiana Avenue");
        monopolyboard.add("Illinois Avenue");
        monopolyboard.add("B&O Railroad");
        monopolyboard.add("Atlantic Avenue");
        monopolyboard.add("Ventnor Avenue");
        monopolyboard.add("Water Works");
        monopolyboard.add("Marvin Gardens");
        monopolyboard.add("Go to Jail");
        monopolyboard.add("Pacific Avenue");
        monopolyboard.add("North Carolina Avenue");
        monopolyboard.add("Community Chest");
        monopolyboard.add("Pennsylvania Avenue");
        monopolyboard.add("Short Line Railroad");
        monopolyboard.add("Chance");
        monopolyboard.add("Park Place");
        monopolyboard.add("Luxury Tax");
        monopolyboard.add("Boardwalk");

        System.out.println(monopolyboard.location());
        monopolyboard.step();
        System.out.println(monopolyboard.location());
        monopolyboard.step();
        monopolyboard.step();
        monopolyboard.step();
        for (int i = 0; i < 37; i++)
        {
            monopolyboard.step();
        }
        System.out.println(monopolyboard.location());
    }
}
