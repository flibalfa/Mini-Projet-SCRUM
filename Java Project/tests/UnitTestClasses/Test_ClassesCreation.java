package UnitTestClasses;

import Classes.Joueur;
import Enums.RabbitColor;
import org.junit.Assert;
import org.junit.Test;

public class Test_ClassesCreation {
    @Test
    public void CreationJoueur()
    {
        Joueur joueur1 = new Joueur(RabbitColor.Noir);
        Assert.assertEquals(RabbitColor.Noir, joueur1.getColor());
    }
}
