public class RetailStore {
    public static void main(String[] args) {
        IWarehouse warehouse = new ProxyWarehouse();

        warehouse.addProduct("Chips");
        warehouse.addProduct("Biscuit");
        warehouse.addProduct("Pepsi");

        warehouse.addStock(100, 5);
        warehouse.addStock(101, 20);
        warehouse.addStock(102, 10);

        warehouse.deliverProduct(100, 2);
        warehouse.deliverProduct(102, 5);
    }
}
