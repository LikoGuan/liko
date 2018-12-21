package proxy;

import java.math.BigDecimal;

/**
 * Created by likoguan on 25/03/18.
 */
public class BankX implements DepositX {
        public void process(Integer account, BigDecimal money) {
            System.out.println(account + ", " + money);
        }
}
