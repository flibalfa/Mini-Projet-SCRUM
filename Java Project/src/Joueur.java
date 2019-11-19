import java.util.*;
public class Joueur{
    public static final Scanner input = new Scanner(System.in);
    public int nbPlayer;
    public ArrayList<Carte> hand;

    public Joueur(int i){
        nbPlayer = i;
        hand = new ArrayList<Carte>();
    }

    public int getNbJoueur(){
        return this.nbPlayer;
    }

    public void addCard(){
        for (int i = 0; i<10; i++){
            Carte c = Deck.pioche();
            hand.add(c);
        }
    }

    public void selectCard(Carte ct){
        hand.remove(ct);
    }

    public String toString(){
        return "Joueur "+nbPlayer+"";
    }
}