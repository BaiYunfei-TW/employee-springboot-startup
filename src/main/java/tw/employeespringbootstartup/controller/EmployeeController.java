package tw.employeespringbootstartup.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tw.employeespringbootstartup.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @RequestMapping("")
    public Employee index(){
        Employee employee = new Employee();

        return employee;
    }

}
