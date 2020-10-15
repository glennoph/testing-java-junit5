package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

class PersonRepeatedTest implements ModelRepeatedTests {

    @RepeatedTest(value = 4, name = "{displayName}" )
    @DisplayName("my person repeated test")
    void myRepTest() {
        System.out.println("myRepTest code");
    }

}