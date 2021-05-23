package casestudy4;

public class BalanceInquiry extends Transaction {

//  Constructors
  BalanceInquiry() { super(); }
  public BalanceInquiry(int accNum) { super(accNum); }

//  Methods
  public void execute(double bal) {
      super.execute();
      System.out.println("Balance: " + bal);
  }

}