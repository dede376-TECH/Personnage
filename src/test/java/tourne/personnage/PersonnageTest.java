package tourne.personnage;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class PersonnageTest {
    @Test
    public void tourner_1_quart_retourne_EST() {
        Personnage personnage = new Personnage();
        String orientation = personnage.tourner(1);
        assertThat(orientation).isEqualTo("EST");
    }
}
