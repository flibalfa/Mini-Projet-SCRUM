public class Carte {
    private static int idMax = 0;
    private int id;
    public String img;

    public Carte(String img) {
        this.id = idMax;
        idMax++;
        this.img = img;
    }

    public void play(){
        return;
    }
}
