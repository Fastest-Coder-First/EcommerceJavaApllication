package com.microsoft.EcommerceJavaApplication.controller;
//import product 
import com.microsoft.EcommerceJavaApplication.model.Product;

import com.microsoft.EcommerceJavaApplication.service.InventoryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;






@RestController
//Base URL mapping for the controller
@RequestMapping("/api/products")
//Enables Cross-Origin Resource Sharing (CORS) for all origins and headers.
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InventoryController {
    private InventoryService inventoryService;

    @Autowired
    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }
    // Handles HTTP POST requests to create a new product
    @PostMapping
    public void addProduct(@RequestBody Product product){
        // Add the product to the repository
        inventoryService.addProduct(product);
    }
    // Handles HTTP PUT requests to update an existing product using id
    @PutMapping("/{id}")   
    public void updateProduct(@PathVariable int id, @RequestBody Product product){
        // Update the product in the repository
        // Set the ID of the product based on the path variable
        product.setId(id);
        inventoryService.updateProduct(product);
    }
    // Handles HTTP DELETE requests to delete an existing product using id
    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable int id){
        // Get the product from the repository
        Product product = inventoryService.getProductById(id);
        // Delete the product from the repository
        if (product != null) {
            inventoryService.deleteProduct(product);
        }
    }
    // Handles HTTP GET requests to get all products
    @GetMapping
    public List<Product> getProducts(){
        // Get all products from the repository
        return inventoryService.getProducts();
    }
    // Handles HTTP GET requests to get a product by its ID
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id){
        // Get the product from the repository
        return inventoryService.getProductById(id);
    }
    // Handles HTTP GET requests to get the total count of products
    @GetMapping("/count")
    public int getProductCount(){
        // Get the total count of products from the repository
        return inventoryService.getProductCount();
    }


}
