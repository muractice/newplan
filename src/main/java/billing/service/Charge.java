package billing.service;

import billing.domain.charge.ContractForCharge;
import billing.domain.discount.ContractForDiscount;
import billing.domain.discount.DiscountTotalFee;
import contract.domain.Contract;
import contract.domain.ContractRepository;
import billing.domain.discount.Discount;
import billing.domain.TotalFee;
import billing.domain.otherservice.SmartValueTargetServiceContractRepository;
import billing.domain.otherservice.SmartValueTargetServiceContracts;
import contract.domain.FamilyContracts;
import fundametals.UserId;

public class Charge {
    ContractRepository contractRepository;
    SmartValueTargetServiceContractRepository smartValueTargetServiceContractRepository;

    public TotalFee calculate(UserId userId){
        Contract contract = contractRepository.findByUserId(userId);

        ContractForCharge contractForCharge = ContractForCharge.from(contract);

        ContractForDiscount contractForDiscount = ContractForDiscount.from(contract);
        FamilyContracts familyContracts = contractRepository.findFamilyContractsByUserId(userId);
        SmartValueTargetServiceContracts smartValueTargetServiceContracts
                = smartValueTargetServiceContractRepository.findByUserID(userId);
        Discount discount = Discount.from(familyContracts,smartValueTargetServiceContracts,contractForDiscount);

        return TotalFee.from(contractForCharge.calculateFee(),discount.calculate());
    }

}
