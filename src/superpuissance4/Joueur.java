/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

import java.util.ArrayList;


/**
 *
 * @author dia12
 */
public class Joueur {
    private String couleur;
    private String nom;
    private ArrayList<Jeton> ReserveJeton= new ArrayList<Jeton>(); 
    private int NombreDesintegrateurs;
      public Joueur(  int ND,String n){
            NombreDesintegrateurs=0;
            n=nom;
            ND=NombreDesintegrateurs;
      }
            
      public void AffecterCouleur (String couleur) {
          if (couleur=="rouge" || couleur=="jaune") {
          this.couleur=couleur; }
          
      }
      public int nombreDeJetons (){
          return (ReserveJeton.size());
      }
      
      public void AjouterJeton   (Jeton j){
        ReserveJeton.add(j); 
        
      } 
      
      public Jeton jouerJeton(){
      Jeton JetonRetourne=ReserveJeton.remove(0);
         return (JetonRetourne) ;  
                 }
      public void obtenirDesintegrateur(){
          NombreDesintegrateurs+=1;
      }
      public void utiliserDesintegrateur(){
          NombreDesintegrateurs-=1;
          
      }
}
