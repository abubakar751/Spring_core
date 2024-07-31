package com.springjdbc;

import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
        Student s=new Student();
        s.fetchData();
    }
}
