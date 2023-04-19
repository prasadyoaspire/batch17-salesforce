package day7;

public class Product {
    private String productCode;
    private String productName;
    private double productPrice;
    private String category;
    public Product() {

    }
    public Product(String productCode, String productName, double productPrice, String category) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.category = category;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }

    
    

    
}
