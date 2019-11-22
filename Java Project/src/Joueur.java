import java.lang.reflect.Array;
import java.util.*;
public class Joueur{
    public static final Scanner input = new Scanner(System.in);
    public int nbPlayer;
    public ArrayList<Carte> hand;
    public ArrayList<Carte> carteGarder;
    public ArrayList<Carte> carteParchemin;

    public Joueur(int i){
        nbPlayer = i;
        hand = new ArrayList<Carte>();
        carteGarder = new ArrayList<>();
        carteParchemin = new ArrayList<>();
    }

    public int getNbJoueur(){
        return this.nbPlayer;
    }

    public void addCard(Deck d){
        for (int i = 0; i<10; i++){
            Carte c = d.pioche();
            hand.add(c);
        }
    }

    public void choisiCard(){
        System.out.println("vous avez "+hand.size()+" carte");
        printHand();
        System.out.println("Choisissez une 1er carte");
        int carte1 = input.nextInt();
        System.out.println("Choisissez une 2eme carte");
        int carte2 = input.nextInt();
        carteGarder.add(hand.get(carte1));
        carteGarder.add(hand.remove(carte2));
        hand.remove(carte1);
    }

    public void selectCard(Carte ct){
        hand.remove(ct);
    }

    public void printHand(){
        int i=0;
        for (Carte c : hand) {
            System.out.println(i+"="+c);
            i++;
        }
    }

    public static ArrayList<Joueur> tournerCarteGauche(ArrayList<Joueur> joueurs){
        ArrayList<Carte> j0 = joueurs.get(0).hand;
        ArrayList<Carte> j1 = joueurs.get(1).hand;
        ArrayList<Carte> j2 = joueurs.get(2).hand;
        ArrayList<Carte> j3 = joueurs.get(3).hand;
        joueurs.get(0).hand = j1;
        joueurs.get(1).hand = j2;
        joueurs.get(2).hand = j3;
        joueurs.get(3).hand = j0;
        return joueurs;
    }

    public static ArrayList<Joueur> tournerCarteDroite(ArrayList<Joueur> joueurs){
        ArrayList<Carte> j0 = joueurs.get(0).hand;
        ArrayList<Carte> j1 = joueurs.get(1).hand;
        ArrayList<Carte> j2 = joueurs.get(2).hand;
        ArrayList<Carte> j3 = joueurs.get(3).hand;
        joueurs.get(0).hand = j3;
        joueurs.get(1).hand = j0;
        joueurs.get(2).hand = j1;
        joueurs.get(3).hand = j2;
        return joueurs;
    }

    public String toString(){
        return "Joueur "+nbPlayer+"";
    }
}