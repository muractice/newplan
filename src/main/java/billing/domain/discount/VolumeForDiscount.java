package billing.domain.discount;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum VolumeForDiscount {
    NORMAL(DiscountFee.form(0)),
    LESS_THAN_2_G(DiscountFee.form(1480));

    @Getter
    private final DiscountFee discountFee;
}
