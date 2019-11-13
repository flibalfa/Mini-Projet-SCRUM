public class Case
{
    boolean is_occupee = false;
    Joueur joueur;
    Terrain terrain;
    Construction construction;

    public Case(Terrain terrain) {
        this.terrain = terrain;
    }

    public boolean isIs_occupee() {
        return is_occupee;
    }

    public void setIs_occupee(boolean is_occupee) {
        this.is_occupee = is_occupee;
    }

    public Joueur getJoueur() {
        return joueur;
    }

    public void setJoueur(Joueur joueur) {
        this.joueur = joueur;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public Construction getConstruction() {
        return construction;
    }

    public void setConstruction(Construction construction) {
        this.construction = construction;
    }
}
