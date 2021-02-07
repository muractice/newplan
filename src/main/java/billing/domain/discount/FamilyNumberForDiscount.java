package billing.domain.discount;

import contract.domain.FamilyContracts;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum FamilyNumberForDiscount {
    TWO(DiscountFee.form(500))
    ,THREE(DiscountFee.form(1000))
    ,FOUR(DiscountFee.form(2020))
    ,OTHER(DiscountFee.form(0));

    @Getter
    private final DiscountFee discountFee;

    public static FamilyNumberForDiscount from(FamilyContracts familyContracts){
        switch(familyContracts.getFamilyNumber().getValue()) {
            case 2: return FamilyNumberForDiscount.TWO;
            case 3: return FamilyNumberForDiscount.THREE;
            case 4: return FamilyNumberForDiscount.FOUR;
            default: return FamilyNumberForDiscount.OTHER;
        }
    }
}
