package contract.domain;

import billing.domain.discount.Period2yearsForDiscount;
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
    private final Volume volume;
    @Getter
    private final ContractPeriod contractPeriod;
    @Getter
    private final SmartPhoneType smartPhoneType;

}
