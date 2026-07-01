package oops_practice.gcr_codebase.collection_framework;

import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
}

public class AddressBookApp {

    static ArrayList<Contact> contacts = new ArrayList<>();
    static HashMap<String, Contact> contactMap = new HashMap<>();
    static HashSet<String> phoneNumbers = new HashSet<>();

    public static void addContact(String name, String phone, String email) {

        if (phoneNumbers.contains(phone)) {
            System.out.println("Duplicate phone number. Contact not added.");
            return;
        }

        Contact contact = new Contact(name, phone, email);
        contacts.add(contact);
        contactMap.put(name, contact);
        phoneNumbers.add(phone);

        System.out.println("Contact Added Successfully.");
    }

    public static void searchContact(String name) {

        if (contactMap.containsKey(name)) {
            Contact c = contactMap.get(name);
            System.out.println(c.name + " " + c.phone + " " + c.email);
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void deleteContact(String name) {

        if (contactMap.containsKey(name)) {

            Contact c = contactMap.get(name);

            contacts.remove(c);
            contactMap.remove(name);
            phoneNumbers.remove(c.phone);

            System.out.println("Contact Deleted.");
        } else {
            System.out.println("Contact Not Found.");
        }
    }

    public static void displayContacts() {

        Collections.sort(contacts, (a, b) -> a.name.compareToIgnoreCase(b.name));

        System.out.println("\nAddress Book");

        for (Contact c : contacts) {
            System.out.println(c.name + " | " + c.phone + " | " + c.email);
        }
    }

    public static void main(String[] args) {

        addContact("Akash", "9876543210", "akash@gmail.com");
        addContact("Rahul", "9123456789", "rahul@gmail.com");
        addContact("Aman", "9988776655", "aman@gmail.com");
        addContact("Rohit", "9876543210", "rohit@gmail.com");

        searchContact("Rahul");

        deleteContact("Aman");

        displayContacts();
    }
}