


class BookManagment {

    String Title ;
    String Author;
    String Publisher ;
    String Isbn;
    int Year;
    Double Price;
    int Quantity;

    BookManagment(String Title, String Author, String Publisher, String Isbn, int Year, Double Price, int Quantity){

        this.Title = Title;
        this. Author =Author;
        this. Publisher = Publisher;
        this. Isbn = Isbn;
        this. Year = Year;
        this. Price = Price;
        this. Quantity = Quantity;
    }

      public void setTitle(String Title){
        this.Title= Title;
    } 
    
      public void setAuthor(String Author){
        this.Author= Author;
    } 
      public void setPublisher(String Publisher){
        this.Publisher= Publisher;
    }
      public void setIsbn(String Isbn) {
        this.Isbn= Isbn;
      }   
      public void setYear (int Year){
        this.Year = Year;
      }
      public void setPrice (double Price)
      {
        this.Price= Price;
      }
      public void setQuantity(int Quantity){
        this.Quantity=Quantity;
      }

      String getTitle(){
        return this.Title;
      }
      String gerAuthor(){
        return this.Author;
      }
      String getPublisher(){
        return this.Publisher;
      }
      String getIsbn(){
        return this.Isbn;
      }

      int getYear(){
        return this.Year;
      }

      double getPrice(){
        return this.Price;
      }

      int getQuantity(){
        return this.Quantity;
      }

     public void IncreseQuantity(int number){
        this.Quantity = this.Quantity+number; 

      }

      public void DecreaseQuantity(int quantity){
        if (this.Quantity>quantity)
        this.Quantity = this.Quantity-quantity;
        else
         System.out.println("Quantity is not avilable to decrese");
      }

      
      double getInventoryValue(){
        return this.Price *this.Quantity;
      }

}


class Program {
        public static void main(String[] args) {
            BookManagment bmn = new BookManagment ("The power of your subconcious mind ", "Joseph murphy", 
                                                            "Power", "Isbn", 1995, 250.00,10);
                 System.out.println("The value of the inventory is "+bmn.getInventoryValue());                                           
              bmn.IncreseQuantity(20);
              System.out.println("The value of Inventory after incereasing quantity 20 : "+bmn.getInventoryValue());
              bmn.DecreaseQuantity(10);
             // System.out.println("The value of Inventory after decreasing Quantity 10"+bmn.getInventoryValue());
            System.out.println( "The value of inventory after decreasing quantity 10 :"+bmn.getInventoryValue());
       
        }
}
