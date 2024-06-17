public class binToDec {
    public static void main(String[] args) {
        // Chaîne représentant un nombre binaire
        String binaryString1 = "1010"; // Correspond à 10 en base 10
        String binaryString2 = "1101"; // Correspond à 13 en base 10

        // Conversion de binaire à base 10
        int decimalValue1 = Integer.parseInt(binaryString1, 2);
        int decimalValue2 = Integer.parseInt(binaryString2, 2);

        // Affichage des résultats
        System.out.println("La valeur binaire " + binaryString1 + " en base 10 est : " + decimalValue1);
        System.out.println("La valeur binaire " + binaryString2 + " en base 10 est : " + decimalValue2);

        // Si vous avez besoin de travailler avec des nombres plus grands que ceux représentables par un int, utilisez Long.parseLong
        String largeBinaryString = "11011010101110101011101010110101"; // Correspond à une grande valeur en base 10
        long largeDecimalValue = Long.parseLong(largeBinaryString, 2);
        System.out.println("La grande valeur binaire " + largeBinaryString + " en base 10 est : " + largeDecimalValue);
    }
}

