public class Mission extends Parchemin {
    String nom;

    public Mission(String nom, String img) {
        super(img);
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void play(Joueur j) {
        //gagne des points si conditions respectés
    }
}
