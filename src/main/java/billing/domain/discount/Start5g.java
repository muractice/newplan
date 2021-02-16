package billing.domain.discount;

import contract.domain.ContractStartDate;
import contract.domain.SmartPhoneType;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Start5g {
    private final Start5gDiscount start5gDiscount;
    private final ContractStartDate contractStartDate;

    static Start5g from(SmartPhoneType smartPhoneType,ContractStartDate contractStartDate){
        return new Start5g(Start5gDiscount.from(smartPhoneType),contractStartDate);
    }

    DiscountFee getDiscountFee(){
        if (contractStartDate.isWithin12months()) return start5gDiscount.getDiscountFee();
        return DiscountFee.form(0);
    }
}
