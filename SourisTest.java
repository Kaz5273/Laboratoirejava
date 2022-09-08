
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

    }

}
