public class TableauInverse {
    public static void main(String[] args) { 
        double[] doubleArray = {5, 12, 48, 92};
    // Affichage des nombres contenus dans le tableau
        System.out.println("Tableau original:");
        for (double number : doubleArray) {
            System.out.println(number);
        }
    // Inversion du tableau
        double[] invertedArray = invert(doubleArray);
    // Affichage des nombres contenus dans le tableau inversé
        System.out.println("Tableau inversé:");
        for (double number : invertedArray) {
            System.out.println(number);
        }
    }
    public static double[] invert(double[] array) {
    // déclaration de la méthode invert
        double[] newArray = new double[array.length];
        // initialisation à zéro si i est inférieur à la taille du tableau alors i = i+1
        for (int i = 0; i < array.length; i++) {
        // alors le nouveau tableat sera le premier mais à l'envers
            newArray[i] = array[array.length - 1 - i];
        }
        return newArray;
    }
}
