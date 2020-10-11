package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Tag("model")
class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {

        person = new Person(1l, "Sam", "Sans");
        System.out.println("given person "+person.toString());
    }

    @Test
    @Disabled("failing tests")
    void groupedAssertionsFail() {
        System.out.println("then");
        assertAll(
                ()-> assertEquals("Sam ", person.getFirstName(), "test getFirstName"),
                ()-> assertEquals("Sans ", person.getLastName(), "test getLastName")
        );
    }

    @Test
    void groupedAssertions() {
        System.out.println("then test first/last name");
        assertAll(
                ()-> assertEquals("Sam", person.getFirstName(), "test getFirstName"),
                ()-> assertEquals("Sans", person.getLastName(), "test getLastName")
        );
    }


}