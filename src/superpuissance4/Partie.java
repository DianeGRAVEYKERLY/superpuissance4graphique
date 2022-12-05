/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

import java.util.Random;   
import java.util.Scanner;

/**
 *
 * @author dia12
 */
public class Partie {
  private Joueur[] listeJoueurs= new Joueur[2];
 private Joueur joueurcourant;
 private PlateauDeJeu  plateau;
      public void Partie (Joueur joueur1, Joueur joueur2){
          listeJoueurs[0]=joueur1;
          listeJoueurs[1]=joueur2;
          plateau = new PlateauDeJeu();
          
}
public void attribuerCouleurAuxJoueurs() {
    Random n=new Random();
    int nbr = n.nextInt(2);
    
   
   
    
    
    if (nbr==1){
        listeJoueurs[0].AffecterCouleur("rouge");
        listeJoueurs[1].AffecterCouleur("jaune");
        
    }
    else {
       listeJoueurs[0].AffecterCouleur("jaune");
       listeJoueurs[1].AffecterCouleur("rouge");
    }
}   
    public void creerEtAffecterJeton(Joueur j){
        for (int i=1;i<30;i++){
            Jeton jetoni= new Jeton (j.lireCouleur());
            j.AjouterJeton(jetoni);
            
        }
        
        
    }
    public void  placerTrousNoirsEtDesintegrateurs() {
        
     
    for (int i=0;i<3;i++){
        
            
        
          
            Random m=new Random();
            int nb = m.nextInt(7);
            Random l=new Random();
            int mb = l.nextInt(6);
    
        if (plateau.presenceTrouNoir(nb,mb)==true && plateau.presenceDesintegrateur(nb,mb)==true)  {
              plateau.placerTrounoir(nb,mb);
              plateau.placerDesintegrateur(nb,mb);
        }
     
          }
    for(int j=0;j<2;j++){
        Random m=new Random();
            int nb = m.nextInt(7);
            Random l=new Random();
            int mb = l.nextInt(6);
             Random f=new Random();
            int nbr = f.nextInt(7);
            Random h=new Random();
            int mbr = h.nextInt(6);
            
      if (plateau.presenceTrouNoir(nb,mb)==true && plateau.presenceDesintegrateur(nb,mb)==true )  {
              plateau.placerTrounoir(nb,mb);
              
        }
     if (  plateau.presenceDesintegrateur(nbr,mbr)==true &&plateau.presenceTrouNoir(nb,mb)==true)  {
         plateau.placerDesintegrateur(nbr,mbr);
     }
    }
    
    
    
    
    
    
}
    public void initialiserPartie(){
       plateau.viderGrille(listeJoueurs[0],listeJoueurs[1]);
        attribuerCouleurAuxJoueurs();
        
        creerEtAffecterJeton(listeJoueurs[0]);
         creerEtAffecterJeton(listeJoueurs[1]);
         placerTrousNoirsEtDesintegrateurs() ;
        
         
    }
    
      public void lancerPartie(){
          while ((plateau.etreGagnantePourCouleur("rouge")==false) 
                  &&(plateau.etreGagnantePourCouleur("jaune")==false )){
             Scanner sc = new   Scanner(System.in);
              System.out.println("entrez la colonne que vous voulez jouez");
              Jeton j;
              j.affecterJeton(j);
              int colonne;
              colonne = sc.nextInt();
              plateau.ajouterJetonDansColonne(j, colonne);
      } 
      }
}
