import org.junit.jupiter.api.Assertions;


public class TestClass {
    Main test = new Main();

    @org.junit.jupiter.api.Test
    public void testTaxesComparing_success() {
        int a = 32040, b = 32568, expected = 0, expected1 = 79;

        int result = test.taxEarningsAndSpendings(a, b);
        int result2 = test.taxEarningsAndSpendings(b, a);

        Assertions.assertEquals(expected, result);
        Assertions.assertEquals(expected1, result2);
    }

    @org.junit.jupiter.api.Test
    public void testFillArray_success() {
        int length = 10;
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] actual = test.fillArray(length);

        Assertions.assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void transferVerify() {
        int a = 4214, b = 4124;

        boolean actual = test.transfer(a, b);

        Assertions.assertTrue(actual);
    }
}
