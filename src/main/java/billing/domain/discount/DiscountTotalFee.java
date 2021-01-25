package billing.domain.discount;

import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class DiscountTotalFee {
    @Getter
    private final DiscountFee discountFee;

    public static DiscountTotalFee from(FamilyNumberForDiscount familyNumberForDiscount
            , SmartValueTarget smartValueTarget
            , ContractForDiscount contract){
        return new DiscountTotalFee(familyNumberForDiscount.getDiscountFee()
                .plus(smartValueTarget.getDiscountFee())
                .plus(contract.calculateDiscountFee())
        );
    }

    public Fee convertFee(){
        return discountFee.getFee();
    }
}
