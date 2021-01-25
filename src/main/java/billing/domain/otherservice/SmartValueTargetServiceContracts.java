package billing.domain.otherservice;

import billing.domain.discount.SmartValueTarget;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
public class SmartValueTargetServiceContracts {
    private final List<SmartValueTargetServiceContract> values;

    public boolean targetContractExists(){
        return values.size() > 0;
    }
}
