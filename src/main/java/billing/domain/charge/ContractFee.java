package billing.domain.charge;

import fundametals.Fee;
import contract.domain.DataMax5GPlan;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class ContractFee {
    @Getter
    private final Fee fee;

    static ContractFee from(DataMax5GPlan dataMax5GPlan){
        return new ContractFee(dataMax5GPlan.getFee());
    }
}
