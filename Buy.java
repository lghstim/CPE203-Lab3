public class Buy {
   private String buyProductID;
   private  double buyPrice;
   private int buyQuantity;
   private String buySessionID;

   public Buy(String buySessionID, String buyProductID, double buyPrice, int buyQuantity)
   {
      this.buyProductID = buyProductID;
      this.buyPrice = buyPrice;
      this.buyQuantity = buyQuantity;
      this.buySessionID = buySessionID;
   }

   public double getProductPrice()
   {
      return this.buyPrice;
   }

   public String getProductID()
   {
      return this.buyProductID;
   }

   public String getBuySessionID()
   {
      return this.buySessionID;
   }
}
