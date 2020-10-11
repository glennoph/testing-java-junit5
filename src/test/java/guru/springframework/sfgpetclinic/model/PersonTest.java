package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {

        person = new Person(1l, "Sam", "Sans");
        System.out.println("given person "+person.toString());
    }

    //@Test
    void groupedAssertionsFail() {
        System.out.println("then");
        assertAll(
                ()-> assertEquals("Sam ", person.getFirstName()),
                ()-> assertEquals("Sans ", person.getLastName())
        );
    }

    @Test
    void groupedAssertions() {
        System.out.println("then");
        assertAll(
                ()-> assertEquals("Sam", person.getFirstName()),
                ()-> assertEquals("Sans", person.getLastName())
        );
    }


}