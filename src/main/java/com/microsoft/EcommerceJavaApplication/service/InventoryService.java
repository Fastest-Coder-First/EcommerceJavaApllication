package com.microsoft.EcommerceJavaApplication.service;
//import product and productRepository
import com.microsoft.EcommerceJavaApplication.model.Product;
import com.microsoft.EcommerceJavaApplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import list
import java.util.List;

@Service
public class InventoryService {
     private ProductRepository productRepository;

     @Autowired
    public InventoryService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    // Method to add a product
    public void addProduct(Product product){
        // Add the product to the repository
        productRepository.addProduct(product);
    }
    // Method to update a product
    public void updateProduct(Product product){
        // Update the product in the repository
        productRepository.updateProduct(product);
    }
    // Method to delete a product
    public void deleteProduct(Product product){
        // Delete the product from the repository
        productRepository.deleteProduct(product);
    }
    
    // Method to get all products
    public List<Product> getProducts(){
        // Get all products from the repository
        return productRepository.getProducts();
    }
    // Method to get a product by its ID
    public Product getProductById(int id){
        // Get the product from the repository
        return productRepository.getProductById(id);
    }
    //Method to get the total count of products
    public int getProductCount(){
        // Get the total count of products from the repository
        return productRepository.getProducts().size();
    }

    

}
