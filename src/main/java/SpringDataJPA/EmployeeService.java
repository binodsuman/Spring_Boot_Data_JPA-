package SpringDataJPA;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;



@Service
public class EmployeeService {
	
	@Autowired EmployeeRepository repository;
	
    public void add(EmployeeDTO dto) {

        repository.save(toEntity(dto));

    }

    public void delete(long id) {

        repository.deleteById(id);

    }

    public List<Employee> getEmployee() {

        return (List<Employee>) repository.findAll();

    }

    public Optional<Employee> getEmployeeById(long id) {

        Optional<Employee> employee = repository.findById(id);

        return employee;

    }

    private Employee toEntity(EmployeeDTO dto) {

        Employee entity = new Employee();

        entity.setName(dto.getName());

        entity.setAge(dto.getAge());

        return entity;

    }

}
