public class View {
   private String productID;
   private double productCost;

   public View(String productID, double productCost) {
      this.productID = productID;
      this.productCost = productCost;
   }

   public double getPriceItem()
   {
      return this.productCost;
   }

   public String getProduct()
   {
      return "View(String " + this.productID + " , double " + this.productCost + ")";
   }

   
}
