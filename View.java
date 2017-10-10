public class View {
   private String productID;
   private double productCost;
   private String viewSessionID;

   public View(String viewSessionID, String productID, double productCost) {
      this.productID = productID;
      this.productCost = productCost;
      this.viewSessionID = viewSessionID;
   }

   public double getPriceItem()
   {
      return this.productCost;
   }

   public String getProduct()
   {
      return "View(String " + this.productID + " , double " + this.productCost + ")";
   }
   
   public String toString()
   {
      return "View(String " + this.viewSessionID + ", String " + this.productID + " , double " + this.productCost + ")";
   }

   public String getProductID()
   {
      return this.productID;
   }

   public String getViewSessionID()
   {
      return this.viewSessionID;
   }

   
}
