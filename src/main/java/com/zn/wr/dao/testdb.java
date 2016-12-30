package com.zn.wr.dao;


import java.sql.SQLException;  

public class testdb {  
    public static void main(String[] args) throws SQLException  {  
        DBManager DB = new DBManager();  
        String url = "jdbc:mysql://localhost:3306/weekreport?"  
                + "user=root&password=admin&useUnicode=true&characterEncoding=UTF8";  
        DB.getConnection(url);//连接数据库  
        DB.getStatement();  
        DB.rst = DB.read(DB.stmt, "select * from w_context where id=1");//查找数据  
        while(DB.rst.next()){  
            System.out.println(DB.rst.getString(1) + "\t" + DB.rst.getString(2));  
        }  
       
    }  
}