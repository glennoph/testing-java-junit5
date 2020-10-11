package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IndexControllerTest {

    private IndexController indexController;

    @BeforeEach
    void setUp() {
        System.out.println("setup-create index");
        indexController = new IndexController();
    }

    @AfterEach
    void tearDown() {
        System.out.println("teardown");
    }

    @Test
    void index() {
        assertEquals("index", indexController.index(), "test index");
    }

    @Test
    void oupsHandler() {
        assertEquals("notimplemented", indexController.oupsHandler(),
                ()->"lambda expression for failed oupsHandler test");
    }

    @Test
    void oopsHandlerException() throws ValueNotFoundException {
        assertThrows(ValueNotFoundException.class,
                ()->  indexController.oopsHandlerException() , "test oopsHandlerException"
        );
    }
}