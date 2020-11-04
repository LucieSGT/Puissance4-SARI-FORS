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
public class Jeton {
    String Couleur;
    

public Jeton (String uneCouleur){
    Couleur = uneCouleur;
}

public String LireCouleur (){
    //pour jetoncourant
    //si jetoncourant diff de null alors retourner sa couleur
    System.out.println(Couleur);
    return Couleur;
}

@Override
public String toString(){
    if("Rouge".equals(Couleur))
        return "\u0018(31n O";
    return "\u0018(33n 0";
}


}
