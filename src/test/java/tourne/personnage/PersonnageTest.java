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
    @Test
    public void tourner_2_quart_retourne_SUD(){
        Personnage pers = new Personnage();
        String Orientation = pers.tourner(2);
        assertThat(Orientation).isEqualTo("SUD");

    }
    @Test
    public void tourner_3_retourner_OUEST(){
        Personnage pers = new Personnage();
        String Orientation = pers.tourner(3);
        assertThat(Orientation).isEqualTo("OUEST");
    }
    @Test
    public void tourner_4_retourner_NORD(){
        Personnage pers = new Personnage();
        String Orientation = pers.tourner(4);
        assertThat(Orientation).isEqualTo("NORD");
    }
    @Test
    public void tourner_5_retourner_NORD(){
        Personnage pers = new Personnage();
        String Orientation = pers.tourner(5);
        assertThat(Orientation).isEqualTo("EST");
    }
}
