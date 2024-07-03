import java.util.Scanner;
public class chaineVoye {
    public static void main(String[] args) {
        // Préparer le scanner pour lire l'entrée de l'utilisateur
        Scanner myObj = new Scanner(System.in);
        String mot;
        
        // Demander à l'utilisateur d'entrer un mot de plus d'une lettre
        System.out.println("Entrez un mot de plus d'une lettre"); 
        mot = myObj.nextLine();   
        
        // Afficher le mot de l'utilisateur
        System.out.println("Votre mot est " + mot);        
        
        // Convertir le mot en minuscules pour une comparaison plus facile
        mot = mot.toLowerCase();
        int count = 0; // Initialiser le compteur de voyelles

        // Parcourir chaque caractère du mot
        for (int i = 0; i < mot.length(); i++) {
            // Vérifier si le caractère actuel est une voyelle
            if (mot.charAt(i) == 'a' || mot.charAt(i) == 'e'
                || mot.charAt(i) == 'i' || mot.charAt(i) == 'o'
                || mot.charAt(i) == 'u' || mot.charAt(i) == 'y') {
                count++; // Incrémenter le compteur si c'est une voyelle
            }
        }

        // Afficher le nombre total de voyelles dans le mot
        System.out.println("Le nombre total de voyelles dans le mot est : " + count);
        
        // Fermer le scanner après utilisation
        myObj.close();
    }
}
