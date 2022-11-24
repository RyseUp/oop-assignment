/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.assignment.repository;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import oop.assignment.dao.supplierDAO;
public class SupplierRepository extends Repository{
    public List<supplierDAO> getListSupplier() {
        String sql = "SELECT * FROM Suppliers;";
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            List<supplierDAO> suppliers = new ArrayList<>();
            while (rs.next()) {
                supplierDAO s = new supplierDAO();
                s.parse(rs);
                suppliers.add(s);
            }
            stmt.close();
            conn.close();
            return suppliers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
