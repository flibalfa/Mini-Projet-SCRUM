import java.util.ArrayList;

public class Jeu {
    ArrayList<Joueur> joueurs;
    int nbJoueur = 4;
    int manche;
    Deck deck;
//phase exploration

    public void phaseExploration(){
        //Phase de draft
        for (Joueur j : joueurs) {
            j.addCard(deck);
        }
        for (int i=0 ; i<5 ; i++){
            for (Joueur j : joueurs) {
                //Choisi ses 2 cartes
                j.choisiCard();

                // Joue ses deux cartes
            }

            // Passe sa mains a son voisin
            if(manche==1 || manche==3){
                joueurs = Joueur.tournerCarteGauche(joueurs);
            }else{
                joueurs = Joueur.tournerCarteDroite(joueurs);
            }
        }


        //Phase de Résolution
    }

    public Jeu(){
        joueurs=new ArrayList<>();
        for (int i=0 ; i<nbJoueur ; i++){
            joueurs.add(new Joueur(i));
        }
        deck = new Deck();
        deck.initDeck();
        for (Joueur j : joueurs) {

        }
        manche=1;
        phaseExploration();
    }

    public static void main(String[] args) {
        Jeu j= new Jeu();
    }

}
