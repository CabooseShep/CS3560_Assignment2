public class Ticket implements SaleableItem{

    public Ticket(){
        System.out.println("Constructor created");
    }

    @Override
    public void sellCopy(){
        System.out.println("Selling a ticket.");
    }
}
