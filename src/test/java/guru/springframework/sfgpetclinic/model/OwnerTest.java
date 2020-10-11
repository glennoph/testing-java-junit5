package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(11l, "Sam", "Sand");
        owner.setCity("San Jose");
        owner.setAddress("123 Main St");

        assertAll( "propterties tests",
                ()-> assertAll( "owner name tests",
                        ()-> assertEquals("Sam", owner.getFirstName(), "test first name"),
                        ()-> assertEquals("Sand", owner.getLastName(), "test last name")),
                ()-> assertAll( "Owner city/address tests",
                        ()-> assertEquals("San Jose", owner.getCity(), "test first name"),
                        ()-> assertEquals("123 Main St", owner.getAddress(), "test last name")
                )

        );
    }

}