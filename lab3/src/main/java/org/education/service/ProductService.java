package org.education.service;

import org.education.beans.ProductCategoryEnt;
import org.education.beans.ProductEnt;
import org.education.beans.ProductStorage;
import org.education.service.exception.ServiceException;
import org.springframework.stereotype.Component;

import java.io.InputStream;
import java.util.List;

@Component
public interface ProductService {
    /**
     * Retrieves a list of products by category.
     * @param category The category of products to retrieve.
     * @return List of products belonging to the specified category.
     * @throws ServiceException if there's an error while fetching products.
     */
    List<ProductEnt> GetProductListByCat(String category) throws ServiceException;

    /**
     * Retrieves all products available in the database.
     *
     * @return List of all available products.
     * @throws ServiceException if there's an error while fetching products.
     */
    List<ProductStorage> GetAllProduct() throws ServiceException;

    /**
     * Sets a discount for a specific product.
     * @param productId The ID of the product for which the discount is to be set.
     * @param discountSize The discount percentage to be set.
     * @throws ServiceException if there's an error while setting the discount.
     */
    boolean SetDiscount(int productId, int discountSize) throws ServiceException;

    ProductCategoryEnt GetCatByName(String name) throws ServiceException;

    /**
     * Adds a new product to the database.
     * @param name The name of the product.
     * @param price The price of the product.
     * @param category The category of the product.
     * @param file InputStream representing the image file of the product.
     * @throws ServiceException if there's an error while adding the product.
     */
    boolean AddProduct(String name, String price, String category, InputStream file) throws ServiceException;

    /**
     * Retrieves a product by its ID.
     * @param id The ID of the product to retrieve.
     * @return The product corresponding to the given ID.
     * @throws ServiceException if there's an error while fetching the product.
     */
    ProductEnt GetProductById(int id) throws ServiceException;
}
