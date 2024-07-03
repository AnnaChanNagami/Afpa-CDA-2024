public class decToBin {
    public static void main(String[] args) {
        // Nombres en base 10
        int decimalNumber1 = 10;
        int decimalNumber2 = 13;

        // Conversion de base 10 à binaire
        String binaryString1 = Integer.toBinaryString(decimalNumber1);
        String binaryString2 = Integer.toBinaryString(decimalNumber2);

        // Affichage des résultats
        System.out.println("La valeur décimale " + decimalNumber1 + " en binaire est : " + binaryString1);
        System.out.println("La valeur décimale " + decimalNumber2 + " en binaire est : " + binaryString2);

        // Si vous avez besoin de travailler avec des nombres plus grands que ceux représentables par un int, utilisez Long.toBinaryString
        long largeDecimalNumber = 123456789L;
        String largeBinaryString = Long.toBinaryString(largeDecimalNumber);
        System.out.println("La grande valeur décimale " + largeDecimalNumber + " en binaire est : " + largeBinaryString);
    }
}

    

