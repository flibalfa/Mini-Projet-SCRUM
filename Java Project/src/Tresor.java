public class Tresor extends Parchemin {
    int valeur;

    public Tresor(int valeur, String img) {
        super(img);
        this.valeur = valeur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public void play(Joueur j) {
        //gagne des points
    }
}
