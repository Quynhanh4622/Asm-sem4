package com.example.T2009M1_ASM.entity;

import com.example.T2009M1_ASM.entity.base.BaseEntity;
import com.example.T2009M1_ASM.util.ValidationHelper;

import java.time.LocalDateTime;
import java.util.HashMap;

public class Product extends BaseEntity {
    private int id;
    private String name;
    private String image;
    private String description;
    private double price;
    private int categoryId;
    private LocalDateTime openingDate;
    private ProductStatus status;

    public Product() {
    }

    public Product(int id, String name, String image, String description, double price, int categoryId, LocalDateTime openingDate, ProductStatus status) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.price = price;
        this.categoryId = categoryId;
        this.openingDate = openingDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public LocalDateTime getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(LocalDateTime openingDate) {
        this.openingDate = openingDate;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public static final class ProductBuilder {
        protected LocalDateTime createdAt;
        protected LocalDateTime updatedAt;
        protected LocalDateTime deletedAt;
        protected int createdBy;
        protected int updatedBy;
        protected int deletedBy;
        private int id;
        private String name;
        private String image;
        private String description;
        private double price;
        private int categoryId;
        private LocalDateTime openingDate;
        private ProductStatus status;

        private ProductBuilder() {
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder withImage(String image) {
            this.image = image;
            return this;
        }

        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder withCategoryId(int categoryId) {
            this.categoryId = categoryId;
            return this;
        }

        public ProductBuilder withOpeningDate(LocalDateTime openingDate) {
            this.openingDate = openingDate;
            return this;
        }

        public ProductBuilder withStatus(ProductStatus status) {
            this.status = status;
            return this;
        }

        public ProductBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProductBuilder withUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ProductBuilder withDeletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public ProductBuilder withCreatedBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public ProductBuilder withUpdatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public ProductBuilder withDeletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.setId(id);
            product.setName(name);
            product.setImage(image);
            product.setDescription(description);
            product.setPrice(price);
            product.setCategoryId(categoryId);
            product.setOpeningDate(openingDate);
            product.setStatus(status);
            product.updatedAt = this.updatedAt;
            product.deletedAt = this.deletedAt;
            product.createdBy = this.createdBy;
            product.deletedBy = this.deletedBy;
            product.updatedBy = this.updatedBy;
            product.createdAt = this.createdAt;
            return product;
        }
    }

}
