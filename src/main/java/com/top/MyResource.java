package com.top;
 
import java.util.ArrayList;
import java.util.List;
 
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.top.dao.Employee;
import com.top.dao.EmployeeDAO;
 

 
//http://localhost:8081/jersey-webapp/webapi/employees

@Path("/employees")
public class MyResource {

	//	(1) GET - 
	//	OUTPUT - Lists all Entity Class object in Json Format
    @GET
    @Produces("application/json")
    public List<Employee> getEmployee() {
        EmployeeDAO dao = new EmployeeDAO();
        List employees = dao.getEmployees();
        return employees;
    }
  
	//  (2) GET - 
	//  INPUT - {entityid} as path paramter
	//  OUTPUT - Returns the Entity instance associated with the given entityid in JSON forma
    @GET
    @Path("/show/{id}")
    @Consumes("application/json")
    public List<Employee> showEmployee(@PathParam("id") int id) {
        EmployeeDAO dao = new EmployeeDAO();
        List<Employee> employees = dao.showEmployee(id);
        return employees;
    }    
 
    

	//    (3) GET - 
	//    OUTPUT - Returns the total count of Entity instances
    @GET
    @Path("/count")
    @Consumes("application/json")
    public long countEmployee() {
        EmployeeDAO dao = new EmployeeDAO();
        long employees = dao.countEmployee();
        return employees;
    }
    
    
	//    (4) POST - 
	//    INPUT - Entity object in JSON format
	//    OUTPUT - Creates a new Entity instance and return it in JSON format

    @POST
    @Path("/create")
    @Consumes("application/json")
    public Response addEmployee(Employee emp){
        emp.setName(emp.getName());
        emp.setAge(emp.getAge());
                
        EmployeeDAO dao = new EmployeeDAO();
        dao.addEmployee(emp);   
        return Response.ok().build();
    }
    
    
	//    (5) PUT - 
	//    INPUT - {entityid} as path parameter
	//    OUTPUT -Update an existing Entity instance associated with the given id and return the updated entity in JSON format

    @PUT
    @Path("/update/{id}")
    @Consumes("application/json")
    public Response updateEmployee(@PathParam("id") int id, Employee emp){
        EmployeeDAO dao = new EmployeeDAO();
        int count = dao.updateEmployee(id, emp);
        if(count==0){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
        return Response.ok().build();
    }

    //    (6) DELETE - 
    //    INPUT - {entityid} as path parameter
    //    OUTPUT -Deletes the Entity instance associated with the given id and return (true/false) confirmation

    @DELETE
    @Path("/delete/{id}")
    @Consumes("application/json")
    public Response deleteEmployee(@PathParam("id") int id){
        EmployeeDAO dao = new EmployeeDAO();
        
        int count = dao.deleteEmployee(id);
        if(count==0){
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
       // System.out.println(list);
        return Response.ok().build();
        
    }
    
//     MessageService messageService = new MessageService();
//     
//    @GET
//    @Path("/msg")
//    @Produces("application/json")
//    public List<Message> getMessages() {
//       return messageService.getAllMessages();
//    }
    
    
    
   
    


}
 
 