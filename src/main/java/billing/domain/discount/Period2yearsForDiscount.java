package billing.domain.discount;

import contract.domain.ContractPeriodConstrain;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Period2yearsForDiscount {
    APPLIED(DiscountFee.form(170)),
    NOT_APPLIED(DiscountFee.form(0));

    @Getter
    private final DiscountFee discountFee;

    public static Period2yearsForDiscount from(ContractPeriodConstrain contractPeriodConstrain){
        return contractPeriodConstrain == ContractPeriodConstrain.TWO_YEARS ? APPLIED : NOT_APPLIED;
    }
}
