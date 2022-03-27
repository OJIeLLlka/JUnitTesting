public class Main {

    public int taxEarningsAndSpendings(int earnings, int spendings) {  //15% от (доходы - расходы)
        int tax = (earnings - spendings) * 15 / 100;
        return Math.max(tax, 0);
    }

    public int[] fillArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public boolean transfer(int a, int b) {
        return a > b;
    }

    public static void main(String[] args) {
    }
}
