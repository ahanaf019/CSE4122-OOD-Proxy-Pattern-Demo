public class ProxyWarehouse implements Warehouse {

    private RealWarehouse realWarehouse;



    @Override
    public int addProduct(String productName) {
        if(realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }

        return realWarehouse.addProduct(productName);
    }

    @Override
    public void updateProduct(int productID, String newProductName) {
        if(realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
        realWarehouse.updateProduct(productID, newProductName);
    }

    @Override
    public void deleteProduct(int productID) {
                if(realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
        realWarehouse.deleteProduct(productID);
    }

    @Override
    public String getProduct(int productID) {
        if(realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
        return realWarehouse.getProduct(productID);
    }

    @Override
    public void addStock(int productID, int quantity) {
                if(realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
        realWarehouse.addStock(productID, quantity);
    }

    @Override
    public void deliverProduct(int productID, int quantity) {
                if(realWarehouse == null) {
            realWarehouse = new RealWarehouse();
        }
        realWarehouse.deliverProduct(productID, quantity);
    }
    
    
}
