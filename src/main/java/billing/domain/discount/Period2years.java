package billing.domain.discount;

import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Period2years {
    NOT_APPLIED(DiscountFee.form(0)),
    APPLIED(DiscountFee.form(170));

    @Getter
    private final DiscountFee discountFee;
}
