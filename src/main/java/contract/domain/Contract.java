package contract.domain;

import billing.domain.discount.Period2years;
import billing.domain.discount.VolumeForDiscount;
import fundametals.UserId;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Contract {
    @Getter
    private final ContractNo contractNo;
    @Getter
    private final UserId userId;
    @Getter
    private final DataMax5GPlan dataMax5GPlan;
    @Getter
    private final VolumeForDiscount volume;
    @Getter
    private final Period2years period2years;
    @Getter
    private final SmartPhoneType smartPhoneType;

}
