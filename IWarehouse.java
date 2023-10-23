interface IWarehouse {
    
    int addProduct(String productName);

    void updateProduct(int productID, String newProductName);
    
    void deleteProduct(int productID);
    
    String getProduct(int productID);    
    
    void addStock(int productID, int quantity);
    
    void deliverProduct(int productID, int quantity);
}