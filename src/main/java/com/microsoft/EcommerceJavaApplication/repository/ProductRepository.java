package com.microsoft.EcommerceJavaApplication.repository;

import java.util.ArrayList;
import java.util.List;
import com.microsoft.EcommerceJavaApplication.model.Product;

public class ProductRepository {
    // List to store products
    private List<Product> products = new ArrayList<Product>();
    
    public ProductRepository(){
        // Initialize the list of products
        products = new ArrayList<>();
    }

    // Method to add a product to the repository
    public void addProduct(Product product){
        products.add(product);
    }
    // Method to update a product in the repository
    public void updateProduct(Product product){
        // Get the index of the product to be updated
        int index = products.indexOf(product);
        // Update the product
        products.set(index, product);
    }
    // Method to delete a product from the repository
    public void deleteProduct(Product product){
        // Get the index of the product to be deleted
        int index = products.indexOf(product);
        // Delete the product
        products.remove(index);
    }
    // Method to get a product from the repository
    public Product getProduct(int id){
        // Loop through the list of products
        for(Product product : products){
            // Check if the product id matches the id passed as parameter
            if(product.getId() == id){
                // Return the product
                return product;
            }
        }
        // Return null if no product is found
        return null;
    }
    // Method to get all products from the repository
    public List<Product> getProducts(){
        // Return the list of products
        return products;
    }

        // Method to get a product by its ID
        public Product getProductById(int id){
            // Loop through the list of products
            for(Product product : products){
                // Check if the product id matches the id passed as parameter
                if(product.getId() == id){
                    // Return the product
                    return product;
                }
            }
            // Return null if no product is found
            return null;

        }
        // Get the total count of products in the repository
        public int getCount(){
            // Return the size of the list of products
            return products.size();
        }

}
