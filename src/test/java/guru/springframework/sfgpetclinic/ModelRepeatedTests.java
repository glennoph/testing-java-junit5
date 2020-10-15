package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.*;

@Tag("repeated")
public interface ModelRepeatedTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        //System.out.println("before all model-repeated tests");
        System.out.println("before test: "+ testInfo.getDisplayName() + " "+
                repetitionInfo.getCurrentRepetition()+"/"+
                repetitionInfo.getTotalRepetitions());
    }
}
