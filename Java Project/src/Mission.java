public class Mission extends Parchemin {
    String nom;

    public Mission(String nom) {
        super();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void play() {
        //gagne des points si conditions respectés
    }
}