package com.codedifferently;

import com.codedifferently.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    @DisplayName("Constructor Test")

    public void ConstructorTest01() {
        Person person = new Person("Jeff","Dew","0123456789");
        String expected = "Jeff Dew 0123456789";
        String actual = person.toString();
        Assertions.assertEquals(expected,actual);
    }
}
