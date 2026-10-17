
package com.codegym.dao;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {

    // Bài 13.4: Transaction
    void insertUpdateUseTransaction() throws SQLException;

    // CRUD bằng PreparedStatement
    void insertUser(User user) throws SQLException;

    User selectUser(int id);

    List<User> selectAllUsers();

    boolean deleteUser(int id) throws SQLException;

    boolean updateUser(User user) throws SQLException;

    // Stored Procedures hiện có
    User getUserById(int id);

    void insertUserStore(User user) throws SQLException;

    // Bài 13.5: Stored Procedures cho danh sách, sửa, xóa
    List<User> selectAllUsersStore() throws SQLException;

    boolean updateUserStore(User user) throws SQLException;

    boolean deleteUserStore(int id) throws SQLException;

    // Tìm kiếm và sắp xếp
    List<User> searchByCountry(String country) throws SQLException;

    List<User> sortByName() throws SQLException;

    // Transaction: thêm User và gán Permission
    void addUserTransaction(User user, int[] permissionIds)
            throws SQLException;

    // Bài 13.3: Không sử dụng Transaction
    void insertUpdateWithoutTransaction() throws SQLException;
}
