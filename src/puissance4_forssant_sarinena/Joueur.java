/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance4_forssant_sarinena;

import java.util.Random;

/**
 *
 * @author lsarinen
 */
public class Joueur {
    String Nom;
    String Couleur;
    Jeton ListeJetons[] = new Jeton[21]; 
    int nombreDesintegrateurs;
    int nombreJetons_restants;
    
    
public Joueur (String unNom) {
    Nom = unNom;
    nombreDesintegrateurs = 0;
    nombreJetons_restants = 0;
}  

public void affecterCouleur (String uneCouleur){
    Couleur = uneCouleur ;
}

public void ajouterJeton(Jeton unJeton){
    ListeJetons[nombreJetons_restants++] = unJeton;
}

public Jeton enleverJeton(){
    nombreJetons_restants -=1;
    return ListeJetons[nombreJetons_restants];
}

public void obtenirDesintegrateur(){
    nombreDesintegrateurs+=1;
}

public boolean utiliserDesintegrateur(){
    if (nombreDesintegrateurs>0){
        nombreDesintegrateurs-=1;
        return true;
    }
    else {
        return false;
    }
}



}



