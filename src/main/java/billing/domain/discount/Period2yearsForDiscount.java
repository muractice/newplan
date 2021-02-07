package billing.domain.discount;

import contract.domain.ContractPeriod;
import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Period2yearsForDiscount {
    APPLIED(DiscountFee.form(170)),
    NOT_APPLIED(DiscountFee.form(0));

    @Getter
    private final DiscountFee discountFee;

    public static Period2yearsForDiscount from(ContractPeriod contractPeriod){
        return contractPeriod == ContractPeriod.TWO_YEARS ? APPLIED : NOT_APPLIED;
    }
}
