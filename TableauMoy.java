
public class TableauMoy {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau de nombres réels
        double[] doubleArray = {7, 13, 38, 72};

        // Appel des méthodes Sum et Average
        double sum = Sum(doubleArray);
        double average = Average(doubleArray);

        // Affichage des résultats
        System.out.println("Somme: " + sum);
        System.out.println("Moyenne: " + average);
    }

    public static double Sum(double[] doubleArray) {
        double sum = 0;
        for (double value : doubleArray) {
            sum += value;
        }
        return sum;
    }

    public static double Average(double[] doubleArray) {
        double sum = Sum(doubleArray);
        return sum / doubleArray.length;
    }
}

