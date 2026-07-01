package oops_practice.gcr_codebase.inheritance;

interface CouponValidator {

    boolean validateCoupon(String code);

    static boolean isLengthValid(String code) {
        return code.length() >= 6;
    }
}

class ShoppingCart implements CouponValidator {

    public boolean validateCoupon(String code) {

        return CouponValidator.isLengthValid(code)
                && code.startsWith("SAVE");
    }
}

public class OnlineCouponValidator {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "SAVE50",
                "ABC123",
                "SA20",
                "SAVE100"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String code : coupons) {

            if (cart.validateCoupon(code))
                System.out.println(code + " -> Valid Coupon");
            else
                System.out.println(code + " -> Invalid Coupon");
        }
    }
}