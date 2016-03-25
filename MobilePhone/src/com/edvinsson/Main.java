package com.edvinsson;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static void printMenu(){

        System.out.println("0 - Print Menu");
        System.out.println("1 - Add Contact");
        System.out.println("2 - Edit Contact");
        System.out.println("3 - Delete Contact");
        System.out.println("4 - Find Contact");
        System.out.println("5 - Print Contacts");
        System.out.println("9 - Exit");
    }
    private static void addContact(MobilePhone myCell){

        System.out.println("Enter name, number, or both:\r");
        String inputstring = scanner.nextLine();
        String[] input = inputstring.split("\\s+");
        if(input.length >= 2){
            String phone = input[input.length-1];
            String name = "";
            for(int i = 0; i < input.length-1; i++){
                name += input[i] + " ";
            }

            myCell.addContact(name.trim(), phone);
        }else{
            myCell.addContact(input[0]);
        }
    }

    private static void editContact(MobilePhone myCell) {
        System.out.println("Enter name and number ending with the one to edit:");
        String[] input = scanner.nextLine().split("\\s+");
        if (input.length >= 2) {
            String phone = "";
            String name = "";
            int phoneindex = 0;
            int nameindex = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i].matches(".*\\d+.*")) {
                    phone = input[i];
                    phoneindex = i;
                } else {
                    name += input[i] + " ";
                    nameindex = i;
                }
            }
            name = name.trim();
            if (phoneindex < nameindex) {
                myCell.editContact(phone, name);
            } else {
                myCell.editContact(name, phone);
            }

        }else{
            System.out.println("Must include both name and number.");
        }
    }
    private static void deleteContact(MobilePhone myCell){

        System.out.println("Enter name of contact to delete:\r");
        String name = scanner.nextLine();
        myCell.deleteContact(name);
    }
    private static void printContact(MobilePhone myCell){
        System.out.println("Enter name of contact to print:\r");
        String name = scanner.nextLine();
        myCell.findContact(name);
    }

    private static void readInput(MobilePhone myCell){
        printMenu();
        boolean done = false;
        while(!done) {
            System.out.println("Select Option:\r");
            int n = scanner.nextInt();
            scanner.nextLine();

            switch(n){

                case 0:
                    printMenu();
                    break;
                case 1:
                    addContact(myCell);
                    break;
                case 2:
                    editContact(myCell);
                    break;
                case 3:
                    deleteContact(myCell);
                    break;
                case 4:
                    printContact(myCell);
                    break;
                case 5:
                    myCell.printContacts();
                    break;
                case 9:
                    done = true;

            }
        }
    }



    public static void main(String[] args) {
        MobilePhone myCell = new MobilePhone();
        myCell.addContact("Johan","656-924-8117");
        myCell.editContact("Johan","646-924-8117");
        myCell.printContacts();
        readInput(myCell);

        //readInput(myCell);


	// write your code here




    }
}
