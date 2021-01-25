package billing.domain.discount;

import billing.domain.otherservice.SmartValueTargetServiceContracts;
import contract.domain.FamilyContracts;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Discount {
    private final FamilyNumberForDiscount familyNumberForDiscount;
    private final SmartValueTarget smartValueTarget;
    private final ContractForDiscount contractForDiscount;

    public static Discount from(FamilyContracts familyContracts, SmartValueTargetServiceContracts smartValueTargetServiceContracts,
                                ContractForDiscount contractForDiscount){

        return new Discount(FamilyNumberForDiscount.convert(familyContracts)
                , SmartValueTarget.from(smartValueTargetServiceContracts)
                ,contractForDiscount);
    }

    public DiscountTotalFee calculate(){
        return DiscountTotalFee.from(familyNumberForDiscount,smartValueTarget,contractForDiscount);
    }
}
