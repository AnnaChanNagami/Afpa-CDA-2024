import java.util.Scanner;
//toujours importer scanner pour interagir avec l'utili
public class AgeavecScan{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salut c'est quoi ton age ?");
        //invite l'utili à entrer son âge
        int age = Integer.parseInt(scanner.nextLine());
        //lit l'entrée de l'utili comme une donnée numérique et la convertit en entier
       majorite(age);
       //appelle la méthode majorite avec lage converti (TOUJOURS penser a l'appeler sinon ça fonctionne po)
        scanner.close();}


        public static void majorite (int age) {
            //déclare la méthode pour déterminer si utili est majeur ou mineur
            if (age>17) {
                System.out.println("Vous etes majeur");
            } else {
                System.out.println("Vous etes mineur");
            }
         
}
}
