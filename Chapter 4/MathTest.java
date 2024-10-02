public class MathTest {
    public static void main(String[] args) {
        double num = 37.0;
        double num2 = 22.7;
        
        // Square Root
        System.out.println("SQRT: " + Math.sqrt(num));
        
        // Sin and Cos of a specific value
        System.out.println("SIN: " + Math.sin(num2));
        System.out.println("COS: " + Math.cos(num2));
        
        // Floor, Ceiling, and Rounding
        System.out.println("FLOOR: " + Math.floor(num2));
        System.out.println("CEIL: " + Math.ceil(num2));
        System.out.println("ROUND: " + Math.round(num2));
        
        // Max and Min between two values
        int maxVal = Math.max(71, 68);
        int minVal = Math.min(71, 68);
        System.out.println("MAX: " + maxVal);
        System.out.println("MIN: " + minVal);
        
        // Random number generation (between 0 and 100)
        double randomVal = 100 * Math.random();
        System.out.println("RANDOM: " + randomVal);
    }
}
