public class Territoire extends Carte {
    char lettre;
    int numero;
    Terrain terrain;

    public Territoire(char lettre, int numero, Terrain terrain) {
        super();
        this.lettre = lettre;
        this.numero = numero;
        this.terrain = terrain;
    }

    public char getLettre() {
        return lettre;
    }

    public void setLettre(char lettre) {
        this.lettre = lettre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    @Override
    public void play() {
        //prend le contrôle du territoire (met un petit lapin dessus) :
        //plateau.putPionJoueur(Joueur joueur);
    }
}
