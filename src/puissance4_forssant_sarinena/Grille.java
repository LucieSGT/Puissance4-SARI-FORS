/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puissance4_forssant_sarinena;

/**
 *
 * @author lsarinen
 */
public class Grille {
    Cellule Cellules[][] = new Cellule[6][7];
     

public boolean ajouterJetonDansColonne(Jeton unJeton, int c){

    // Trouve la première place vide dans la colonne
    for (int l=0; l<6; l++){
        if (Cellules[l][c].jetonCourant == null){
            Cellules[l][c].affecterJeton(unJeton);
            return true;
        }
    }
return false; // colonne remplie
} 


public boolean etreRemplie(){
    for (int l=0; l<6; l++){
        for (int c=0;c<7; c++){
            if (Cellules[l][c] != null){
                System.out.println("toutes les cases de la grille sont remplies");
                return true;
            }
        }
    }
    return false;
}

public void viderGrille(){
    for (int l=0; l<6; l++){
        for (int c=0; c<7; c++){
            Cellules[l][c].jetonCourant = null;
            Cellules[l][c].trouNoir = false;
            Cellules[l][c].desintegrateur = false;
        }
    }
}

public void  afficherGrilleSurConsole() {
    
    for (int i=5; i>=0; i--){
        for (int j=0; j<7; j++){
            if (Cellules[i][j].trouNoir != false){
                System.out.println("T");
            }
            else if (Cellules[i][j].desintegrateur != false){
                System.out.println("D");
            }
            else if (Cellules[i][j].jetonCourant == null){
                System.out.println("N");
            }
            else {
                if ((Cellules[i][j].jetonCourant.Couleur)!= "Rouge"){
                    System.out.println("J");
                }
            }
        }
        System.out.println(" " + (i+1));
    }
    for (int i=0; i<7; i++){
        System.out.println(" " + (i+1) + " ");
    }
    System.out.println();
}


public boolean  celluleOccupee(int l, int c){
    if (Cellules[l][c].jetonCourant != null){
        System.out.println("Cellule occupée par jeton");
        return true;
    }
    return false;
}

public String  lireCouleurDuJeton(int l, int c){
    return Cellules[l][c].lireCouleurDuJeton();
}


public boolean etreGagnantePourJoueur(Joueur unNom){
    for (int i=0; i<6-4;i++){
        for (int j=0; j<7-4; j++){
            if (LigneAligne(i,j) || ColonneAligne(i,j) || DiagoAscAligne(i,j) || DiagoDesAligne(i,j)== true){
                return true;
            }
        }
    }
    return false;
  }


public boolean LigneAligne(int l, int c){
        for (int compteur=0; compteur<3; compteur++){
            if(Cellules[l][c].jetonCourant == Cellules[l][c+compteur].jetonCourant){
                return true;
            }
        }
   return false;
}

public boolean ColonneAligne(int l, int c){
        for (int compteur=0; compteur<3; compteur++){
            if(Cellules[l][c].jetonCourant == Cellules[l+compteur][c].jetonCourant){
                return true;
            }
        }
   return false;
}

public boolean DiagoAscAligne(int l, int c){
        for (int compteur=0; compteur<3; compteur++){
            if(Cellules[l][c].jetonCourant == Cellules[l+compteur][c+compteur].jetonCourant){
                return true;
            }
        }
        return false;
}

public boolean DiagoDesAligne(int l, int c){
        for (int compteur=0; compteur<3; compteur++){
            if(Cellules[l][c].jetonCourant == Cellules[l+compteur][c-compteur].jetonCourant){
                return true;
            }
        }
        return false;
}


public void  tasserGrille(int l, int c){
    for (int i=l; i<6; i++){
        if (i==5){
            Cellules[i][c].jetonCourant = null;
        }
        else{
            Cellules[i][c].jetonCourant = Cellules[i+1][c].jetonCourant;
        }
    }
}

public boolean  colonneRemplie(int c){
    for (int l=0; l<6; l++){
        if (Cellules[l][c].jetonCourant==null){
            return false ;
        }
    }
    return true ;
}

public boolean  placerDesintegrateur(int l, int c){
    if (Cellules[l][c].desintegrateur){
        Cellules[l][c].desintegrateur = true;
        return true;
    }
    return false;
}

public boolean  placerTrouNoir(int l, int c){
    if (Cellules[l][c].trouNoir){
        Cellules[l][c].trouNoir = true;
        return true;
    }
    return false;
}

public boolean supprimerJeton(int l, int c){
    if (Cellules[l][c].jetonCourant == null){
        return false;
        }
        else {
        Cellules[l][c].jetonCourant = null;
        return true;
        }
}

public Jeton  recupererJeton(int l, int c){
    Jeton JetonRecup = Cellules[l][c].recupererJeton();
    Cellules[l][c].supprimerJeton();
    return JetonRecup;
}
   
}
