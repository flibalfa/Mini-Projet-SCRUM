import java.util.ArrayList;
import java.util.Collections;

public class Deck {

    ArrayList<Carte> deck = new ArrayList<Carte>();

    public void initDeck(){
        deck.add(new Territoire('A',1,Terrain.bois));
        deck.add(new Territoire('A',2,Terrain.bois));
        deck.add(new Territoire('A',3,Terrain.bois));
        deck.add(new Territoire('A',4,Terrain.cite));
        deck.add(new Territoire('A',5,Terrain.mer));
        deck.add(new Territoire('A',6,Terrain.mer));
        deck.add(new Territoire('A',7,Terrain.mer));
        deck.add(new Territoire('A',8,Terrain.bois));
        deck.add(new Territoire('A',9,Terrain.plaine));
        deck.add(new Territoire('A',10,Terrain.mer));

        deck.add(new Territoire('B',1,Terrain.montagne));
        deck.add(new Territoire('B',2,Terrain.montagne));
        deck.add(new Territoire('B',3,Terrain.cite));
        deck.add(new Territoire('B',4,Terrain.mer));
        deck.add(new Territoire('B',5,Terrain.mer));
        deck.add(new Territoire('B',6,Terrain.montagne));
        deck.add(new Territoire('B',7,Terrain.cite));
        deck.add(new Territoire('B',8,Terrain.plaine));
        deck.add(new Territoire('B',9,Terrain.cite));
        deck.add(new Territoire('B',10,Terrain.mer));

        deck.add(new Territoire('C',1,Terrain.cite));
        deck.add(new Territoire('C',2,Terrain.montagne));
        deck.add(new Territoire('C',3,Terrain.plaine));
        deck.add(new Territoire('C',4,Terrain.mer));
        deck.add(new Territoire('C',5,Terrain.mer));
        deck.add(new Territoire('C',6,Terrain.montagne));
        deck.add(new Territoire('C',7,Terrain.champs));
        deck.add(new Territoire('C',8,Terrain.montagne));
        deck.add(new Territoire('C',9,Terrain.montagne));
        deck.add(new Territoire('C',10,Terrain.plaine));

        deck.add(new Territoire('D',1,Terrain.plaine));
        deck.add(new Territoire('D',2,Terrain.montagne));
        deck.add(new Territoire('D',3,Terrain.cite));
        deck.add(new Territoire('D',4,Terrain.champs));
        deck.add(new Territoire('D',5,Terrain.montagne));
        deck.add(new Territoire('D',6,Terrain.montagne));
        deck.add(new Territoire('D',7,Terrain.champs));
        deck.add(new Territoire('D',8,Terrain.plaine));
        deck.add(new Territoire('D',9,Terrain.cite));
        deck.add(new Territoire('D',10,Terrain.bois));

        deck.add(new Territoire('E',1,Terrain.bois));
        deck.add(new Territoire('E',2,Terrain.plaine));
        deck.add(new Territoire('E',3,Terrain.champs));
        deck.add(new Territoire('E',4,Terrain.plaine));
        deck.add(new Territoire('E',5,Terrain.plaine));
        deck.add(new Territoire('E',6,Terrain.cite));
        deck.add(new Territoire('E',7,Terrain.plaine));
        deck.add(new Territoire('E',8,Terrain.champs));
        deck.add(new Territoire('E',9,Terrain.plaine));
        deck.add(new Territoire('E',10,Terrain.cite));

        deck.add(new Territoire('F',1,Terrain.bois));
        deck.add(new Territoire('F',2,Terrain.montagne));
        deck.add(new Territoire('F',3,Terrain.montagne));
        deck.add(new Territoire('F',4,Terrain.bois));
        deck.add(new Territoire('F',5,Terrain.bois));
        deck.add(new Territoire('F',6,Terrain.plaine));
        deck.add(new Territoire('F',7,Terrain.champs));
        deck.add(new Territoire('F',8,Terrain.cite));
        deck.add(new Territoire('F',9,Terrain.bois));
        deck.add(new Territoire('F',10,Terrain.plaine));

        deck.add(new Territoire('G',1,Terrain.bois));
        deck.add(new Territoire('G',2,Terrain.cite));
        deck.add(new Territoire('G',3,Terrain.plaine));
        deck.add(new Territoire('G',4,Terrain.plaine));
        deck.add(new Territoire('G',5,Terrain.cite));
        deck.add(new Territoire('G',6,Terrain.plaine));
        deck.add(new Territoire('G',7,Terrain.champs));
        deck.add(new Territoire('G',8,Terrain.plaine));
        deck.add(new Territoire('G',9,Terrain.cite));
        deck.add(new Territoire('G',10,Terrain.plaine));

        deck.add(new Territoire('H',1,Terrain.plaine));
        deck.add(new Territoire('H',2,Terrain.champs));
        deck.add(new Territoire('H',3,Terrain.cite));
        deck.add(new Territoire('H',4,Terrain.champs));
        deck.add(new Territoire('H',5,Terrain.plaine));
        deck.add(new Territoire('H',6,Terrain.plaine));
        deck.add(new Territoire('H',7,Terrain.cite));
        deck.add(new Territoire('H',8,Terrain.plaine));
        deck.add(new Territoire('H',9,Terrain.plaine));
        deck.add(new Territoire('H',10,Terrain.bois));

        deck.add(new Territoire('I',1,Terrain.cite));
        deck.add(new Territoire('I',2,Terrain.plaine));
        deck.add(new Territoire('I',3,Terrain.plaine));
        deck.add(new Territoire('I',4,Terrain.mer));
        deck.add(new Territoire('I',5,Terrain.mer));
        deck.add(new Territoire('I',6,Terrain.plaine));
        deck.add(new Territoire('I',7,Terrain.montagne));
        deck.add(new Territoire('I',8,Terrain.montagne));
        deck.add(new Territoire('I',9,Terrain.cite));
        deck.add(new Territoire('I',10,Terrain.bois));

        deck.add(new Territoire('J',1,Terrain.bois));
        deck.add(new Territoire('J',2,Terrain.bois));
        deck.add(new Territoire('J',3,Terrain.cite));
        deck.add(new Territoire('J',4,Terrain.mer));
        deck.add(new Territoire('J',5,Terrain.mer));
        deck.add(new Territoire('J',6,Terrain.champs));
        deck.add(new Territoire('J',7,Terrain.montagne));
        deck.add(new Territoire('J',8,Terrain.montagne));
        deck.add(new Territoire('J',9,Terrain.mer));
        deck.add(new Territoire('J',10,Terrain.mer));

        deck.add(new Ravitaillement());
        deck.add(new Ravitaillement());
        deck.add(new Ravitaillement());

        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.champs,0));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.mer,0));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.bois,0));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.merBoisChamps,0));
        deck.add(new Construction(TypeConstruction.ressourceDeBase,Terrain.merBoisChamps,0));

        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.montagne,0));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.champs,0));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.bois,0));
        deck.add(new Construction(TypeConstruction.ressourceDeLuxe,Terrain.mer,0));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,1));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,2));

        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3));
        deck.add(new Construction(TypeConstruction.cite, Terrain.cite,3));

        deck.add(new Construction(TypeConstruction.campement,null,1));
        deck.add(new Construction(TypeConstruction.campement,null,2));
        deck.add(new Construction(TypeConstruction.campement,null,3));
        deck.add(new Construction(TypeConstruction.campement,null,4));
        deck.add(new Construction(TypeConstruction.campement,null,5));
        deck.add(new Construction(TypeConstruction.campement,null,6));

        deck.add(new Construction(TypeConstruction.relais,null,0));
        deck.add(new Construction(TypeConstruction.relais,null,0));
        deck.add(new Construction(TypeConstruction.relais,null,0));

        deck.add(new Tresor(1));
        deck.add(new Tresor(1));
        deck.add(new Tresor(2));
        deck.add(new Tresor(3));
        deck.add(new Tresor(4));
        deck.add(new Tresor(5));
        deck.add(new Tresor(6));

        deck.add(new Mission("Pan Pan le Barbare"));
        deck.add(new Mission("Roi Pecheur"));
        deck.add(new Mission("Roi des Voleurs"));
        deck.add(new Mission("Liberal"));
        deck.add(new Mission("Socialiste"));
        deck.add(new Mission("Petit Prince"));
        deck.add(new Mission("Chasseur de Tresor"));
        deck.add(new Mission("Fermier"));
        deck.add(new Mission("Bûcheron"));
        deck.add(new Mission("Maitre Fermier"));
        deck.add(new Mission("Roi Fermier"));
        deck.add(new Mission("Maitre Bucheron"));
        deck.add(new Mission("Roi de la Foret"));
        deck.add(new Mission("Maitre Pecheur"));
        deck.add(new Mission("Pecheur"));
        deck.add(new Mission("Roi des Clans"));
        deck.add(new Mission("Chef de Clan"));
        deck.add(new Mission("Gouverneur"));
        deck.add(new Mission("Roi Spectrale"));
        deck.add(new Mission("Bunny Jones"));
        deck.add(new Mission("Lapoleon"));
        deck.add(new Mission("Colon"));
        deck.add(new Mission("Marchand"));
        deck.add(new Mission("LapinGetorix"));
        deck.add(new Mission("Diplomate"));
        deck.add(new Mission("Burocrate"));

        Collections.shuffle(deck);
    }

    public Carte pioche(){
        Carte tampon = deck.get(0);
        deck.remove(0);
        return tampon;
    }
}
