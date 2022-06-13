package com.example.T2009M1_ASM.constant;

public class SqlConstant {
    public static final String FIELD_CREATED_AT = "createdAt";
    public static final String FIELD_UPDATED_AT = "updatedAt";
    public static final String FIELD_DELETED_AT = "deletedAt";
    public static final String FIELD_CREATED_BY = "createdBy";
    public static final String FIELD_UPDATED_BY = "updatedBy";
    public static final String FIELD_DELETED_BY = "deletedBy";

    //ACCOUNT SQL COMMAND
    public static final String ACCOUNT_INSERT = "INSERT INTO accounts (fullName, phone, email, roleId, password, address, createdAt, updatedAt, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String ACCOUNT_UPDATE = "UPDATE accounts SET fullName = ?, phone = ?, email = ?, roleId = ?, password = ?, address = ?, updatedAt = ?, status = ? WHERE id = ?;";
    public static final String ACCOUNT_DELETE = "DELETE FROM accounts WHERE id = ?;";
    public static final String ACCOUNT_FIND_BY_ID = "SELECT * FROM accounts WHERE id = ? AND status = ?;";
    public static final String ACCOUNT_FIND_ALL = "SELECT * FROM accounts;";
    public static final String ACCOUNT_FIND_BY_PHONE
            = "SELECT * FROM accounts WHERE phone = ? AND status = ?;";

    //CATEGORY SQL COMMAND
    public static final String CATEGORY_FIELD_ID = "id";
    public static final String CATEGORY_FIELD_NAME = "name";
    public static final String CATEGORY_FIELD_STATUS = "status";
    public static final String CATEGORY_INSERT = "INSERT INTO categories (name, status , createdAt, updatedAt) VALUES (?, ?, ?, ?);";
    public static final String CATEGORY_UPDATE = "UPDATE categories SET name = ?, updatedAt = ?, status = ? WHERE id = ?;";
    public static final String CATEGORY_DELETE = "UPDATE categories SET status = ?, deletedAt = ? WHERE id = ?;";
    public static final String CATEGORY_FIND_BY_ID = "SELECT * FROM categories WHERE id = ?";
    public static final String CATEGORY_FIND_ALL = "SELECT * FROM categories;";

    //PRODUCT SQL COMMAND
    public static final String PRODUCT_FIELD_ID = "id";
    public static final String PRODUCT_FIELD_NAME = "name";
    public static final String PRODUCT_FIELD_IMAGE = "image";
    public static final String PRODUCT_FIELD_DESCRIPTION = "description";
    public static final String PRODUCT_FIELD_PRICE = "price";
    public static final String PRODUCT_FIELD_CATEGORY_ID = "categoryId";
    public static final String PRODUCT_FIELD_STATUS = "status";
    public static final String PRODUCT_FIELD_OPENING_DATE = "openingDate";

    public static final String PRODUCT_INSERT = "INSERT INTO products (name, description, image, price, categoryId, openingDate, status, createdAt, updatedAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    public static final String PRODUCT_UPDATE = "UPDATE products SET name = ?, description = ?, image = ?, price = ?, categoryId = ?, openingDate = ?, updatedAt = ?, status = ? WHERE id = ?;";
    public static final String PRODUCT_DELETE = "UPDATE products SET status = ?, deletedAt = ? WHERE id = ?;";
    public static final String PRODUCT_FIND_BY_ID = "SELECT * FROM products WHERE id = ? AND status = ?;";
    public static final String PRODUCT_FIND_ALL = "SELECT * FROM products;";
}
