package ui;

import model.Binder;

import java.util.Scanner;

public class ConsoleInterface {
    private Scanner input;
    private Binder binder;


    // EFFECTS: runs the To-do Application
    public ConsoleInterface() {
        runInterface();
    }

    // MODIFIES: this
    // EFFECTS: process user input
    private void runInterface() {
        boolean keepGoing = true;
        String command;

        init();
        while (keepGoing) {
            displayMenu();
            command = input.nextLine();
            command = command.toLowerCase().trim();

            if (command.equals("q")) {
                keepGoing = false;
            } else {
                processCommand(command);
            }
        }

        System.out.println("Have a nice day!!");
    }

    // MODIFIES: this
    // EFFECTS: initializes todoList
    private void init() {
        input = new Scanner(System.in);
        binder = new Binder();
    }

    //EFFECTS: Displays the menu of options to user
    private void displayMenu() {
        System.out.println("Select from:");
        System.out.println("\ta -> Swipe Left");
        System.out.println("\tb -> Swipe Right");
        System.out.println("\tc -> Register");
        System.out.println("\td -> Login");
        System.out.println("\te -> Show Matches");
        System.out.println("\tf -> Show People I Passed");
        System.out.println("\tg -> Show People I Liked");
        System.out.println("\th -> Show People Liked Me");
        System.out.println("\tq -> quit");
    }

    //EFFECTS: Process user command
    private void processCommand(String command) {

    }

    public void Register(){
    }

}
