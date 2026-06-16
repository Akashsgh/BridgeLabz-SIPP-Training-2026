public class SumofNaturalNumber {
    static int SumofNaturalNumbers(int n) {
        if (n == 0)
            return 0;

        return n + SumofNaturalNumbers(n - 1);
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(SumofNaturalNumbers(n));
    }
    
}
