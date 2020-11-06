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
public class Cellule {
    Jeton jetonCourant;
    boolean trouNoir;
    boolean desintegrateur;
    
public Cellule (){
    jetonCourant = null ;
    trouNoir = false;
    desintegrateur = false;
}    

public boolean affecterJeton(Jeton unJeton){
    if (jetonCourant == null){
       jetonCourant = unJeton;
       System.out.println("ajout fait");
        return true;
    }
    else {
      System.out.println("ajout pas fait"); 
      return false;
    }
}



public Jeton recupererJeton(){
    Jeton jetonRetour = jetonCourant;
    jetonCourant = null;
    return jetonRetour ;
}

public boolean supprimerJeton(){
    if(jetonCourant==null){
        System.out.println("ne peut pas être supprime car vide");
        return false;
    }
    else{
        jetonCourant=null;
        System.out.println("supression bien passée");
        return true;
    }
}
 
    

  
public boolean placerTrouNoir(){
       if (trouNoir = false){
       trouNoir = true ;
       System.out.println("ajout de trou noir fait");
        return true;
    }
    else {
      System.out.println("ajout de trou noir pas fait"); 
      return false;
    }
}

public boolean placerDesintegrateur(){
    if (desintegrateur = false){
        desintegrateur = true ;
        System.out.println("ajout de desintegrateur fait");
       return true;
    }
    else {
      System.out.println("ajout de desintegrateur pas fait, désintégrateur déjà présent"); 
      return false;
    }
}
 // signale la presence de desintegrateur, on va l'utiliser dans recupererdesintegrateur -> evite la surcharge mais pas indispensable  
/* boolean Desintegrateur(){
     return desintegrateur;
 }*/

public String lireCouleurDuJeton(){
    if (jetonCourant == null){
        return "jeton vide";
    }
    System.out.println("La couleur du jeton est " + jetonCourant.Couleur);
    return jetonCourant.Couleur;
}

// LE NOTRE
/*public boolean recupererDesintegrateur(){
    if(desintegrateur =! false){
        desintegrateur = false;
         System.out.println("suppression du desintegrateur faite");
        return true;  
    }
    else{
         System.out.println("pas de desintegrateur present");
         return false;   
    } 
}*/

    
// signale la presence d'un trou noir
/*boolean TrouNoir(){
    return trouNoir;
}*/

// LE NOTRE    
/*public boolean activerTrouNoir(){
    if(trouNoir = true){
        jetonCourant=null;
        trouNoir = false;
        System.out.println("activation Trou Noir effectuée");
        return true;  
    }
    else{
         System.out.println("pas de trou noir ici");
         return false;
       
    }
    
}*/ 

 //LE NOUVEAU
  public boolean activerTrouNoir(){
      if(trouNoir){
          jetonCourant=null;
          trouNoir=false;
          System.out.println("Plus de jeton! le trou noir l'a avalé");
          return true;
      }
      else{
      return false;
      }
  }

}
