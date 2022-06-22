package com.codedifferently.phonebook;

import com.codedifferently.person.Person;

import java.util.ArrayList;

public class PhoneBook {
    private ArrayList<Person> people;

    public PhoneBook() {
        people = new ArrayList<>();
    }

    public Integer getNumberOfPeople() {
        return people.size();
    }

    public void addPersonToPhoneBook(Person person) {
        people.add(person);

    }
    public Person findPersonByName(String firstName, String lastName) throws PersonNotFoundException{
        for (Person person:people) {
            if((person.getFirstName().equalsIgnoreCase(firstName)) && person.getLastName().equalsIgnoreCase(lastName)){
                return person;
            }
        }
        String error = String.format("person with the first name %s and lastname %s was not found",firstName,lastName);
        throw new PersonNotFoundException(error);
    }
}
