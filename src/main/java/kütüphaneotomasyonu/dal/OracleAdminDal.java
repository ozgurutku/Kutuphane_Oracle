package kütüphaneotomasyonu.dal;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import kütüphaneotomasyonu.data.Admins;
import kütüphaneotomasyonu.data.DepositBooks;
import kütüphaneotomasyonu.data.Logs;
import kütüphaneotomasyonu.data.Members;
import kütüphaneotomasyonu.form.AdminLogin;

public class OracleAdminDal extends OraclePersonDal implements IAdmin {

    DbHelper helper = new DbHelper();


    public ArrayList<Admins> adminList() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Admins> admins = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from adminler");
            admins = new ArrayList<Admins>();
            while (resultSet.next()) {
                admins.add(new Admins(resultSet.getInt("adminno"),
                                  resultSet.getString("ad"),
                                  resultSet.getString("soyad"),
                                  resultSet.getString("kullanıcıadı"),
                                  resultSet.getString("sıfre")
                ));

            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return admins;
    }

 
    public ArrayList<Members> memberList() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Members> members = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from uyeler");
            members = new ArrayList<Members>();
            while (resultSet.next()) {
                members.add(new Members(resultSet.getInt("uyeno"),
                                  resultSet.getString("ad"),
                                  resultSet.getString("soyad"),
                                  resultSet.getString("kullanıcıadı"),
                                  resultSet.getString("sıfre")
                ));

            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return members;
    }


    public void bookAdd(String bookName, String authorName, String publishingHouse, String bookType) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "insert into kıtaplar (barkod,kıtapadı,yazaradı,yayınevi,kıtapturu) values (DEFAULT,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, bookName);
            statement.setString(2, authorName);
            statement.setString(3, publishingHouse);
            statement.setString(4, bookType);
            statement.executeUpdate();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }

    }

    public void memberAdd(String name, String surname, String userName, String userPassword) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "insert into uyeler (uyeno,ad,soyad,kullanıcıadı,sıfre) values (DEFAULT,?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, userName);
            statement.setString(4, userPassword);

            statement.executeUpdate();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }

    }


    public ArrayList<DepositBooks> depositBookList() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<DepositBooks> depositBooks = null;

        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from emanetkitaplar");
            depositBooks = new ArrayList<DepositBooks>();
            while (resultSet.next()) {
                depositBooks.add(new DepositBooks(resultSet.getInt("barkod"),
                                  resultSet.getString("kıtapadı"),
                                  resultSet.getString("yazaradı"),
                                  resultSet.getString("yayınevi"),
                                  resultSet.getString("kitapturu"),
                                  resultSet.getString("kıtapsahıbı"),
                                  resultSet.getString("alıstarihi"),
                                  resultSet.getString("verilistarihi")
                ));

            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return depositBooks;

    }
    
    public int getYoneticiId()throws SQLException{
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        int id=0;
        AdminLogin adminLogin = new AdminLogin();
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from adminler where kullanıcıadı='"+adminLogin.userName+"' and sıfre='"+adminLogin.password+"'");
            resultSet.next();
            id = resultSet.getInt("adminno");

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return id;
    } 


    public void announcementAdd(String announcement) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "insert into duyurular (duyuru,adminno) values (?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, announcement);
            statement.setInt(2,getYoneticiId());
            statement.executeUpdate();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }

    }


    public void populateTableAdmins(JTable tblAdmins) {

        model = (DefaultTableModel) tblAdmins.getModel();
        try {
            ArrayList<Admins> admins = adminList();
            for (Admins admins1 : admins) {
                Object[] row = {admins1.getAdminNumber(), admins1.getName(), admins1.getSurname(), admins1.getUserName(), admins1.getUserPassword()};
                model.addRow(row);
            }
        } catch (SQLException exception) {

        }

    }


    public void populateTableMembers(JTable tblMembers) {

        model = (DefaultTableModel) tblMembers.getModel();
        model.setRowCount(0);
        try {
            ArrayList<Members> members = memberList();
            for (Members members1 : members) {
                Object[] row = {members1.getMemberNumber(), members1.getName(), members1.getSurname(), members1.getUserName(), members1.getUserPassword()};
                model.addRow(row);
            }
        } catch (SQLException exception) {

        }

    }


    public void populateTableDepositBooks(JTable tblDepositBooks) {
        model = (DefaultTableModel) tblDepositBooks.getModel();
        try {
            ArrayList<DepositBooks> depositBooks = depositBookList();
            for (DepositBooks depositBooks1 : depositBooks) {
                Object[] row = {depositBooks1.getBarkod(), depositBooks1.getBookName(), depositBooks1.getAuthorName(), depositBooks1.getPublishingHouse(), depositBooks1.getBookType(), depositBooks1.getBookOwner(), depositBooks1.getStrDate(), depositBooks1.getStrDate2()};
                model.addRow(row);
            }
        } catch (SQLException exception) {

        }
    }


    public void adminRegister(String name, String surname, String userName, String userPassword) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();
            String sql = "insert into adminler (ad,soyad,kullanıcıadı,sıfre) values (?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, userName);
            statement.setString(4, userPassword);

            statement.executeUpdate();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }

    }


    public boolean adminLogin(String userName, String userPassword) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from adminler where kullanıcıadı='" + userName + "' "
                              + "AND sıfre='" + userPassword + "'");

            while (resultSet.next()) {
                return true;

            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return false;
    }


    public void memberDelete(Object index) throws SQLException {
        Connection connection = null;
        try {
            connection = helper.getConnection();

            CallableStatement cs = connection.prepareCall("{call sp_deletemember(?)}");
			cs.setObject(1, index);
			cs.executeQuery();
			
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            connection.close();

        }

    }

    
    public void memberUpdate(Object index, String name, String surname, String userName, String password) throws SQLException {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            connection = helper.getConnection();

            String sql = "UPDATE uyeler SET ad=?,soyad=?,kullanıcıadı=?,sıfre=? WHERE uyeno= '" + index + "' ";
            statement = connection.prepareStatement(sql);

            statement.setString(1, name);
            statement.setString(2, surname);
            statement.setString(3, userName);
            statement.setString(4, password);

            statement.executeUpdate();

        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();

        }

    }

    
    public ArrayList<Logs> logsList() throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        ArrayList<Logs> logs = null;
        try {
            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from logs");
            logs = new ArrayList<Logs>();
            while (resultSet.next()) {
                logs.add(new Logs(resultSet.getInt("logID"),
                                  resultSet.getString("logType"),
                                  resultSet.getString("relatedTable"),
                                  resultSet.getInt("relatedID"),
                                  resultSet.getString("logTime")
                ));

            }
        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
        return logs;
    }

    
    public void populateTableLogs(JTable tblLogs) {
        
        model = (DefaultTableModel) tblLogs.getModel();
        try {
            ArrayList<Logs> logs = logsList();
            for (Logs log : logs) {
                Object[] row = {log.getLogID(), log.getLogType(), log.getRelatedTable(), log.getRelatedID(), log.getLogTime()};
                model.addRow(row);
            }
        } catch (SQLException exception) {

        }
    }

    
}
