public class chaineDansChaine {
        // Méthode pour localiser la sous-chaîne dans la chaîne de référence
        public static int[] locateSubstring(String reference, String substring) {
            int firstIndex = reference.indexOf(substring);
            int lastIndex = (firstIndex != -1) ? firstIndex + substring.length() - 1 : -1;
            return new int[]{firstIndex, lastIndex};
        }
    
        public static void main(String[] args) {
            // Exemple de chaînes de caractères
            String reference = "Il n'y a rien par ici";
            String substring = "pas";
    
            // Localiser la sous-chaîne
            int[] result = locateSubstring(reference, substring);
    
            // Afficher les résultats
            if (result[0] != -1) {
                System.out.println("La sous-chaîne '" + substring + "' commence à l'index " + result[0] +
                                   " et se termine à l'index " + result[1] + ".");
            } else {
                System.out.println("La sous-chaîne '" + substring + "' n'a pas été trouvée.");
            }
        }
    }

