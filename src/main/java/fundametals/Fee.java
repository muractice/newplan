package fundametals;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class Fee {
    @Getter
    private final int value;

    public static Fee of(int value){
        return new Fee(value);
    }

    public Fee plus(Fee fee){
        return new Fee(value + fee.getValue());
    }

    public Fee minus(Fee fee){
        return new Fee(value - fee.getValue());
    }

}
