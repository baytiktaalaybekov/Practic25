package Classes;

import Enums.Status;

import java.util.ArrayList;
import java.util.List;

public class WhatsApp{
    private String phoneNumber;
    private String password;
    private String userName;
    private Status status=Status.HI_I_USE_WHATSAPP;
    private List<Contact> contacts;


    public WhatsApp(String phoneNumber, String password, String userName, Status status, List<Contact> contacts) {
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.userName = userName;
        this.status = status;
        this.contacts = contacts;
    }




    public WhatsApp() {


}

    public WhatsApp(String phoneNumber, String password, String userName) {
    }

    public void addContact(Contact contact){
        if (contacts == null ){
            contacts = new ArrayList<>();
        }
        contacts.add(contact);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
