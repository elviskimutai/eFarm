/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eFarm;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Administrator
 */
public class Users {
    
     static SqlConnection _SqlConnection =new SqlConnection();
     Connection con=_SqlConnection.connect();
     

    String UserName;     
    String FullNames;   
    String EmpNo;   
    String Password;    
    String ConfirmPassword;    
    String Question ;    
    String Answer ;  
    String Email ;  
    String Telephone ;    
    Date ExpiryDate;    
    Boolean IsActive;     
    Boolean SuperUser;   
    String CCCode;     
    byte Image ;  
    String Terminus;    
    String UserID;

    public String GetUserName( ){                                                
        return UserName; 
    } 
      
    public void setUserName(String s ){                                                
        UserName= s; 
    }
     
     public String GetFullNames( ){                                                
        return FullNames; 
    } 
      
    public void setFullNames(String s ){                                                
        FullNames= s; 
    }
  public String GetEmpNo( ){                                                
        return EmpNo; 
    } 
      
    public void setEmpNo(String s ){                                                
        EmpNo= s; 
    }
    public String GetPassword( ){                                                
        return Password; 
    } 
      
    public void setPassword(String s ){                                                
        Password= s; 
    }
     public String GetConfirmPassword( ){                                                
        return ConfirmPassword; 
    } 
      
    public void setConfirmPassword(String s ){                                                
        ConfirmPassword= s; 
    }
      public String GetQuestion( ){                                                
        return Question; 
    } 
      
    public void setQuestion(String s ){                                                
        Question= s; 
    }
        public String GetAnswer( ){                                                
        return Answer; 
    } 
      
    public void setAnswer(String s ){                                                
        Answer= s; 
    }
    public String GetEmail( ){                                                
        return Email; 
    } 
      
   public void setAEmail(String s ){                                                
        Email= s; 
    }
   public String GetTelephone( ){                                                
        return Telephone; 
    } 
      
   public void setTelephone(String s ){                                                
        Telephone= s; 
    }
    public Date GetExpiryDate( ){                                                
        return ExpiryDate; 
    } 
      
   public void setExpiryDate(Date s ){                                                
        ExpiryDate= s; 
    }
   public boolean GetIsActive( ){                                                
        return IsActive; 
    } 
      
   public void setIsActive(boolean s ){                                                
        IsActive= s; 
    }
   public boolean GetSuperUser( ){                                                
        return SuperUser; 
    } 
      
   public void setSuperUser(boolean s ){                                                
        SuperUser= s; 
    }
   public String GetCCCodee( ){                                                
        return CCCode; 
    } 
      
   public void setCCCode(String s ){                                                
        CCCode= s; 
    }
    public byte GetImage( ){                                                
        return Image; 
    } 
      
   public void setImage(byte s ){                                                
        Image= s; 
    }
   public String GetTerminus( ){                                                
        return Terminus; 
    } 
      
   public void setTerminus(String s ){                                                
        Terminus= s; 
    }
    
   public String GetUserID( ){                                                
        return UserID; 
    } 
      
   public void setUserID(String s ){                                                
        UserID= s; 
    }
    //execute a procedure with no parametere
    public void executeStoredprocNoParams() {
        try {
             //Connection con=_SqlConnection.connect();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("{call selectUser}");
            while (rs.next()) {
            System.out.println(rs.getString("UserName"));
            }
            rs.close();
            stmt.close();
            }
        catch (Exception e) {
            e.printStackTrace();
            }
}
    public Boolean executeSprocInParams() {
    try {
        //Connection con=_SqlConnection.connect();
        PreparedStatement pstmt = con.prepareStatement("{call spSaveChattingmessages(?,?,?,?)}");
 
        pstmt.setString(1,"Mutunga");
         pstmt.setString(2,"Mutunga");
          pstmt.setString(3,"11.11 am");
           pstmt.setString(4,"Mutunga");
        pstmt.execute();
        pstmt.close();
        return true;
        }
    catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
    public boolean SaveUser(){
        try {
            PreparedStatement pst=con.prepareStatement("{call spSaveUsers(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");

                pst.setString(1,UserName);    
                pst.setString(2,FullNames);      
                pst.setString(3,EmpNo);     
                pst.setString(4,Password);     
                pst.setString(5,ConfirmPassword);     
                pst.setString(6,Question);     
                pst.setString(7,Answer);    
                pst.setString(8,Email);    
                pst.setString(9,Telephone);    
                pst.setDate(10,ExpiryDate); 
                pst.setBoolean(11,IsActive);   
                pst.setBoolean(12,SuperUser);    
                pst.setString(13,CCCode);   
                pst.setByte(14,Image); 
                pst.setString(15,Terminus);  
                pst.setString(16,UserID);   
                  
                   
 
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
