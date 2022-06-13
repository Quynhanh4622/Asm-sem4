package com.example.T2009M1_ASM.model;

import com.example.T2009M1_ASM.constant.SqlConstant;
import com.example.T2009M1_ASM.entity.Product;
import com.example.T2009M1_ASM.entity.ProductStatus;
import com.example.T2009M1_ASM.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MySqlProduct implements ProductModel{
    Connection connection = ConnectionHelper.getConnection();

    @Override
    public boolean save(Product product) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_INSERT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setString(2, product.getDescription());
            preparedStatement.setString(3, product.getImage());
            preparedStatement.setDouble(4, product.getPrice());
            preparedStatement.setInt(5, product.getCategoryId());
            preparedStatement.setString(6, product.getOpeningDate().toString());
            preparedStatement.setInt(7, product.getStatus().getValue());
            preparedStatement.setString(8, product.getCreatedAt().toString());
            preparedStatement.setString(9, product.getUpdatedAt().toString());
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product category = new Product();
                category.setId(resultSet.getInt(SqlConstant.PRODUCT_FIELD_ID));
                category.setName(resultSet.getString(SqlConstant.PRODUCT_FIELD_NAME));
                category.setDescription(resultSet.getString(SqlConstant.PRODUCT_FIELD_DESCRIPTION));
                category.setImage(resultSet.getString(SqlConstant.PRODUCT_FIELD_IMAGE));
                category.setPrice(resultSet.getDouble(SqlConstant.PRODUCT_FIELD_PRICE));
                category.setCategoryId(resultSet.getInt(SqlConstant.PRODUCT_FIELD_CATEGORY_ID));
                category.setOpeningDate(resultSet.getTimestamp(SqlConstant.PRODUCT_FIELD_OPENING_DATE).toLocalDateTime());
                products.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return products;
    }

    @Override
    public Product findById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_FIND_BY_ID);
            preparedStatement.setInt(1, id);
            preparedStatement.setInt(2, 1);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Product product = new Product();
                product.setId(resultSet.getInt(SqlConstant.PRODUCT_FIELD_ID));
                product.setName(resultSet.getString(SqlConstant.PRODUCT_FIELD_NAME));
                product.setDescription(resultSet.getString(SqlConstant.PRODUCT_FIELD_DESCRIPTION));
                product.setImage(resultSet.getString(SqlConstant.PRODUCT_FIELD_IMAGE));
                product.setPrice(resultSet.getDouble(SqlConstant.PRODUCT_FIELD_PRICE));
                product.setCategoryId(resultSet.getInt(SqlConstant.PRODUCT_FIELD_CATEGORY_ID));
                product.setOpeningDate(resultSet.getTimestamp(SqlConstant.PRODUCT_FIELD_OPENING_DATE).toLocalDateTime());
                return product;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean update(int id, Product productUpdate) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_UPDATE);
            preparedStatement.setString(1, productUpdate.getName());
            preparedStatement.setString(2, productUpdate.getDescription());
            preparedStatement.setString(3, productUpdate.getImage());
            preparedStatement.setDouble(4, productUpdate.getPrice());
            preparedStatement.setInt(5, productUpdate.getCategoryId());
            preparedStatement.setString(6, productUpdate.getOpeningDate().toString());
            preparedStatement.setString(7, productUpdate.getUpdatedAt().toString());
            preparedStatement.setInt(8, productUpdate.getStatus().getValue());
            preparedStatement.setInt(9, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.PRODUCT_DELETE);
            preparedStatement.setInt(1, ProductStatus.DELETED.getValue());
            preparedStatement.setString(2, LocalDateTime.now().toString());
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
