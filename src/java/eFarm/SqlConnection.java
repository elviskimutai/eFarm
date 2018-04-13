/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFarm;

/**
 *
 * @author Administrator
 */
import java.sql.Connection;
import java.sql.DriverManager;


public  class SqlConnection {
    
     public static void main(String[] args)
        {
           connect();
           Users _Users=new Users();
           _Users.executeStoredprocNoParams();
           if(_Users.executeSprocInParams()){
               System.out.println("Saved Succesfully");
           }
    }

   
 public static Connection connect(){
     try{
            String userName = "InsureGuest";
            String password = "Shalom123.#";
            String Driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String Url="jdbc:sqlserver://Server-01;databaseName=WebCahat";
           
            Class.forName(Driver);
            Connection con=DriverManager.getConnection(Url, userName, password);
            System.out.println("eFarm.SqlConnection.connect()");
            return con;
     }catch(Exception e)
		{
			System.out.println(e);
                       
                        return null;
		}
 }   
}

	