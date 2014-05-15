/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mysql;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author KURING
 */
public final class SqlStatement {
    private Statement statement;
    
    public SqlStatement() throws SQLException{
        makeStatement();
    }
    
    public Statement makeStatement() throws SQLException{
        Connect c = new Connect();
        Connection conn = c.makeConnection();
        statement = (Statement) conn.createStatement();
        return statement;
    }
    
    public void insert_admin(int nim, String password, String name)throws SQLException{
        statement.execute("INSERT INTO `administrator` (`nim`, `password`, `name`) VALUES (\""+nim+"\", \""+password+"\", \""+name+"\");");
    }
    
    public void insert_group(int no_tubes, String group_name, String anggota_1, String anggota_2, String anggota_3)throws SQLException{
        statement.execute("INSERT INTO `group_tubes` (`no_tubes`, `group_name`, `anggota_1`, `anggota_2`, `anggota_3`) VALUES (\""+no_tubes+"\", \""+group_name+"\", \""+anggota_1+"\", \""+anggota_2+"\", \""+anggota_3+"\");");
    }
    
    public void insert_video(String title, String link, int rating, int view, int no_tubes, String group_name)throws SQLException{
        statement.execute("INSERT INTO `video` (`title`, `link`, `rating`, `view`, `no_tubes`, `group_nama`) VALUES (\""+title+"\", \""+link+"\", \""+rating+"\", \""+view+"\", \""+no_tubes+"\", \""+group_name+"\");");
    }
    public void update_video(int id, String title, String link, int rating, int view, int no_tubes, String group_name) throws SQLException {
        statement.execute("UPDATE `video` SET (`title` = "+title+"\", `link` = "+link+"\", `rating` = "+rating+"\", `view` = "+view+"\", `no_tubes` = "+no_tubes+"\", `group_nama` = "+group_name+"\") WHERE id = "+id+"\";");
    }
    public void delete_video(int id) throws SQLException {
        statement.execute("DELETE * FROM video WHERE id = \"" + id + "\";");
    }
    public List<String[]> select_admin() throws SQLException{
        List<String[]> details = new ArrayList<>();
        try (ResultSet rs = statement.executeQuery("select * from administrator")) {
            while(rs.next()){
                //Retrieve by column name and insert it into the list
                String[] data = {rs.getString("nim"),rs.getString("name")};
                details.add(data);
            }
        }
        return details;
    }
    
    public void select_group() throws SQLException{
        try (ResultSet rs = statement.executeQuery("select * from group_tubes")) {
            while(rs.next()){
                //Retrieve by column name
                int no_tubes  = rs.getInt("no_tubes");
                String grup  = rs.getString("group_name");
                String anggota_1  = rs.getString("anggota_1");
                String anggota_2  = rs.getString("anggota_2");
                String anggota_3  = rs.getString("anggota_3");
                
                //Display values
                System.out.print("No Tubes: " + no_tubes + " ");
                System.out.println("Nama Kelompok: " + grup);
                System.out.println("Member :");
                System.out.println("Nama 1: " + anggota_1);
                System.out.println("Nama 2: " + anggota_2);
                if(anggota_3!=null){
                    System.out.println("Nama 3: " + anggota_3);
                }
            }
        }
    }
    
    public List<String[]> select_video() throws SQLException{
        List<String[]> details;
        try (ResultSet rs = statement.executeQuery("select * from video;")) {
            details = new ArrayList<>();
            while(rs.next()) {
                String[] data = {Integer.toString(rs.getInt("id")), rs.getString("title"), rs.getString("link"),
                    Integer.toString(rs.getInt("rating")), Integer.toString(rs.getInt("view")),
                    Integer.toString(rs.getInt("no_tubes")), rs.getString("group_name")};
                details.add(data);
            }
        }
        return details;
    }
    
    public boolean cekDataVideo(int id) throws SQLException{
        ResultSet rs = statement.executeQuery("select * from video WHERE id = \"" + id + "\";");
        boolean ketemu = false;
        
        if(rs.first()){
            ketemu = true;
        }
        rs.close();
        
        return ketemu;
    }
    
    public boolean IsAdminExist(int _NIM) throws SQLException{
        String nama = null;
        String query = "SELECT name FROM `administrator` WHERE nim=\"" + _NIM + "\";";
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()){
            nama = rs.getString("name");
        }
        return nama!=null;
    }
    
    public boolean isPassword(int _NIM, String password) throws SQLException{
        String pass = "initialize";
        String query = "SELECT password FROM `administrator` WHERE nim=\"" + _NIM + "\";";
        ResultSet rs = statement.executeQuery(query);
        while(rs.next()){
            pass = rs.getString("password");
        }
        return (pass.equals(password));
    }
    
    public void deleteAdmin(int _NIM) throws SQLException{
        String query = "DELETE FROM `administrator` WHERE nim=\'" + _NIM + "\';";
        System.out.println(query);
        statement.execute(query);
    }
    
     public List<String> select_admin_specific(int _NIM) throws SQLException{
        List<String> details = new ArrayList<>();
        String query = "SELECT * FROM administrator WHERE nim=\'" + _NIM + "\'";
        try (ResultSet rs = statement.executeQuery(query)) {
            while(rs.next()){
                //Retrieve by column name and insert it into the list
                details.add(rs.getString("nim"));
                details.add(rs.getString("name"));
            }
        }
        return details;
    }
     
}
