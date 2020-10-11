package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("model")
public interface ModelTests {
    @BeforeAll
    default void beforeAll() {
        System.out.println("before all model tests");
    }
}
