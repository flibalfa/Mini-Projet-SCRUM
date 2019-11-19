public class Carte {
    private static int idMax = 0;
    private int id;

    public Carte() {
        this.id = idMax;
        idMax++;
    }

    public void play(){
        return;
    }

    @Override
    public String toString() {
        return "Carte{" +
                "id=" + id +
                '}';
    }
}
