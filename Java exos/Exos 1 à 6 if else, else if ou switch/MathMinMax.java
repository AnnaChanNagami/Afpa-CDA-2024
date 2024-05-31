public class MathMinMax {
    public static void findMinMax(long var1, long var2, long var3) {
        
        long min = 0;
        long max = 0;        
        // compare values and change values for min and max.

        if (var1 > var2 && var1 > var3) {
            max = var1;
            min = Math.min(var2, var3);
        } else if (var2 > var1 && var2 > var3) {
            max = var2;
            min = Math.min(var1, var3);
        } else {
            max = var3;
            min = Math.min(var1, var2);
        }
    System.out.println("Le maximum est de " + max + " et le minimum de " + min);    
    }
    
}
