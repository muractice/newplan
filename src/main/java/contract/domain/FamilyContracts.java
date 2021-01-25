package contract.domain;

import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class FamilyContracts {
    private final List<Contract> contracts;

    public FamllyNumber getFamilyNumber(){
        return new FamllyNumber(contracts.size());
    }
}
