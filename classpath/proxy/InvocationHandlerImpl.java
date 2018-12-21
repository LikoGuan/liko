package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by likoguan on 25/03/18.
 */
public class InvocationHandlerImpl implements InvocationHandler {

    private BankX bankX;

    public InvocationHandlerImpl(BankX bankX) {
	this.bankX = bankX;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before ...");
        method.invoke(this.bankX, args);
        System.out.println("after ...");
        return null;
    }
}
