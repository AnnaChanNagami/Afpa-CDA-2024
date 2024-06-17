public class TableauSum {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau de nombres réels
        double[] doubleArray = { 5, 12, 48, 92 };
        int somme = 0;
        // on définit la taille du tableau
        int length = doubleArray.length; 
        // doubleArray.lenghth = j de l'énoncé 
        int j = 3;
        for (int i = 0; i < j; i++) {
            System.out.println(i);
                somme += doubleArray[i];
           }   //double Array = tableau, number = "i" d'abord avoir valeur1 pour reboucle 
           System.out.println(somme);
        }
    }


