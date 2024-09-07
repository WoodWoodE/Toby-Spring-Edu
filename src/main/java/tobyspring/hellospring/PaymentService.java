package tobyspring.hellospring;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentService {

    public Payment prepare(Long orderId, String currency, BigDecimal foreignCurrencyAmount) {
        //
        //
        //

        return new Payment(orderId,currency, foreignCurrencyAmount,BigDecimal.ZERO, BigDecimal.ZERO, LocalDateTime.now());
    }

    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        Payment prepare = paymentService.prepare(1L, "USD", BigDecimal.valueOf(50.7));
        System.out.println(prepare);
    }
}
