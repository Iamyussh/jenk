public class BrokenApp {

    public static void main(String[] args) {
        System.out.println("Starting BrokenApp...");

        // Deliberate error: Missing semicolon
        int a = 5
        int b = 10;

        // Deliberate error: Undefined variable 'c'
        int result = a + b + c;

        // Another error: Calling a method that doesn't exist
        printResult(result);
    }

    // No method defined: printResult(int)
}
