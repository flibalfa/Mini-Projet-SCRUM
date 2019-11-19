import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Carte> deck = new ArrayList<Carte>();

    public void initDeck(){
        deck.add(new Territoire('A',1,Terrain.bois,null));
        deck.add(new Territoire('A',2,Terrain.bois,null));
        deck.add(new Territoire('A',3,Terrain.bois,null));
        deck.add(new Territoire('A',4,Terrain.cite,null));
        deck.add(new Territoire('A',5,Terrain.mer,null));
        deck.add(new Territoire('A',6,Terrain.mer,null));
        deck.add(new Territoire('A',7,Terrain.mer,null));
        deck.add(new Territoire('A',8,Terrain.bois,null));
        deck.add(new Territoire('A',9,Terrain.plaine,null));
        deck.add(new Territoire('A',10,Terrain.mer,null));

        deck.add(new Territoire('B',1,Terrain.montagne,null));
        deck.add(new Territoire('B',2,Terrain.montagne,null));
        deck.add(new Territoire('B',3,Terrain.cite,null));
        deck.add(new Territoire('B',4,Terrain.mer,null));
        deck.add(new Territoire('B',5,Terrain.mer,null));
        deck.add(new Territoire('B',6,Terrain.montagne,null));
        deck.add(new Territoire('B',7,Terrain.cite,null));
        deck.add(new Territoire('B',8,Terrain.plaine,null));
        deck.add(new Territoire('B',9,Terrain.cite,null));
        deck.add(new Territoire('B',10,Terrain.mer,null));

        deck.add(new Territoire('C',1,Terrain.cite,"images/C1.jpg"));
        deck.add(new Territoire('C',2,Terrain.montagne,null));
        deck.add(new Territoire('C',3,Terrain.plaine,null));
        deck.add(new Territoire('C',4,Terrain.mer,null));
        deck.add(new Territoire('C',5,Terrain.mer,null));
        deck.add(new Territoire('C',6,Terrain.montagne,null));
        deck.add(new Territoire('C',7,Terrain.champs,null));
        deck.add(new Territoire('C',8,Terrain.montagne,null));
        deck.add(new Territoire('C',9,Terrain.montagne,"images/C9.jpg"));
        deck.add(new Territoire('C',10,Terrain.plaine,null));

        deck.add(new Territoire('D',1,Terrain.plaine,null));
        deck.add(new Territoire('D',2,Terrain.montagne,null));
        deck.add(new Territoire('D',3,Terrain.cite,null));
        deck.add(new Territoire('D',4,Terrain.champs,null));
        deck.add(new Territoire('D',5,Terrain.montagne,null));
        deck.add(new Territoire('D',6,Terrain.montagne,null));
        deck.add(new Territoire('D',7,Terrain.champs,null));
        deck.add(new Territoire('D',8,Terrain.plaine,null));
        deck.add(new Territoire('D',9,Terrain.cite,null));
        deck.add(new Territoire('D',10,Terrain.bois,null));

        deck.add(new Territoire('E',1,Terrain.bois,"images/E1.jpg"));
        deck.add(new Territoire('E',2,Terrain.plaine,null));
        deck.add(new Territoire('E',3,Terrain.champs,null));
        deck.add(new Territoire('E',4,Terrain.plaine,null));
        deck.add(new Territoire('E',5,Terrain.plaine,null));
        deck.add(new Territoire('E',6,Terrain.cite,null));
        deck.add(new Territoire('E',7,Terrain.plaine,null));
        deck.add(new Territoire('E',8,Terrain.champs,null));
        deck.add(new Territoire('E',9,Terrain.plaine,null));
        deck.add(new Territoire('E',10,Terrain.cite,null));

        deck.add(new Territoire('F',1,Terrain.bois,null));
        deck.add(new Territoire('F',2,Terrain.montagne,null));
        deck.add(new Territoire('F',3,Terrain.montagne,null));
        deck.add(new Territoire('F',4,Terrain.bois,null));
        deck.add(new Territoire('F',5,Terrain.bois,null));
        deck.add(new Territoire('F',6,Terrain.plaine,null));
        deck.add(new Territoire('F',7,Terrain.champs,null));
        deck.add(new Territoire('F',8,Terrain.cite,null));
        deck.add(new Territoire('F',9,Terrain.bois,null));
        deck.add(new Territoire('F',10,Terrain.plaine,null));

        deck.add(new Territoire('G',1,Terrain.bois,null));
        deck.add(new Territoire('G',2,Terrain.cite,null));
        deck.add(new Territoire('G',3,Terrain.plaine,null));
        deck.add(new Territoire('G',4,Terrain.plaine,null));
        deck.add(new Territoire('G',5,Terrain.cite,null));
        deck.add(new Territoire('G',6,Terrain.plaine,null));
        deck.add(new Territoire('G',7,Terrain.champs,null));
        deck.add(new Territoire('G',8,Terrain.plaine,null));
        deck.add(new Territoire('G',9,Terrain.cite,null));
        deck.add(new Territoire('G',10,Terrain.plaine,null));

        deck.add(new Territoire('H',1,Terrain.plaine,"images/H1.jpg"));
        deck.add(new Territoire('H',2,Terrain.champs,null));
        deck.add(new Territoire('H',3,Terrain.cite,null));
        deck.add(new Territoire('H',4,Terrain.champs,"images/H4.jpg"));
        deck.add(new Territoire('H',5,Terrain.plaine,null));
        deck.add(new Territoire('H',6,Terrain.plaine,null));
        deck.add(new Territoire('H',7,Terrain.cite,null));
        deck.add(new Territoire('H',8,Terrain.plaine,null));
        deck.add(new Territoire('H',9,Terrain.plaine,null));
        deck.add(new Territoire('H',10,Terrain.bois,null));

        deck.add(new Territoire('I',1,Terrain.cite,null));
        deck.add(new Territoire('I',2,Terrain.plaine,null));
        deck.add(new Territoire('I',3,Terrain.plaine,null));
        deck.add(new Territoire('I',4,Terrain.mer,"images/I4.jpg"));
        deck.add(new Territoire('I',5,Terrain.mer,null));
        deck.add(new Territoire('I',6,Terrain.plaine,null));
        deck.add(new Territoire('I',7,Terrain.montagne,null));
        deck.add(new Territoire('I',8,Terrain.montagne,null));
        deck.add(new Territoire('I',9,Terrain.cite,null));
        deck.add(new Territoire('I',10,Terrain.bois,null));

        deck.add(new Territoire('J',1,Terrain.bois,null));
        deck.add(new Territoire('J',2,Terrain.bois,null));
        deck.add(new Territoire('J',3,Terrain.cite,null));
        deck.add(new Territoire('J',4,Terrain.mer,null));
        deck.add(new Territoire('J',5,Terrain.mer,null));
        deck.add(new Territoire('J',6,Terrain.champs,null));
        deck.add(new Territoire('J',7,Terrain.montagne,null));
        deck.add(new Territoire('J',8,Terrain.montagne,null));
        deck.add(new Territoire('J',9,Terrain.mer,null));
        deck.add(new Territoire('J',10,Terrain.mer,null));

        deck.add(new Ravitaillement("images/ravitaillement.jpg"));
        deck.add(new Ravitaillement("images/ravitaillement.jpg"));
        deck.add(new Ravitaillement("images/ravitaillement.jpg"));

        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.champs,0,"images/prodCarotte.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.mer,0, "images/prodPoisson.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.bois,0, "images/prodBois.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.merBoisChamps,0, "images/prodTout.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.merBoisChamps,0, "images/prodTout.jpg"));

        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0,"images/prodBronze.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0, "images/prodOr.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0, "images/prodFer.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0, "images/prodDiamant.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.champs,0, "images/prodEpice.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.bois,0, "images/prodChampi.jpg"));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.mer,0, "images/prodPerle.jpg"));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1, "images/cite1.jpg"));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2, "images/cite2.jpg"));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3, "images/cite3.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3, "images/cite3.jpg"));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3, "images/cite3.jpg"));

        deck.add(new Construction(TypeConstruction.campement,null,1,null));
        deck.add(new Construction(TypeConstruction.campement,null,2, "images/campement2.jpg"));
        deck.add(new Construction(TypeConstruction.campement,null,3,null));
        deck.add(new Construction(TypeConstruction.campement,null,4,null));
        deck.add(new Construction(TypeConstruction.campement,null,5,null));
        deck.add(new Construction(TypeConstruction.campement,null,6,null));

        deck.add(new Construction(TypeConstruction.relais,null,0,"images/relaisAerien.jpg"));
        deck.add(new Construction(TypeConstruction.relais,null,0,"images/relaisAerien.jpg"));
        deck.add(new Construction(TypeConstruction.relais,null,0,"images/relaisAerien.jpg"));

        deck.add(new Tresor(1,"images/gantGauche.jpg"));
        deck.add(new Tresor(1,"images/gantDroit.jpg"));
        deck.add(new Tresor(2,"images/manteauRoyal.jpg"));
        deck.add(new Tresor(3,null));
        deck.add(new Tresor(4,"images/caliceRoyal.jpg"));
        deck.add(new Tresor(5,null));
        deck.add(new Tresor(6,null));

        deck.add(new Mission("Pan Pan le Barbare","images/panpan.jpg"));
        deck.add(new Mission("Roi Pecheur",null));
        deck.add(new Mission("Roi des Voleurs",null));
        deck.add(new Mission("Liberal",null));
        deck.add(new Mission("Socialiste",null));
        deck.add(new Mission("Petit Prince",null));
        deck.add(new Mission("Chasseur de Tresor","images/chasseurTresor.jpg"));
        deck.add(new Mission("Fermier","images/fermier.jpg"));
        deck.add(new Mission("Bûcheron",null));
        deck.add(new Mission("Maitre Fermier",null));
        deck.add(new Mission("Roi Fermier",null));
        deck.add(new Mission("Maitre Bucheron",null));
        deck.add(new Mission("Roi de la Foret",null));
        deck.add(new Mission("Maitre Pecheur",null));
        deck.add(new Mission("Pecheur",null));
        deck.add(new Mission("Roi des Clans",null));
        deck.add(new Mission("Chef de Clan",null));
        deck.add(new Mission("Gouverneur",null));
        deck.add(new Mission("Roi Spectrale",null));
        deck.add(new Mission("Bunny Jones",null));
        deck.add(new Mission("Lapoleon",null));
        deck.add(new Mission("Colon",null));
        deck.add(new Mission("Marchand",null));
        deck.add(new Mission("LapinGetorix",null));
        deck.add(new Mission("Diplomate",null));
        deck.add(new Mission("Burocrate",null));

        Collections.shuffle(deck);
    }

    public Carte pioche(){
        Carte tampon = deck.get(0);
        deck.remove(0);
        return tampon;
    }
}
