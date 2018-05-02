package tw.employeespringbootstartup.repository;

import org.springframework.stereotype.Component;
import tw.employeespringbootstartup.entity.Employee;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Component
public class EmployeeRepository {

    private final Map<Integer,Employee> employees;

    public EmployeeRepository() {
        employees = new LinkedHashMap<>();
    }

    public void saveOrUpdate(Employee employee) {
        employees.put(employee.getId(), employee);
    }

    public void saveOrUpdate(Employee[] employees) {
        for (Employee employee : employees) {
            this.employees.put(employee.getId(), employee);
        }
    }

    public void deleteById(Integer[] ids) {
        for (Integer id: ids ) {
            employees.remove(id);
        }
    }

    public List<Employee> queryList(){
        List<Employee> result = new ArrayList<>();
        for (Map.Entry<Integer, Employee> entry: employees.entrySet()) {
            Employee e = entry.getValue();
            result.add(e);
        }
        return result;
    }

    public Employee getById(Integer id) {
        return employees.get(id);
    }

}
