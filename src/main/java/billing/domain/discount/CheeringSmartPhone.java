package billing.domain.discount;

import contract.domain.DataMax5GPlan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum CheeringSmartPhone {
    WITH_AMAZON_PRIME(DiscountFee.form(1400)),
    WITH_NETFLIX(DiscountFee.form(1400)),
    WITH_ALL_STAR(DiscountFee.form(1500));

    private final DiscountFee discountFee;

    public static CheeringSmartPhone convert(DataMax5GPlan dataMax5GPlan){
        switch (dataMax5GPlan){
            case WITH_AMAZON_PRIME: return WITH_AMAZON_PRIME;
            case WITH_NETFLIX:return WITH_NETFLIX;
            default:return WITH_ALL_STAR;
        }
    }
}
