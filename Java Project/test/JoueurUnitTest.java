import Carte.Carte;
import org.junit.Assert;
import org.junit.Test;

public class JoueurUnitTest {

    private Joueur joueur;

    @Test
    public void testAddCard() {
        Joueur joueur1 = new Joueur(1);
        Carte carte = new Carte();
        joueur1.addCard(carte);
        Assert.assertTrue(joueur1.hand.contains(carte));
    }

    @Test
    public void testPlayCard() {
        Joueur joueur1 = new Joueur(1);
        Carte carte = new Carte();
        joueur1.addCard(carte);
        Assert.assertTrue(joueur1.hand.contains(carte));
        joueur1.playCard(carte);
        Assert.assertFalse(joueur1.hand.contains(carte));
    }


}
