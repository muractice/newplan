package contract.domain;

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
    private final ContractPeriodConstrain contractPeriodConstrain;
    @Getter
    private final SmartPhoneType smartPhoneType;
    @Getter
    private final ContractStartDate contractStartDate;

}
