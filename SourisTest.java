
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SourisTest {

    @Test
    public void sourisTreeparameters() {

        Souris souris = new Souris(50, "blanche", 2);
        assertEquals(50, souris.get_poids());
        assertEquals("blanche", souris.get_couleur());
        assertEquals(2, souris.get_age());

    }

    @Test
    public void souristwoParameter() {
        Souris souris = new Souris(45, "grise");
        assertEquals(45, souris.get_poids());
        assertEquals("grise", souris.get_couleur());

    }

    @Test
    public void sourisClonee() {
        Souris souris = new Souris(45, "grise");
        Souris sourisClone = new Souris(souris);
        assertEquals(souris.get_couleur(), sourisClone.get_couleur());
        assertEquals(souris.get_poids(), sourisClone.get_poids());

    }

    @Test
    public void sourisViellir() {
        Souris sourisVielle = new Souris(10, "verte", 11);

        assertEquals(12, sourisVielle.vieillir());
    }

}
