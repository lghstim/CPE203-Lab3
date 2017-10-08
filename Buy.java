public class Buy {
   public String buyProductID;
   public double buyPrice;
   public int buyQuantity;

   public Buy(String buyProductID, double buyPrice, int buyQuantity)
   {
      this.buyProductID = buyProductID;
      this.buyPrice = buyPrice;
      this.buyQuantity = buyQuantity;
   }

   public double getProductPrice()
   {
      return this.buyPrice;
   }

   public String getProductID()
   {
      return this.buyProductID;
   }
}
