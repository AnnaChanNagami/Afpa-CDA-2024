import java.util.Scanner;
public class min {
    public static void main(String[] args) {
        String str = "Hello World!";
        System.out.println(str.toUpperCase()); //prints "HELLO WORLD!"
}
}
public class howmuchMajs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un mot :");
        
        // Lire le mot entré par l'utilisateur
        String mot = scanner.nextLine();
        
        // Initialiser le compteur de majuscules
        int countUppercase = 0;
        
        // Parcourir chaque caractère du mot
        for (int i = 0; i < mot.length(); i++) {
            // Vérifier si le caractère actuel est une majuscule
            if (Character.isUpperCase(mot.charAt(i))) {
                countUppercase++; // Incrémenter le compteur si c'est une majuscule
            }
        }
        
        // Afficher le nombre total de majuscules dans le mot
        System.out.println("Le nombre total de majuscules dans le mot est : " + countUppercase);
        
        // Fermer le scanner après utilisation
        scanner.close();
    }
}

