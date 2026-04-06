package singleton;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class LojaBicicletasTest {

    @Test
    public void deveRetornarNomeLoja() {
        LojaBicicletas.getInstance().setNomeLoja("Bike Center");
        assertEquals("Bike Center", LojaBicicletas.getInstance().getNomeLoja());
    }

    @Test
    public void deveRetornarEndereco() {
        LojaBicicletas.getInstance().setEndereco("Rua das Bicicletas, 100");
        assertEquals("Rua das Bicicletas, 100", LojaBicicletas.getInstance().getEndereco());
    }
}