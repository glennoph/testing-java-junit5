package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest implements ModelTests {
    @Test
    void dependentAssertions() {
        Owner owner = new Owner(11L, "Sam", "Sand");
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

    @DisplayName("owner value src tests ABC")
    @ParameterizedTest(name = "{displayName} - [{index}] {arguments}")
    @ValueSource(strings = {"A", "B", "C"})
    void testValueSrc(String val) {
        System.out.println("val: "+val);
    }

    @ParameterizedTest
    @DisplayName("csv source test")
    @CsvSource(value = {
            "a, 10, 12",
            "b, 20, 21",
            "c, 30, 31"
    })
    void csvSourceTest(String let, String i1, String i2) {
        System.out.println("letter:"+let+" i1:"+i1+" i2:"+i2);
    }


    @ParameterizedTest
    @DisplayName("csv file test")
    @CsvFileSource(resources = "/csvfile.csv", numLinesToSkip = 1) // csv file is in resources folder, skip first line
    void csvFileTest(String let, String i1, String i2) {
        System.out.println("letter:"+let+" i1:"+i1+" i2:"+i2);
    }


    @ParameterizedTest
    @DisplayName("custom provider test")
    @ArgumentsSource(CustomArgsProvider.class)
    void fromCustomProviderTest(String let, int i1, int i2) {
        System.out.println("letter:"+let+" i1:"+i1+" i2:"+i2);
    }

}