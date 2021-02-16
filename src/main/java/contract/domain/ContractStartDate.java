package contract.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

@AllArgsConstructor
public class ContractStartDate {
    @Getter
    private final LocalDate value;

    public boolean isWithin12months(){
        LocalDate now = LocalDate.now();
        if(Period.between(value,now).getMonths() > 12) return false;
        return true;
    }

}
