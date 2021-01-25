package billing.domain;

import billing.domain.charge.ContractFee;
import billing.domain.discount.DiscountTotalFee;
import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class TotalFee {
    @Getter
    private final Fee fee;

    public static TotalFee from(ContractFee contractFee, DiscountTotalFee discountTotalFee){
        return new TotalFee(contractFee.getFee().minus(discountTotalFee.getDiscountFee().getFee()));
    }
}
