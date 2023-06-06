package com.selautomation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

    public static String getDataFromDB( )throws SQLException {
        Connection con=null;
        Statement st= null;
        ResultSet rs= null;

        String s = null;

      //  String sql= "SELECT * from ALBUM where AlbumId= ' "+albumId+"'" ;
        String sql= "SELECT  *  from ALBUM " ;

        try {
            String url = "jdbc:sqlite:/Users/salimiqbal/Library/DBeaverData/workspace6/.metadata/sample-database-sqlite-1/Chinook.db";
            con= DriverManager.getConnection(url);
            System.out.println("SQL lite db connection connected successfully");

            st = con.createStatement();

            rs= st.executeQuery(sql);

            while (rs.next()){

                    /*System.out.println(rs.getInt("AlbumId"));
                    System.out.println(rs.getString("Title"));
                    System.out.println(rs.getInt("ArtistId"));*/

                s = rs.getInt("AlbumId") + "\t" +
                        rs.getString("Title") + "\t" +
                        rs.getInt("ArtistId");
                //  System.out.println(id);
                 System.out.println(s);
            }
            con.close();

        }catch (SQLException e)
        {

            System.out.println(e.getMessage());

        }
        return s;

    }
}
