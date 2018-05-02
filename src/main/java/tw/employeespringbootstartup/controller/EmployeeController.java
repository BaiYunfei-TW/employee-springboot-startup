package tw.employeespringbootstartup.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tw.employeespringbootstartup.entity.Employee;
import tw.employeespringbootstartup.repository.EmployeeRepository;
import tw.employeespringbootstartup.vo.ResultJson;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping("")
    public List<Employee> index(){
        return employeeRepository.queryList();
    }

    @RequestMapping("/saveOrUpdate")
    public ResultJson save(@RequestBody Employee[] employee) {
        employeeRepository.saveOrUpdate(employee);
        return ResultJson.success();
    }

    @RequestMapping("/delete")
    public ResultJson delete(@RequestBody Integer[] ids) {
        employeeRepository.deleteById(ids);
        return ResultJson.success();
    }

}
