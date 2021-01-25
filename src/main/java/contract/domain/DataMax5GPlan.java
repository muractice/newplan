package contract.domain;

import fundametals.Fee;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum DataMax5GPlan {
    WITH_AMAZON_PRIME(Fee.of(9350)),
    WITH_NETFLIX(Fee.of(9650)),
    WITH_ALL_STAR(Fee.of(11150))
    ;

    @Getter
    private final Fee fee;
}
