package proxy;

import java.math.BigDecimal;

/**
 * Created by likoguan on 25/03/18.
 */
public interface DepositX {
    void process(Integer account, BigDecimal money);
}
