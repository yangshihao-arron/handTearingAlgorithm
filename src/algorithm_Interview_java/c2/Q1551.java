package algorithm_Interview_java.c2;

public class Q1551 {
    public int minOperations(int n) {
        return (n * n-(n&1)) >> 2;
    }
}
