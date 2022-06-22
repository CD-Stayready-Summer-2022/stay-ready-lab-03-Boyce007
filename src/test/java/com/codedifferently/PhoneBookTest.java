package com.codedifferently;

import com.codedifferently.person.Person;
import com.codedifferently.phonebook.PersonNotFoundException;
import com.codedifferently.phonebook.PhoneBook;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PhoneBookTest {
    @Test
    @DisplayName("get number of People test")
    public void getNumberOfPeopleTest() {
        PhoneBook phoneBook = new PhoneBook();
        Integer expected =0;
        Integer actual = phoneBook.getNumberOfPeople();
        Assertions.assertEquals(expected,actual);
    }

    @Test
    @DisplayName("add a Person Test")
    public void addPersonToPhoneBookTest() {
        PhoneBook phoneBook = new PhoneBook();
        Person person = new Person("Steve","Craig","123-456-7890");
        phoneBook.addPersonToPhoneBook(person);
        Integer expected = 1;
        Integer actual = phoneBook.getNumberOfPeople();;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Find Person By Name Test")
    public void findPersonByNameTest() throws PersonNotFoundException {
        PhoneBook phoneBook = new PhoneBook();
        Person person = new Person("Steve","Craig","123-456-7890");
        phoneBook.addPersonToPhoneBook(person);
        Person expectedPerson = person;
        Person actualPerson = phoneBook.findPersonByName("Steve","Craig");
        Assertions.assertEquals(expectedPerson,actualPerson);
    }
    @Test
    @DisplayName("FindPerson Test Fail")
    public void findPersonFailTest() {
        Assertions.assertThrows(PersonNotFoundException.class,()->{
            PhoneBook phoneBook =new PhoneBook();
            phoneBook.findPersonByName("Daniel","Boyce");
        });
    }


}
