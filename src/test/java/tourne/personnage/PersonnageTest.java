package tourne.personnage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


import static org.junit.jupiter.api.Assertions.*;

public class PersonnageTest {
    @Test
    public void tourner_1_quart_retourne_EST() {
        Personnage personnage = new Personnage();
        String orientation = personnage.tourner(1);
        assertThat(orientation).isEqualTo("EST");
    }
    @Test
    public void tourner_2_quarts_retourne_SUD() {
        Personnage personnage = new Personnage();
        String orientation = personnage.tourner(2);
        assertThat(orientation).isEqualTo("SUD");
    }

}
