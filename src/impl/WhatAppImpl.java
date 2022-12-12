package impl;
import Classes.Passport;
import Classes.WhatsApp;
import Enums.Country;
import Enums.Gender;
import Enums.Status;

import java.time.LocalDate;
import java.util.ArrayList;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class WhatAppImpl implements WhatsAppService {


    @Override
    public String instAllPassport(List<Passport> users) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("User name: ");
        String userName = scanner.nextLine();
        System.out.print("Password: ");
        String password = scanner.nextLine();
//        users.add(new WhatsApp(phoneNumber,password,userName));
        return "WhatsApp successfully installed!";
    }

    @Override
    public String addContact(List<WhatsApp> users, WhatsApp myUser) {
        return null;
    }

    @Override
    public String getMessage(List<WhatsApp> users, WhatsApp myUser) {
        return null;
    }

    @Override
    public String createPassport(List<Passport> whatsApps) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Write ID: ");
        int Id = scanner1.nextInt();
        System.out.println("Write Name: ");
        String name = scanner.nextLine();
        System.out.println("Write FullName: ");
        String FullName = scanner.nextLine();
        System.out.println("Date of Birth:");
        String date = scanner.nextLine();
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8, 10));
        System.out.println("Place of Birth");
        String country = scanner.nextLine();
        Country country1 = Country.valueOf(country);
        System.out.println("Gender");
        String gender = scanner.nextLine();
        Gender gender1 = Gender.valueOf(gender);
        whatsApps.add(new Passport(Id, name, FullName, LocalDate.of(year, month, day), country1,gender1));
        return "WahtsApp successfully installed!";


    }
}
