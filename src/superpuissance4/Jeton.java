/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superpuissance4;

/**
 *
 * @author dia12
 */
public class Jeton {
    private String couleur;
   
      public Jeton( String c){
            couleur=c;
      
    
    
} 

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
      public String lireCouleur(){
          
 System.out.print(couleur)  ;       
         

return (couleur);
 

}

@Override                        
public String toString() {     // affichage de R ou J selon le choix de la couleur 
String chaine_a_retourner;
chaine_a_retourner = couleur;
if (couleur=="rouge")
         return ("R");
else return ("J");



}


}
