package billing.domain.otherservice;

import fundametals.UserId;

public interface SmartValueTargetServiceContractRepository {
    public SmartValueTargetServiceContracts findByUserID(UserId userId);
}
