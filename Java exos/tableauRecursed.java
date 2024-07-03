public class tableauRecursed {
        // Méthode principale pour additionner tous les éléments d'un tableau
        public static int sum(int[] array) {
            return sum(array, 0);
        }
    
        // Méthode récursive privée qui fait tout le travail
        private static int sum(int[] array, int index) {
            // Condition de terminaison : si l'index dépasse la taille du tableau
            if (index >= array.length) {
                return 0;
            }
    
            // Appel récursif : additionner l'élément actuel et appeler la méthode pour l'élément suivant
            return array[index] + sum(array, index + 1);
        }
    
        public static void main(String[] args) {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println("La somme des éléments du tableau est : " + sum(array));
        }
    }
    

