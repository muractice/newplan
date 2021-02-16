package billing.domain.discount;

import contract.domain.Contract;
import contract.domain.ContractNo;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContractForDiscount {
    private final ContractNo contractNo;
    private final VolumeForDiscount volume;
    private final Period2yearsForDiscount period2YearsForDiscount;
    private final CheeringSmartPhone cheeringSmartPhone;
    private final Start5g start5g;

    public static ContractForDiscount from(Contract contract){
        return new ContractForDiscount(
                contract.getContractNo(),
                VolumeForDiscount.from(contract.getVolume()),
                Period2yearsForDiscount.from(contract.getContractPeriodConstrain()),
                CheeringSmartPhone.convert(contract.getDataMax5GPlan()),
                Start5g.from(contract.getSmartPhoneType(),contract.getContractStartDate())
        );
    }
    DiscountFee calculateDiscountFee(){
        return volume.getDiscountFee().plus(period2YearsForDiscount.getDiscountFee())
                .plus(start5g.getDiscountFee()).plus(cheeringSmartPhone.getDiscountFee());
    }
}
