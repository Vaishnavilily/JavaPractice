public class CalcDiscount{
  public static void main(String[] args){
    int discount = 10;
    double totalPrice = 5000;
    double totalPriceAfterDiscount = totalPrice * (1-((double)discount/100));
    System.out.println("Total Price After Discount is:"+totalPriceAfterDiscount);
  }
}
