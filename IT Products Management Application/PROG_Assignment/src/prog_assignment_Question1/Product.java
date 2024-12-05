package prog_assignment_Question1;

public class Product
{//--------------------------------------------------------------------------Product Class---------------------------------------------------------------------//

    //This is a product class which I create variables to manipulates the product
    private String productName, productCode, stock, price, supplier, proCat, warranty;

    //I use variable to create construction to store values here//
    public Product(String productCode, String productName, String price, String stock, String proCat, String warranty, String supplier)
    {
        this.productCode = productCode;
        this.productName = productName;
        this.price = price;
        this.stock = stock;
        this.proCat = proCat;
        this.warranty = warranty;
        this.supplier = supplier;
    }

    //Here I Implemented the getters and setters of each variable //
    public String getProductName()
    {
        return productName;
    }

    public void setProductName(String productName)
    {
        this.productName = productName;
    }

    public String getProductCode()
    {
        return productCode;
    }

    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }

    public String getPrice()
    {
        return price;
    }

    public void setPrice(String price)
    {
        this.price = price;
    }

    public String getStock()
    {
        return stock;
    }

    public void setStock(String stock)
    {
        this.stock = stock;
    }

    public String getSupplier()
    {
        return supplier;
    }

    public void setSupplier(String supplier)
    {
        this.supplier = supplier;
    }

    public String getProCat()
    {
        return proCat;
    }

    public void setProCat(String proCat)
    {
        this.proCat = proCat;
    }

    public String getWarranty()
    {
        return warranty;
    }

    public void setWarranty(String warranty)
    {
        this.warranty = warranty;
    }

    //Here I created the toString method to print the values based on the assignment shown//
    @Override
    public String toString()
    {
        String show = String.format("PRODUCT CODE: \t%15S\n PRODUCT NAME: \t%15S\n PRODUCT WARRANTY : \t%10s\n PRODUCT CATEGORY : \t%10s\n PRODUCT PRICE: \tR%15s\n PRODUCT STOCK LEVELS: \t%5s\n PRODUCT SUPPLIER : \t%15s ", getProductCode(), getProductName(), getWarranty(), getProCat(), getPrice(), getStock(), getSupplier());
        return show;
    }
}//------------------------------------------------------------------------------------------------End of Product class-----------------------------------------------------------------------------------------------//
