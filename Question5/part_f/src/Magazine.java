public class Magazine implements SaleableItem {
    public Magazine(){
        System.out.println("Constructor created");
    }

    @Override
    public void sellCopy() {
        System.out.println("Selling a magazine.");
    }
}
