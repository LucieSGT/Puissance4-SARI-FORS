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
}  

public void affecterCouleur (String uneCouleur){
    Couleur = uneCouleur ;
}

public boolean ajouterJeton(Jeton unJeton){
    for (int i=0; i<21; i++){
        if (ListeJetons[i]==null){
            ListeJetons[i]=unJeton;
    }
        break;
    }
    return true;
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



