/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

/**
 *
 * @author dia12
 */
public class CelluleDeGrille {
    private Jeton jetonCourant; //premier attribut
    private boolean avoirTrouNoir; //2ème attribut
    private boolean avoirDesintegrateur; //3ème attribut

    
    
    //jetoncourant devient null
    public void Celluledegrille(){
        jetonCourant = null;
        avoirTrouNoir = false;
        avoirDesintegrateur = false;
        
    }
    
    // methode pour tester si le jeton est présent ou non 
    public boolean presenceJeton(){
        if (jetonCourant != null){
            return true;
        }else{
            return false;
        }
        
    }

    public void affecterJeton(Jeton jetonCourant) { //accesseur pour ajouter le jeton en paramètre à la cellule 
        this.jetonCourant = jetonCourant;
    }
    
    
    public String lireCouleurDuJeton(){
        if (jetonCourant != null){
            return jetonCourant.lireCouleur();
        }else{
            return "vide";
        }
        
    }
    
 
    
    public void placerTrouNoir(){ //ajout trou noir
        avoirTrouNoir = true;
        
    }
    
    public void supprimerTrouNoir() { //suppression trou noir 
        avoirTrouNoir = false;
    }
    
    public boolean presenceTrouNoir() { //savoir si un trou noir est présent 
        if(avoirTrouNoir == true){
            return true;
        }else{
            return false;
        }
    }
    
    public Jeton recupererJeton(){ //on récupère le jeton dans la grille 
        Jeton jetontemporaire;
        jetontemporaire = jetonCourant;
        jetonCourant = null;
        return jetontemporaire;
    }
    
    
    
    public void supprimerJeton() { //suppression du jeton (trou noir ou désintégrateur)
        jetonCourant = null;
    }
    
    public boolean presenceDesintegrateur(){ //savoir si un désintégrateur est présent 
        if (avoirDesintegrateur == true){
            return true;
        }else{
            return false;
        }
    }
    
    public void placerDesintegrateur() { //ajout d'un désintégrateur 
        avoirDesintegrateur = true;
    }
    
    public void supprimerDesintegrateur () { //suppression d'un désintégrateur 
        avoirDesintegrateur = false; 
    }
    
    public void activerTrouNoir(){
        supprimerTrouNoir();
        supprimerJeton();
    }
    
    //@Override
    public String toString() { //identifier ce qui est dans la cellule 
                
        if (jetonCourant != null){
            return jetonCourant.toString();
        }
        if (avoirTrouNoir == true){
            System.out.print("@");
            
        }
        if (avoirDesintegrateur == true){
            System.out.print("D");
        }
        if (jetonCourant == null & avoirTrouNoir==false & avoirDesintegrateur == false){
            System.out.print(".");   
        }
       return toString(); 
    }
    
}
