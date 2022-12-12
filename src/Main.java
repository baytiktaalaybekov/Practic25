import Classes.Passport;
import Classes.Profile;
import Classes.WhatsApp;
import Enums.Country;
import Enums.Gender;
import Enums.Status;
import impl.PersonImpl;
import impl.WhatAppImpl;
import impl.WhatsAppService;

import java.util.List;
import java.util.Scanner;


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        List<Profile> contacts = new ArrayList<>();
        List<Passport> passports = new ArrayList<>();
        List<WhatsApp> users = new ArrayList<>();
        WhatsApp whatsApp = new WhatsApp();
      //  whatsApp.setContacts(contacts);
        WhatAppImpl whatApp = new WhatAppImpl();
        while (true) {
            System.out.println("""
                            
                            
                    >>>>>>>>>>>>>>>     Comands     <<<<<<<<<<<<<< 
                    
                    
                    0=> Enter Whatsapp profile 
                    1=> get Passport
                    2=> Whatsapp ustanovka kyluu
                    3=> Bazada passportu bar adamdardyn baaryn 
                    4=> Message jonotuu 
                    5=> Add contact 
                    6=> Change status
                    7=> get all whatsapp status
                    8=> get all country
                    9=> get all gender
                    10=> get all whatsapp
                    11=> get person by first name
                    12=> getMessage
                            
                      Write command: """);

            int number =scanner.nextInt();

            switch (number) {
                case 9:
                    for (Gender g : Gender.values()) {
                        System.out.println(g);
                    }
                    break;
                case 7:
                    for (Status s :Status.values()) {
                        System.out.println(s);
                        break;
                    }
                case 8:
                    for (Country c : Country.values()) {
                        System.out.println(c);
                    }
                    break;
                case 1:
                    System.out.println(whatApp.createPassport(passports));
                case 2:
                    System.out.println();
            }

            }

        }

    }
