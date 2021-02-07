package billing.domain.discount;

import billing.domain.otherservice.SmartValueTargetServiceContracts;
import contract.domain.FamilyContracts;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DiscountService {
    private final FamilyNumberForDiscount familyNumberForDiscount;
    private final SmartValueTarget smartValueTarget;
    private final ContractForDiscount contractForDiscount;

    public static DiscountService from(SmartValueTargetServiceContracts smartValueTargetServiceContracts,
                                       FamilyContracts familyContracts,
                                       ContractForDiscount contractForDiscount){
        return new DiscountService(
                FamilyNumberForDiscount.from(familyContracts),
                SmartValueTarget.from(smartValueTargetServiceContracts),
                contractForDiscount
        );
    }

    public DiscountTotalFee calculate(){
        return DiscountTotalFee.from(familyNumberForDiscount,smartValueTarget,contractForDiscount);
    }
}
