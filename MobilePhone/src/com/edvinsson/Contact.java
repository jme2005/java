package com.edvinsson;

/**
 * Created by edvinj on 3/15/16.
 */
public class Contact {

    private String name = "No Name";
    private String phone = "No phone";

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    public Contact(String oneentry){
        if(oneentry.matches(".*\\d+.*")){
            this.phone = oneentry;
        }else{
            this.name = oneentry;
        }
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
