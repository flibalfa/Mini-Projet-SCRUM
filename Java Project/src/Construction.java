public class Construction extends Carte {
    TypeConstruction typeCtonstruction;
    Terrain terrain;
    int numero;

    public Construction(TypeConstruction typeCtonstruction, Terrain terrain, int numero) {
        super();
        this.typeCtonstruction = typeCtonstruction;
        this.terrain = terrain;
        this.numero = numero;
    }

    public TypeConstruction getTypeCtonstruction() {
        return typeCtonstruction;
    }

    public void setTypeCtonstruction(TypeConstruction typeCtonstruction) {
        this.typeCtonstruction = typeCtonstruction;
    }

    public Terrain getTerrain() {
        return terrain;
    }

    public void setTerrain(Terrain terrain) {
        this.terrain = terrain;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public void play() {
        //pose une construction sur une case territoire correspondante au choix :
        //
    }
}
