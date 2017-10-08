public class View {
   private int productID;
   private double productCost;

   public View(String productID, double productCost) {
      this.productID = productID;
      this.productCost = productCost;
   }

   public double getPriceItem()
   {
      return this.productCost;
   }

   
}
