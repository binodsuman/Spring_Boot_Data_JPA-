package SpringDataJPA;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hr")
public class EmployeeController {

    @Autowired EmployeeService service;
    
    

    @GetMapping("/all")
    public List<Employee> getEmployee() {
        System.out.println("This is all Employee fetch method");
        return service.getEmployee();

    }

    @PostMapping("/add")
    public void postEmployee(@RequestBody EmployeeDTO dto) {
        System.out.println("This is Employee post method");
        service.add(dto);

    }

    @GetMapping("/{id}")
    public Optional<Employee> getById(@PathVariable(required = true) long id) {

        return service.getEmployeeById(id);

    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(required = true) long id) {

        service.delete(id);

    }

}