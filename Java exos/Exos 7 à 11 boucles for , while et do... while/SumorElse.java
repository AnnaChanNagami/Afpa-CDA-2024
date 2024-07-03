import java.util.Scanner;
public class SumorElse {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bonjour entrez deux nombres entiers s'il vous plait");
    //Lire les deux nombres séparément et les convertir en entier (TOUJOURS DEFINIR !)
        int number1 = Integer.parseInt(scanner.nextLine());
       
        int number2 = Integer.parseInt(scanner.nextLine());
      //Appel de la méthode customNumberDisplay avec les deux nombres donnés par utili
        customNumberDisplay(number1,number2);
        scanner.close();
    }
    //déclaration de la méthode SumResult
public static void customNumberDisplay(int number1, int number2){
    int sum = number1 + number2;
SumResult(sum ,number1 ,number2);
}
public static void SumResult(int sum, int number1, int number2){
    if (sum>= 100){
    System.out.println(sum);
    }  else {
    System.out.println(number1 * number2);
}


}
}
