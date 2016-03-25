package com.edvinsson;
import java.util.ArrayList;
/**
 * Created by edvinj on 3/15/16.
 */
public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    public void printContacts(){

        for(int i = 0; i < this.contacts.size(); i++){
            System.out.println(this.contacts.get(i).getName() + ": " + this.contacts.get(i).getPhone());
        }
    }
    public void addContact(String name, String phone){

        Contact newcontact = new Contact(name, phone);
        this.contacts.add(newcontact);
    }
    public void addContact(String entry){
        Contact newcontact = new Contact(entry);
        this.contacts.add(newcontact);
    }
    public void editContact(String arg1, String arg2){
        if(arg1.matches(".*\\d+.*")){
            changeName(arg2, arg1);
        }else{
            changeNumber(arg1, arg2);
        }
    }
    private void changeNumber(String name, String number){
        int index = getIndexName(name);
        System.out.println("Index: " + index);
        if(index >= 0) {
            this.contacts.get(index).setPhone(number);
        }else{
            System.out.println("Can't find contact");
        }
    }
    private int getIndexName(String name){
        int i = 0;
        for(Contact c : this.contacts){
            if(c.getName().equals(name)){
                return i;
            }
            i++;
        }
        return -1;
    }
    private void changeName(String name, String number){
        int index = getIndexPhone(number);
        if(index >= 0) {
            this.contacts.get(index).setName(name);
        }else{
            System.out.println("Can't find contact");
        }
    }
    private int getIndexPhone(String phone){
        int i = 0;
        for(Contact c : this.contacts){
            if(c.getPhone().equals(phone)){
                return i;
            }
            i++;
        }
        return -1;
    }
    public void deleteContact(String name){
        int index = getIndexName(name);
        if(index >= 0 ){
            this.contacts.remove(index);
            System.out.println("Contact: " + name + " was removed.");
        }else{
            System.out.println("Cannot find contact");
        }
    }
    public void findContact(String name){
        int index = getIndexName(name);
        if(index >= 0 ){
            System.out.println(this.contacts.get(index).getName() + ": " + this.contacts.get(index).getPhone());
        }else{
            System.out.println("Cannot find contact");
        }
    }
}
