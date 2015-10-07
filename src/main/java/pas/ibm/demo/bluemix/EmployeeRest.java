package pas.ibm.demo.bluemix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeRest
{
    @Autowired
    private EmployeeRepository repository;

    @RequestMapping("/allemps")
    public List<Employee> home()
    {
        return repository.findAll();
    }
}
