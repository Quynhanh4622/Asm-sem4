package com.example.T2009M1_ASM.entity;

import com.example.T2009M1_ASM.entity.base.BaseEntity;

import java.time.LocalDateTime;

public class Category extends BaseEntity {
    private int id;
    private String name;
    private Status status;

    public Category() {
    }

    public Category(int id, String name, Status status) {
        this.id = id;
        this.name = name;
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

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public static final class CategoryBuilder {
        protected LocalDateTime createdAt;
        protected LocalDateTime updatedAt;
        protected LocalDateTime deletedAt;
        protected int createdBy;
        protected int updatedBy;
        protected int deletedBy;
        private int id;
        private String name;
        private Status status;

        private CategoryBuilder() {
        }

        public static CategoryBuilder aCategory() {
            return new CategoryBuilder();
        }

        public CategoryBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public CategoryBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public CategoryBuilder withStatus(Status status) {
            this.status = status;
            return this;
        }

        public CategoryBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public CategoryBuilder withUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public CategoryBuilder withDeletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public CategoryBuilder withCreatedBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public CategoryBuilder withUpdatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public CategoryBuilder withDeletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Category build() {
            Category category = new Category();
            category.setId(id);
            category.setName(name);
            category.setStatus(status);
            category.updatedAt = this.updatedAt;
            category.deletedAt = this.deletedAt;
            category.deletedBy = this.deletedBy;
            category.createdAt = this.createdAt;
            category.updatedBy = this.updatedBy;
            category.createdBy = this.createdBy;
            return category;
        }
    }
}
