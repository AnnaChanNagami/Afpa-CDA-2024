public class toCamelCase {
    public class UpperCamel { // fonction pour convertir la chaine de carac en camelCase
        static String convertString(String s) {
            //pour faire attention aux espaces
            int ctr = 0;
            // variable pour determoner la longueur de la chaine de carac
            int n = s.length();
            // convertir la chaine en carac en tableau de carac
            char ch[] = s.toCharArray();
            // prend en compte le nombre d'index dans le tableau de carac
            int c = 0;
            // analyse de chaque case
            for (int i = 0; i < n; i++) {
                // Dans la première case la 1ère lettre doit être transformée en camelCase
                // on vérifie celà avant de commencer la deuxième
                //si cet commande est executé lorsqu'il rencontre un espace
                // il n'y a aucun espace dans la chaine de caractère
                if (i == 0)
                    //converstion de la majuscule en utilisant toUpperCase()
                    ch[i] = Character.toUpperCase(ch[i]);
                //comme on doit retirer tout les espaces on vérifie qu'il n'y ait pas de trou dû aux espaces
                if (ch[i] == ' ') {
                    //incrémentation d'un décompte d'espace par un
                    ctr++;
                    //convertion de la lettre après l'espace en majuscule
                    ch[i + 1] = Character.toUpperCase(ch[i + 1]);
                    // bouble jusqu'à la fin
                    continue;
                }
                //si il n'y a pas d'espaces copier le caractère
                else
                    ch[c++] = ch[i];
            }
            //la nouvelle chaine de carac sera plus petite vu que les espaces ont été retiré
            //ce qui nous renvoie la nouvelle chaine de carac avec sa nouvelle taille
            return String.valueOf(ch, 0, n - ctr);
        }
        public static void main(String args[]) {
            //définition de la méthode
            String str = "premier essai";
            System.out.println(convertString(str));
            //définition de la variable
            String str1 = "bonjour les chats";
            System.out.println(convertString(str1));
            //définition de la chaine de carac
            String str2 = "miaou font les chats en retour";
            System.out.println(convertString(str2));
        }
    }
}
