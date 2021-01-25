package billing.domain.discount;

import contract.domain.Contract;
import contract.domain.ContractNo;
import contract.domain.DataMax5GPlan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContractForDiscount {
    private final ContractNo contractNo;
    private final DataMax5GPlan dataMax5GPlan;
    private final VolumeForDiscount volume;
    private final Period2years period2years;
    private final Start5G start5G;

    public static ContractForDiscount from(Contract contract){
        return new ContractForDiscount(contract.getContractNo(), contract.getDataMax5GPlan()
                ,contract.getVolume(),contract.getPeriod2years(),Start5G.convert(contract.getSmartPhoneType()));
    }
    DiscountFee calculateDiscountFee(){
        return volume.getDiscountFee().plus(period2years.getDiscountFee()).plus(start5G.getDiscountFee());
    }
}
