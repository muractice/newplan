package billing.domain.discount;

import contract.domain.Contract;
import contract.domain.ContractNo;
import contract.domain.DataMax5GPlan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContractForDiscount {
    private final ContractNo contractNo;
    private final VolumeForDiscount volume;
    private final Period2yearsForDiscount period2YearsForDiscount;
    private final CheeringSmartPhone cheeringSmartPhone;
    private final Start5G start5G;

    public static ContractForDiscount from(Contract contract){
        return new ContractForDiscount(
                contract.getContractNo(),
                VolumeForDiscount.from(contract.getVolume()),
                Period2yearsForDiscount.from(contract.getContractPeriod()),
                CheeringSmartPhone.convert(contract.getDataMax5GPlan()),
                Start5G.from(contract.getSmartPhoneType())
        );
    }
    DiscountFee calculateDiscountFee(){
        return volume.getDiscountFee().plus(period2YearsForDiscount.getDiscountFee())
                .plus(start5G.getDiscountFee()).plus(cheeringSmartPhone.getDiscountFee());
    }
}
