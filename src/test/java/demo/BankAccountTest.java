package demo;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
import io.cucumber.java.th.กำหนดให้;
import io.cucumber.java.th.ดังนั้น;
import io.cucumber.java.th.เมื่อ;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount bankAccount;
    private static final double TOL = 1.0E-6;

    @กำหนดให้("ฉันเปิดบัญชีธนาคาร")
    public void ฉันเปิดบัญชีธนาคาร() {
        System.out.println("คุณเปิดบัญชีธนาคาร");
        bankAccount = new BankAccount();
    }

    @ดังนั้น("เงินคงเหลือเป็น {int}")
    public void เงินคงเหลือเป็น(Integer balance) {
        System.out.printf("เงินคงเหลือเป็น %d\n", balance);
        assertEquals(balance, this.bankAccount.getBalance(), TOL);

    }

    @เมื่อ("ฉันฝากเงิน {int}")
    public void ฉันฝากเงิน(Integer amount) {
        System.out.printf("คุณฝากเงิน %d\n", amount);
        bankAccount.deposit(amount);
    }
}
