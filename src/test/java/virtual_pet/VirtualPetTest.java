package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void secondVirtualPetClass() {
        VirtualPetApplication test = new VirtualPetApplication();
    }

    @Test
    public void testOne() {
        VirtualPet testPet = new VirtualPet();
        int answer = testPet.getHunger();
        assertEquals("feedDog", answer);
    }
}
