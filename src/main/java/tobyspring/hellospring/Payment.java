package tobyspring.hellospring;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Payment {
    private Long orderId;
    private String currency;
    private BigDecimal foreignCurrencyAmount;
    private BigDecimal exRates;
    private BigDecimal convertedAmount;
    private LocalDateTime validUntill;

    public Payment(Long orderId, String currency, BigDecimal foreignCurrencyAmount, BigDecimal exRates, BigDecimal convertedAmount, LocalDateTime validUntill) {
        this.orderId = orderId;
        this.currency = currency;
        this.foreignCurrencyAmount = foreignCurrencyAmount;
        this.exRates = exRates;
        this.convertedAmount = convertedAmount;
        this.validUntill = validUntill;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "orderId=" + orderId +
                ", currency='" + currency + '\'' +
                ", foreignCurrencyAmount=" + foreignCurrencyAmount +
                ", exRates=" + exRates +
                ", convertedAmount=" + convertedAmount +
                ", validUntill=" + validUntill +
                '}';
    }
}
