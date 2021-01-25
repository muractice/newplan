package contract.domain;

import billing.domain.charge.ContractForCharge;
import fundametals.UserId;

public interface ContractRepository {
    public Contract findByUserId(UserId userId);

    public FamilyContracts findFamilyContractsByUserId(UserId userId);
}
