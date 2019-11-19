import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Carte> deck = new ArrayList<Carte>();

    public void initDeck(){
        deck.add(new Territoire('A',1,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('A',2,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('A',3,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('A',4,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('A',5,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('A',6,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('A',7,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('A',8,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('A',9,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('A',10,Terrain.mer, "Images/fermier.jpg"));

        deck.add(new Territoire('B',1,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('B',2,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('B',3,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('B',4,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('B',5,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('B',6,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('B',7,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('B',8,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('B',9,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('B',10,Terrain.mer, "Images/fermier.jpg"));

        deck.add(new Territoire('C',1,Terrain.cite,"Images/C1.jpg"));
        deck.add(new Territoire('C',2,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('C',3,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('C',4,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('C',5,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('C',6,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('C',7,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('C',8,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('C',9,Terrain.montagne,"Images/C9.jpg"));
        deck.add(new Territoire('C',10,Terrain.plaine, "Images/fermier.jpg"));

        deck.add(new Territoire('D',1,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('D',2,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('D',3,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('D',4,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('D',5,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('D',6,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('D',7,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('D',8,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('D',9,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('D',10,Terrain.bois, "Images/fermier.jpg"));

        deck.add(new Territoire('E',1,Terrain.bois,"Images/E1.jpg"));
        deck.add(new Territoire('E',2,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('E',3,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('E',4,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('E',5,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('E',6,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('E',7,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('E',8,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('E',9,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('E',10,Terrain.cite, "Images/fermier.jpg"));

        deck.add(new Territoire('F',1,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('F',2,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('F',3,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('F',4,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('F',5,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('F',6,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('F',7,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('F',8,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('F',9,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('F',10,Terrain.plaine, "Images/fermier.jpg"));

        deck.add(new Territoire('G',1,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('G',2,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('G',3,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('G',4,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('G',5,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('G',6,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('G',7,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('G',8,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('G',9,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('G',10,Terrain.plaine, "Images/fermier.jpg"));

        deck.add(new Territoire('H',1,Terrain.plaine,"Images/H1.jpg"));
        deck.add(new Territoire('H',2,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('H',3,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('H',4,Terrain.champs,"Images/H4.jpg"));
        deck.add(new Territoire('H',5,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('H',6,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('H',7,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('H',8,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('H',9,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('H',10,Terrain.bois, "Images/fermier.jpg"));

        deck.add(new Territoire('I',1,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('I',2,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('I',3,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('I',4,Terrain.mer,"Images/I4.jpg"));
        deck.add(new Territoire('I',5,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('I',6,Terrain.plaine, "Images/fermier.jpg"));
        deck.add(new Territoire('I',7,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('I',8,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('I',9,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('I',10,Terrain.bois, "Images/fermier.jpg"));

        deck.add(new Territoire('J',1,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('J',2,Terrain.bois, "Images/fermier.jpg"));
        deck.add(new Territoire('J',3,Terrain.cite, "Images/fermier.jpg"));
        deck.add(new Territoire('J',4,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('J',5,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('J',6,Terrain.champs, "Images/fermier.jpg"));
        deck.add(new Territoire('J',7,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('J',8,Terrain.montagne, "Images/fermier.jpg"));
        deck.add(new Territoire('J',9,Terrain.mer, "Images/fermier.jpg"));
        deck.add(new Territoire('J',10,Terrain.mer, "Images/fermier.jpg"));

        deck.add(new Ravitaillement("Images/ravitaillement.jpg"));
        deck.add(new Ravitaillement("Images/ravitaillement.jpg"));
        deck.add(new Ravitaillement("Images/ravitaillement.jpg"));

        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.champs,0,"Images/prodCarotte.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.mer,0, "Images/prodPoisson.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.bois,0, "Images/prodBois.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.merBoisChamps,0, "Images/prodTout.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.merBoisChamps,0, "Images/prodTout.jpg"));

        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0,"Images/prodBronze.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0, "Images/prodOr.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0, "Images/prodFer.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0, "Images/prodDiamant.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.champs,0, "Images/prodEpice.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.bois,0, "Images/prodChampi.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.mer,0, "Images/prodPerle.jpg"));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "Images/cite1.jpg"));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "Images/cite2.jpg"));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3, "Images/cite3.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3, "Images/cite3.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3, "Images/cite3.jpg"));

        deck.add(new Construction(TypeConstruction.campement, null,1, "Images/fermier.jpg"));
        deck.add(new Construction(TypeConstruction.campement, null,2, "Images/campement2.jpg"));
        deck.add(new Construction(TypeConstruction.campement, null,3, "Images/fermier.jpg"));
        deck.add(new Construction(TypeConstruction.campement, null,4, "Images/fermier.jpg"));
        deck.add(new Construction(TypeConstruction.campement, null,5, "Images/fermier.jpg"));
        deck.add(new Construction(TypeConstruction.campement, null,6, "Images/fermier.jpg"));

        deck.add(new Construction(TypeConstruction.relais, null,0,"Images/relaisAerien.jpg"));
        deck.add(new Construction(TypeConstruction.relais, null,0,"Images/relaisAerien.jpg"));
        deck.add(new Construction(TypeConstruction.relais, null,0,"Images/relaisAerien.jpg"));

        deck.add(new Tresor(1,"Images/gantGauche.jpg"));
        deck.add(new Tresor(1,"Images/gantDroit.jpg"));
        deck.add(new Tresor(2,"Images/manteauRoyal.jpg"));
        deck.add(new Tresor(3, "Images/fermier.jpg"));
        deck.add(new Tresor(4,"Images/caliceRoyal.jpg"));
        deck.add(new Tresor(5, "Images/fermier.jpg"));
        deck.add(new Tresor(6, "Images/fermier.jpg"));

        deck.add(new Mission("Pan Pan le Barbare","Images/panpan.jpg"));
        deck.add(new Mission("Roi Pecheur", "Images/fermier.jpg"));
        deck.add(new Mission("Roi des Voleurs", "Images/fermier.jpg"));
        deck.add(new Mission("Liberal", "Images/fermier.jpg"));
        deck.add(new Mission("Socialiste", "Images/fermier.jpg"));
        deck.add(new Mission("Petit Prince", "Images/fermier.jpg"));
        deck.add(new Mission("Chasseur de Tresor","Images/chasseurTresor.jpg"));
        deck.add(new Mission("Fermier","Images/fermier.jpg"));
        deck.add(new Mission("Bûcheron", "Images/fermier.jpg"));
        deck.add(new Mission("Maitre Fermier", "Images/fermier.jpg"));
        deck.add(new Mission("Roi Fermier", "Images/fermier.jpg"));
        deck.add(new Mission("Maitre Bucheron", "Images/fermier.jpg"));
        deck.add(new Mission("Roi de la Foret", "Images/fermier.jpg"));
        deck.add(new Mission("Maitre Pecheur", "Images/fermier.jpg"));
        deck.add(new Mission("Pecheur", "Images/fermier.jpg"));
        deck.add(new Mission("Roi des Clans", "Images/fermier.jpg"));
        deck.add(new Mission("Chef de Clan", "Images/fermier.jpg"));
        deck.add(new Mission("Gouverneur", "Images/fermier.jpg"));
        deck.add(new Mission("Roi Spectrale", "Images/fermier.jpg"));
        deck.add(new Mission("Bunny Jones", "Images/fermier.jpg"));
        deck.add(new Mission("Lapoleon", "Images/fermier.jpg"));
        deck.add(new Mission("Colon", "Images/fermier.jpg"));
        deck.add(new Mission("Marchand", "Images/fermier.jpg"));
        deck.add(new Mission("LapinGetorix", "Images/fermier.jpg"));
        deck.add(new Mission("Diplomate", "Images/fermier.jpg"));
        deck.add(new Mission("Burocrate", "Images/fermier.jpg"));

        Collections.shuffle(deck);
    }

    public Carte pioche(){
        Carte tampon = deck.get(0);
        deck.remove(0);
        return tampon;
    }
}
