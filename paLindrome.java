public class paLindrome {
    public static void main(String[] args) {
        String testString = "Élu par cette crapule!";
        boolean isPalindrome = isPalindrome(testString);
        System.out.println("La chaîne \"" + testString + "\" est un palindrome : " + isPalindrome);
    }

    public static boolean isPalindrome(String input) {
        // Normaliser la chaîne : enlever les diacritiques, convertir en minuscules, enlever les espaces et ponctuation
        String cleaned = cleanString(input);

        // Vérifier si la chaîne nettoyée est égale à son inverse
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    public static String cleanString(String input) {
        // Enlever les diacritiques en remplaçant les caractères accentués par leur équivalent sans accent
        String withoutDiacritics = input.replaceAll("[éèêë]", "e")
                                        .replaceAll("[àâä]", "a")
                                        .replaceAll("[îï]", "i")
                                        .replaceAll("[ôö]", "o")
                                        .replaceAll("[ùûü]", "u")
                                        .replaceAll("[ç]", "c")
                                        .replaceAll("[ÉÈÊË]", "E")
                                        .replaceAll("[ÀÂÄ]", "A")
                                        .replaceAll("[ÎÏ]", "I")
                                        .replaceAll("[ÔÖ]", "O")
                                        .replaceAll("[ÙÛÜ]", "U")
                                        .replaceAll("[Ç]", "C");

        // Enlever les caractères non-alphabétiques et convertir en minuscules
        String cleaned = withoutDiacritics.replaceAll("[^a-zA-Z]", "").toLowerCase();

        return cleaned;
    }
}
    

