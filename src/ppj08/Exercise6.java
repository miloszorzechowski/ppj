package ppj08;

/**
 * modifyValue method cannot overwrite a variable in the main method because it is outside its scope.
 * num parameter passed to the modifyValue method is the new local variable of that method.
 */
public class Exercise6 {
    public static void main(String[] args) {
        int wrt = 5;
        System.out.println("wrt = " + wrt);

        modifyValue(wrt);
        System.out.println("wrt = " + wrt);
    }

    private static void modifyValue(int num) {
        System.out.println("Passed value: " + num);
        num *= 5;
        System.out.println("Modified value: " + num);
    }
}