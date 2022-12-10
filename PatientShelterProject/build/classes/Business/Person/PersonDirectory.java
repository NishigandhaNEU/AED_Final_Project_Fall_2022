/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author Nishigandha
 */
public class PersonDirectory {

    ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<Person>();

        Person p1 = new Person(1, "Diksha", "4 Fruit St", "18501", 23, "Westford Park Apartment", "8605505578", "Diksha@gmail.com");
        Person p2 = new Person(2, "Smita", "2 Chemlsford st", "19701", 24, "Princeton Park Apartment", "8686858568", "Smita@gmail.com");
        Person p3 = new Person(3, "Rishi", "3 Huntington st", "12350", 25, "The Avalon Meadows Apartment", "2665488952", "Rishi@gmail.com");
        Person p4 = new Person(4, "Charu", "5 Fruit St", "02120", 23, "Westford Apartment", "56985321456", "Charu@gmail.com");
        Person p5 = new Person(5, "Vrushali", "1001 Nashua st", "18501", 29, "Princeton Park Apartment", "9850402221", "Vrushali@gmail.com");
        Person p6 = new Person(6, "Rohit", "9 Huntington st", "19701", 23, "Broadmore", "9823231201", "Rohit@gmail.com");
        Person p7 = new Person(7, "Daniel", "103 Chemlsford st", "12350", 23, "Broadmore", "9823325221", "Daniel@gmail.com");
        Person p8 = new Person(8, "Nivaldo", "76 Nashua st", "12350", 22, "Broadmore", "8669652365", "Nivaldo@gmail.com");

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);
        personList.add(p5);
        personList.add(p6);
        personList.add(p7);
        personList.add(p8);
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }

    public Person newPerson(int personID, String personName, String adress, String zipcode, int age, String communityName, String phoneNo, String email) {

        Person person = new Person(personID, personName, adress, zipcode, age, communityName, phoneNo, email);
        personList.add(person);
        return person;
    }

    public void updatePerson(Person person, String personName, String adress, String zipcode, int age, String communityName, String phoneNo, String email) {
        person.setPersonName(personName);
        person.setAdress(adress);
        person.setZipcode(zipcode);
        person.setAge(age);
        person.setCommunityName(communityName);
        person.setPhoneNo(phoneNo);
        person.setEmail(email);
    }

    public Person findPerson(int id) {

        for (Person p : personList) {

            if (p.isMatch(id)) {
                return p;
            }
        }
        return null; //not found after going through the whole list
    }

    public void deletePerson(Person person) {
        personList.remove(person);
    }

    public boolean checkIfNameIsUnique(String name) {
        for (Person p : personList) {
            if (p.getPersonName().equals(name)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfEmailIsUnique(String email) {
        for (Person p : personList) {
            if (p.getEmail().equals(email)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkIfIDIsUnique(int ID) {
        for (Person p : personList) {
            if (p.getPersonID() == ID) {
                return false;
            }
        }
        return true;
    }

}
