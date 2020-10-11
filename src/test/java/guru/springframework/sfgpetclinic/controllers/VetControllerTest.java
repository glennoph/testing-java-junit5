package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.Model;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.SpecialtyService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.SpecialityMapService;
import guru.springframework.sfgpetclinic.services.map.VetMapService;
import guru.springframework.sfgpetclinic.testimpl.ModelMapImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VetControllerTest {

    private SpecialityMapService specialityMapService;
    private VetService vetService;
    private VetController vetController;
    @BeforeEach
    void setUp() {
        specialityMapService = new SpecialityMapService();
        vetService = new VetMapService(specialityMapService);
        vetController = new VetController(vetService);

        // add vets to vetService
        Vet vet1 = new Vet(1l,"Doc", "Tabby", null);
        Vet vet2 = new Vet(2l,"Doc", "Beagle", null);
        vetService.save(vet1);
        vetService.save(vet2);
    }

    @Test
    void listVets() {
        Model model = new ModelMapImpl();

        String view = vetController.listVets(model);
        assertEquals("vets/index", view, "test listVets model view");
    }
}