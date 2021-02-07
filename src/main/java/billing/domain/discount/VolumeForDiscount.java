package billing.domain.discount;

import contract.domain.Volume;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum VolumeForDiscount {
    NORMAL(DiscountFee.form(0)),
    LESS_THAN_2_G(DiscountFee.form(1480));

    @Getter
    private final DiscountFee discountFee;

    public static VolumeForDiscount from(Volume volume){
        return (volume == Volume.NORMAL) ? NORMAL : LESS_THAN_2_G;
    }
}
