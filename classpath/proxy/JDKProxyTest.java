package proxy;

import java.lang.reflect.Proxy;
import java.math.BigDecimal;

/**
 * Created by likoguan on 24/03/18.
 */

public class JDKProxyTest {

    public static void main(String[] args) {
	BankX bankX = new BankX();
        InvocationHandlerImpl invocationHandlerImpl = new InvocationHandlerImpl(bankX);
        DepositX depositX = (DepositX) Proxy.newProxyInstance(
			invocationHandlerImpl.getClass().getClassLoader(), 
			bankX.getClass().getInterfaces(), 
			invocationHandlerImpl);
        depositX.process(1, new BigDecimal(0.03));
    }
}
