import java.util.HashMap;

public class RealWarehouse implements Warehouse {

    private HashMap<Integer, String> productList;
    private HashMap<Integer, Integer> productStock;
    private int productIDCounter = 100;

    public RealWarehouse() {
        productList = new HashMap<Integer, String>();
        productStock = new HashMap<Integer, Integer>();
    }

    @Override
    public int addProduct(String productName) {
        productList.put(productIDCounter, productName);
        productStock.put(productIDCounter, 0);
        System.out.println("PRODUCT ADDED. name: " + productName + ", id:" + productIDCounter);
        productIDCounter += 1;
        return productIDCounter - 1;
    }

    @Override
    public void updateProduct(int productID, String newProductName) {
        if(!productList.containsKey(productID)) {
            System.out.println("ERROR: Product was not found inside warehouse.");
            return;
        }

        System.out.println("PRODUCT UPDATED. old_name: " + productList.get(productID) + ", new_name:" + newProductName);
        productList.replace(productID, newProductName);

    }

    @Override
    public void deleteProduct(int productID) {
        
        if(!productList.containsKey(productID)) {
            System.out.println("ERROR: Product was not found inside warehouse.");
            return;
        }

        System.out.println("PRODUCT REMOVED. name: " + productList.get(productID));
        productList.remove(productID);
        productStock.remove(productID);
    }

    @Override
    public String getProduct(int productID) {

        if(!productList.containsKey(productID)) {
            System.out.println("ERROR: Product was not found inside warehouse.");
            return null;
        }

        return productList.get(productID);
    }

    @Override
    public void addStock(int productID, int quantity) {
        if(!productList.containsKey(productID)) {
            System.out.println("ERROR: Product was not found inside warehouse.");
            return;
        }
        System.out.println("Stock Added. name: " + productList.get(productID) + ", quantity:" + quantity);
        productStock.put(productID, quantity);
    }

    @Override
    public void deliverProduct(int productID, int quantity) {
        if(!productList.containsKey(productID)) {
            System.out.println("ERROR: Product was not found inside warehouse.");
            return;
        }
        
        int currentQuantity = productStock.get(productID);
        if(currentQuantity - quantity < 0) {
            System.out.println("ERROR: Product does not have the desired stock in warehouse.");
            return;
        }
        productStock.put(productID, currentQuantity - quantity);
        System.out.println("SUCCESS: " + quantity + " x " + productList.get(productID) +  " shipped.");

    }
    
}
