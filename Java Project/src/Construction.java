public class Construction extends Carte {
    TypeConstruction typeCtonstruction;
    Terrain terrain;
    int numero;

    public Construction(TypeConstruction typeCtonstruction, Terrain terrain, int numero, String img) {
        super(img);
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
        //Pour chaque case, verifier que :
        //  le joueur possède la case
        //  case.terrain = carte.terrain || carte.typeConstru = relais
        //  showPossibleCase()
        //  placer la constru sur la case sélectionnée
        //  changer les arguments de la case
    }
}
