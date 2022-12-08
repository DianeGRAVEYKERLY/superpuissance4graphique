/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

/**
 *
 * @author dia12
 */
public class PlateauDeJeu {
    CelluleDeGrille[][] grille = new CelluleDeGrille [6][7];
    public PlateauDeJeu (){
        for (int i=0;i<7;i++){
            for(int j=0; j<6;j++){
               grille[i][j] = new CelluleDeGrille();
            }
        
            
        }
        
        
       
        
    }
    
    
    public int ajouterJetonDansColonne(Jeton notre_jeton, int colonne){
        for (int i=0; i<7; i++){
            if (grille[i][colonne].presenceJeton()== false){
                grille[i][colonne].affecterJeton(notre_jeton);
                return i;
            }
            
        }
        
return -1;
    }
    
    
    public boolean grilleRemplie(){
        int compteur = 0;
        for (int i=0;i<8;i++){
            for(int j=0; j<7;j++){
               if (grille[i][j]!= null){
                   compteur +=1; //ajoute +1 à chaque fois qu'une case est remplie 
               }     
               }
        }
        //compteur = 42 si toute la grille est remplie
        if (compteur == 42){   
            return true;
        }else{
            return false;
        }
         
    }

    public String afficherGrilleSurConsole() {
        return "PlateauDeJeu{" + "grille=" + grille + '}'; //methode to string
    }
    
    
    public boolean presenceJeton(int x, int y){
        if (grille[x][y] != null){ //on regarde si la cellule est vide ou pas 
            return true;
        }else{
            return false;
        }
    }
    
    public String lireCouleurDuJeton(int x, int y){ //on lit la couleur du jeton présent dans la case s'il y en a un 
        if (grille[x][y].lireCouleurDuJeton() == null){
            return "vide";
        }
        return grille[x][y].lireCouleurDuJeton();
    }
    
        
        public boolean colonneGagnantePourCouleur(String couleur){ //renvoie true si la colonne est gagnante
            boolean verif = false;
            int compteur =0;
            for (int i=0;i<3;i++){
                for(int j=0; j<7;j++){
                    if (grille[i][j].lireCouleurDuJeton()==grille[i+1][j].lireCouleurDuJeton()){
                        if(grille[i+1][j].lireCouleurDuJeton()==grille[i+2][j].lireCouleurDuJeton()){
                            if (grille[i+2][j].lireCouleurDuJeton()==grille[i+3][j].lireCouleurDuJeton()){
                                compteur =1;
                            }
                        }
                    }
                }     
            } 
            if (compteur==1){
                verif = true;
            }
            return verif;
        }
        
        public boolean ligneGagnantePourCouleur(String couleur){//renvoie true si la ligne est gagnante
            boolean verif = false;
            int compteur =0;
            for (int i=0;i<6;i++){
                for(int j=0; j<4;j++){
                    if (grille[i][j].lireCouleurDuJeton()==grille[i][j+1].lireCouleurDuJeton()){
                        if (grille[i][j+1].lireCouleurDuJeton()==grille[i][j+2].lireCouleurDuJeton()){
                            if (grille[i][j+2].lireCouleurDuJeton()==grille[i][j+3].lireCouleurDuJeton()){
                                compteur =1;
                            }
                        }
                    }
                }
                
            }
            if (compteur==1){
                verif = true;
            }
            return verif;
        }
              
        
        public boolean diagonaleMontanteGagnantePourCouleur(String couleur){ //renvoie true si la diagonale montante est gagnante
            boolean verif = false;
            int compteur =0;
            for (int i=0;i<3;i++){
                for (int j=0; j<4; j++){
                    if (grille[i][j].lireCouleurDuJeton()==grille[i+1][j+1].lireCouleurDuJeton()){
                        if(grille[i+1][j+1].lireCouleurDuJeton()==grille[i+2][j+2].lireCouleurDuJeton()){
                            if(grille[i+2][j+2].lireCouleurDuJeton()==grille[i+3][j+3].lireCouleurDuJeton()){
                                compteur =1;
                            }
                        }
                    }
                }
            }
            if (compteur==1){
                verif = true;
            }
            return verif;
        }
        
        
        public boolean diagonaleDesencanteGagnantePourCouleur(String couleur){//renvoie true si la diagonale descendante est gagnante
            boolean verif = false;
            int compteur =0;
            for (int i=6;i<3;i--){
                for (int j=0; j<7; j++){
                    if (grille[i][j].lireCouleurDuJeton()==grille[i-1][j+1].lireCouleurDuJeton()){
                        if(grille[i-1][j+1].lireCouleurDuJeton()==grille[i-2][j+2].lireCouleurDuJeton()){
                            if(grille[i-2][j+2].lireCouleurDuJeton()==grille[i-3][j+3].lireCouleurDuJeton()){
                                compteur=1;
                            }
                        }
                    }
                }
            }
            if (compteur==1){
                verif = true;
            }
            return verif;
            
        }

        
        

    public void tasserColonne(int j){
        for (int i=0; i<6; i++){
            if ( grille[i][j].presenceJeton()==false && grille[i+1][j].presenceJeton()==true){
                grille[i][j] = grille[i+1][j];
                
            }
        }
    
    }
    
    public boolean colonneRemplie(int j){ //on regarde si une colonne est remplie 
        int compteur = 0;
        for (int i=0; i<7; i++){
            if (grille[i][j].presenceJeton()==true){
                compteur+=1;
            }
        }
        if (compteur == 7){
            return true;
        }
    return true;
    }
    
    public boolean presenceTrouNoir(int i, int j){ //on regarde si un trou noir est present dans la case
        if (grille[i][j].presenceTrouNoir()==true){
            return true;
        }else{
            return false;
        }
    }
    
    public void placerTrouNoir(int i, int j){ //ajoute un trou noir à l’endroit indiqué
        grille[i][j].placerTrouNoir();
    }
    
    public void supprimerTrouNoir(int i, int j){ // supprime un trou noir à l’endroit indiqué
        grille[i][j].supprimerTrouNoir();
    }
    
    public void placerDesintegrateur(int i,int j){//ajoute un désintégrateur à l’endroit indiqué.
        grille[i][j].placerDesintegrateur();
    } 
    
    public void supprimerDesintegrateur(int i,int j){ //supprime un désintégrateur à l’endroit indiqué
        grille[i][j].supprimerDesintegrateur();
    }
    
    public boolean presenceDesintegrateur (int i, int j){ //on regarde si un desintegrateur est présent dans la cellule
        if (grille[i][j].presenceDesintegrateur()==true){
            return true;
        }else{
            return false;
        }
    }
    
    public void supprimerJeton(int i, int j){ //supprime le jeton de la cellule visée
        grille[i][j].supprimerJeton();
    }
    
    public Jeton recupererJeton(int i, int j){ //enlève le jeton de la cellule visée et renvoie une référence vers ce jeton
        grille[i][j].recupererJeton();
        return grille[i][j].recupererJeton();
    }
}

