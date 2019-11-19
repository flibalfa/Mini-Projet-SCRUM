

import java.util.*;
public class Joueur{
    public static final Scanner input = new Scanner(System.in);
    protected int nbPlayer;
    protected ArrayList<Carte> hand;

    public Joueur(int i){
        nbPlayer = i;
        hand = new ArrayList<Carte>();
    }

    public int getNbJoueur(){
        return this.nbPlayer;
    }

    public void addCard(Carte c){
        hand.add(c);
    }

    public void playCard(Carte indice){
        hand.remove(indice);
    }

    public String toString(){
        return "Joueur "+nbPlayer+"";
    }
}