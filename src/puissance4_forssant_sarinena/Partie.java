/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance4_forssant_sarinena;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author lsarinen
 */
public class Partie {
        Joueur ListeJoueurs[] = new Joueur[2]; 
        Grille GrilleJeu = new Grille();
        Joueur joueurCourant;
        
public void initialiserPartie(){
   
    GrilleJeu.viderGrille();
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Entrez le nom du Joueur 1 : ");
    Joueur Joueur1 = new Joueur(sc.nextLine());
    System.out.println("Entrez le nom du Joueur 2 : "); 
    Joueur Joueur2 = new Joueur(sc.nextLine());
    
    ListeJoueurs[0] = Joueur1;
    ListeJoueurs[1] = Joueur2;
    
    attribuerCouleursAuxJoueurs();
    System.out.println(Joueur1.Nom + "possède les jetons de couleur " + Joueur1.Couleur);
    System.out.println(Joueur2.Nom + "possède les jetons de couleur " + Joueur2.Couleur);
    
    for (int i=0; i<21; i++){
        Jeton unJeton = new Jeton(ListeJoueurs[0].Couleur);
        Joueur1.ajouterJeton(unJeton);
        Jeton unAutreJeton = new Jeton(ListeJoueurs[1].Couleur);
        Joueur2.ajouterJeton(unAutreJeton);
    }
    
    Random rand = new Random();
    int prems;
    prems = rand.nextInt(1);
    if (prems == 1){
        System.out.println(Joueur1.Nom + "commence à jouer");
        joueurCourant = Joueur1;
    }
    else {
        System.out.println(Joueur2.Nom + "commence à jouer");
    }
}        
        
public void debuterPartie(){
    // ajouter condition qui gagne qui perd dans autre méthode continuerpartie
}        

public void attribuerCouleursAuxJoueurs(){
    Random alea = new Random();
    int ChoixJoueur;
    ChoixJoueur = alea.nextInt(1);
    if (ChoixJoueur == 1){
        ListeJoueurs[0].Couleur = "Jaune";
        ListeJoueurs[1].Couleur = "Rouge";
    }
    else {
        ListeJoueurs[0].Couleur = "Rouge";
        ListeJoueurs[1].Couleur = "Jaune";
    }
}

public Joueur CouleurSuivante (Joueur unNom){
    if (ListeJoueurs[0] == joueurCourant){
        return ListeJoueurs[1];
    }
    else {
        return ListeJoueurs[0];
    }
}

}
