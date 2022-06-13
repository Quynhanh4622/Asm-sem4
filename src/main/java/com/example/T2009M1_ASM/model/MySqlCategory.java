package com.example.T2009M1_ASM.model;

import com.example.T2009M1_ASM.constant.SqlConstant;
import com.example.T2009M1_ASM.entity.Category;
import com.example.T2009M1_ASM.entity.Status;
import com.example.T2009M1_ASM.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MySqlCategory implements CategoryModel{
    Connection connection = ConnectionHelper.getConnection();

    @Override
    public boolean Save(Category category) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_INSERT);
            preparedStatement.setString(1, category.getName());
            preparedStatement.setInt(2, category.getStatus().getValue());
            preparedStatement.setString(3,category.getCreatedAt().toString());
            preparedStatement.setString(4,category.getUpdatedAt().toString());
            preparedStatement.executeUpdate();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_FIND_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt(SqlConstant.CATEGORY_FIELD_ID));
                category.setName(resultSet.getString(SqlConstant.CATEGORY_FIELD_NAME));
                category.setStatus(Status.getAccountStatus(resultSet.getInt(SqlConstant.CATEGORY_FIELD_STATUS)));
                categories.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categories;
    }
    @Override
    public Category findById(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_FIND_BY_ID);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()) {
                Category category = new Category();
                category.setId(resultSet.getInt(SqlConstant.CATEGORY_FIELD_ID));
                category.setName(resultSet.getString(SqlConstant.CATEGORY_FIELD_NAME));
                category.setStatus(Status.getAccountStatus(resultSet.getInt(SqlConstant.CATEGORY_FIELD_STATUS)));
                return category;
            }
            return null;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public boolean Update(int id, Category updateCategory) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_UPDATE);
            preparedStatement.setString(1, updateCategory.getName());
            preparedStatement.setString(2,updateCategory.getUpdatedAt().toString());
            preparedStatement.setInt(3, updateCategory.getStatus().getValue());

            preparedStatement.setInt(4,id);
            preparedStatement.executeUpdate();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean Delete(int id) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SqlConstant.CATEGORY_DELETE);
            preparedStatement.setInt(1, Status.DELETED.getValue());
            preparedStatement.setString(2, LocalDateTime.now().toString());
            preparedStatement.setInt(3,id);
            preparedStatement.executeUpdate();
            return true;
        }catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
