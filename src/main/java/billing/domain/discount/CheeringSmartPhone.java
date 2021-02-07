package billing.domain.discount;

import contract.domain.DataMax5GPlan;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CheeringSmartPhone {
    //      追加した時に何か対応しないとエラーになるようにした方がいいか？？
    //      例えばCheeringSmartPhoneもプランごとに列挙するとか

    TYPE_1400(DiscountFee.form(1400)),
    TYPE_1500(DiscountFee.form(1500));

    @Getter
    private final DiscountFee discountFee;

    public static CheeringSmartPhone convert(DataMax5GPlan dataMax5GPlan){
        switch (dataMax5GPlan){
            case WITH_ALL_STAR: return TYPE_1500;
            default:return TYPE_1400;
        }
    }
}
