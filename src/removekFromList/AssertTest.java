package removekFromList;

import org.junit.Assert;
import org.junit.Test;

public class AssertTest {
    private double epsilon = 1e-6;

    @Test
    public void accountCannotHaveNegativeOverdraftLimit() {
        Account account = new Account(-20);

        Assert.assertEquals(0d, account.getOverdraftLimit(), epsilon);

    }

    @Test
    public void accountCannotWithdrawOrDepositNegative(){
        Account account = new Account(100);
        Assert.assertEquals(false,account.withdraw(-50));
        Assert.assertEquals(false,account.deposit(-50));
    }

    @Test
    public void accountWithdrawOrDepositWorksProperly(){
        Account account = new Account(100);

        account.deposit(30);
             Assert.assertEquals(30.0, account.getBalance(), 0);

             account.withdraw(30);
             Assert.assertEquals(0,account.getBalance(), 0);

    }


}