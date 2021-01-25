package billing.domain.discount;

import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class DiscountFee {
    @Getter
    private final Fee fee;

    public static DiscountFee of(Fee fee){
        return new DiscountFee(fee);
    }
    public static DiscountFee form(Integer fee){
        return new DiscountFee(Fee.of(fee));
    }

    public DiscountFee plus(DiscountFee discountFee){
        return new DiscountFee(fee.plus(discountFee.getFee()));
    }
}
