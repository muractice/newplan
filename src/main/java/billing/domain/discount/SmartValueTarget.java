package billing.domain.discount;

import billing.domain.otherservice.SmartValueTargetServiceContracts;
import contract.domain.SmartPhoneType;
import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum SmartValueTarget {
    NOT_APPLIED(DiscountFee.form(0)),
    APPLIED(DiscountFee.form(1000));

    @Getter
    private final DiscountFee discountFee;

    public static SmartValueTarget from(SmartValueTargetServiceContracts smartValueTargetServiceContracts){
        return smartValueTargetServiceContracts.targetContractExists()
                ? SmartValueTarget.APPLIED: SmartValueTarget.NOT_APPLIED;
    }
}
