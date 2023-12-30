public class Calculator {
    public static double calculateDiscount(double purchaseAmount, int discountAmount) {
        if (discountAmount < 0) {
            throw new ArithmeticException("Скидка не может быть меньше нуля");
        } else if (discountAmount > 100) {
            throw new ArithmeticException("Скидка не может превышать 100");
        }
        return purchaseAmount - (purchaseAmount * discountAmount) / 100;
    }
}
