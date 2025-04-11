public class MathTest {
    public static void main(String[] args) {

        // 1. Square root of 37
        System.out.println("The square root of 37 is: " + Math.sqrt(37));

        // 2. Sine and Cosine of 300 degrees (converted to radians)
        double angle = Math.toRadians(300);
        System.out.println("The sine of 300 degrees: " + Math.sin(angle));
        System.out.println("The cosine of 300 degrees: " + Math.cos(angle));

        // 3. Floor, ceiling, and round of 22.8
        double value = 22.8;
        System.out.println("The floor of 22.8: " + Math.floor(value));
        System.out.println("The ceiling of 22.8: " + Math.ceil(value));
        System.out.println("The rounded value of 22.8: " + Math.round(value));

        // 4. Larger and smaller of 'D' and 71
        char letter = 'D'; // ASCII value of 'D' is 68
        int number = 71;
        System.out.println("The larger of 'D' and 71: " + Math.max(letter, number));
        System.out.println("The smaller of 'D' and 71: " + Math.min(letter, number));

        // 5. Random number between 0 and 20
        double random = Math.random() * 20;
        System.out.println("A random number between 0 and 20: " + random);
    }
}


// public class Math{
//     public squareroot(int val){
//         return (val * val);
//     }

//     public trignometric(val)
    
// }