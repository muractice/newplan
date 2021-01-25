package billing.domain.charge;

import contract.domain.Contract;
import contract.domain.ContractNo;
import contract.domain.DataMax5GPlan;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ContractForCharge {
    private final ContractNo contractNo;
    private final DataMax5GPlan dataMax5GPlan;

    public static ContractForCharge from(Contract contract){
        return new ContractForCharge(contract.getContractNo(), contract.getDataMax5GPlan());
    }

    public ContractFee calculateFee(){
        return ContractFee.from(dataMax5GPlan);
    }

}
