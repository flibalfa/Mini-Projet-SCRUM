public class Territoire extends Carte {
    char lettre;
    int numero;
    Terrain terrain;

    public Territoire(char lettre, int numero, Terrain terrain, String img) {
        super(img);
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

    public int tabToIndex(){
        int retour=0;
        switch (this.lettre){
            case 'B' : retour = 10 ;
                break;
            case 'C' : retour = 20 ;
                break;
            case 'D' : retour = 30 ;
                break;
            case 'E' : retour = 40 ;
                break;
            case 'F' : retour = 50 ;
                break;
            case 'G' : retour = 60 ;
                break;
            case 'H' : retour = 70 ;
                break;
            case 'I' : retour = 80 ;
                break;
            case 'J' : retour = 90 ;
                break;
        }
        retour+=this.numero;
        return retour;
    }

    @Override
    public void play(Joueur j) {
        GameInterface.addPionJoueur(j,tabToIndex());
        //prend le contrôle du territoire (met un petit lapin dessus) :
        //plateau.putPionJoueur(Joueur joueur);
    }
}
