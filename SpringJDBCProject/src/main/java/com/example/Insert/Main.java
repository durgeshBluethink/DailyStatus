package com.example.Insert;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {
        System.out.println("My jdbc is connecting ...............");
        

       AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/example/insert/config.xml");
      
      Dao template= context.getBean("EmpDao", Dao.class);
       System.out.println("file is getitng");
//        //Insert query
//        String sql = "INSERT INTO Emp VALUES(?,?,?,?,?)";
////fire query
//        int result =  template.update(null)
//        		.update(sql,12,"Durgesh","Durgesh@gmail","delhi","12/12/12");
//        
//        //int result =  template.update("INSERT INTO emp (empName,empEmail) VALUES ('Durgesh1','Durgesh@gmail')");
//        System.out.println("Number of record inserted.. "+result);
       
     
     Emp emp = new Emp();
     emp.setEmpId(2);
     emp.setEmpName("shashi Prtap");
     emp.setCity("india");
     
      int result =  template.change(emp);
      
     
      System.out.println("Number of record inserted.. "+result);
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        
        
    }
}

