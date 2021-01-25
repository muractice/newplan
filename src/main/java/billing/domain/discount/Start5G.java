package billing.domain.discount;

import contract.domain.SmartPhoneType;
import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Start5G {
    NOT_APPLIED(DiscountFee.form(0)),
    APPLIED(DiscountFee.form(1400));

    @Getter
    private final DiscountFee discountFee;

    public static Start5G convert(SmartPhoneType smartPhoneType){
        return (smartPhoneType == SmartPhoneType.FIVE_G)
                ? Start5G.APPLIED : Start5G.NOT_APPLIED;
    }
}
