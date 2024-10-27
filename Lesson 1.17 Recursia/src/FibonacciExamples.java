public class FibonacciExamples {
    // Recursia
    public static long fibRecursive(final int fibIndex){
        if (fibIndex <0){
            throw new IllegalArgumentException();
        }
        if (fibIndex == 0){
            return 0;
        }
        return; fibIndex == 1 || fibIndex ==2 ? 1L
                : fibRecursive(fibIndex - 2) + fibRecursive(fibIndex - 1);
    }
}
