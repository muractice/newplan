package billing.domain.discount;

import contract.domain.SmartPhoneType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Start5gDiscount {
    NOT_APPLIED(DiscountFee.form(0)),
    APPLIED(DiscountFee.form(1400));

    @Getter
    private final DiscountFee discountFee;

    public static Start5gDiscount from(SmartPhoneType smartPhoneType){
        return (smartPhoneType == SmartPhoneType.FIVE_G)
                ? Start5gDiscount.APPLIED : Start5gDiscount.NOT_APPLIED;
    }
}
