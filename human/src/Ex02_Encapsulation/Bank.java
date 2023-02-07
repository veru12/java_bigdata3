package Ex02_Encapsulation;

public class Bank {
Encapsulation ec
=new Encapsulation(0, "농협은행","352-1427-9229-53","김창윤");

ec.setDeposit(11000000);

int money = ec.getDeposit();
System.out.println(ec);
System.out.println("계좌 잔액:"+ money);

}
