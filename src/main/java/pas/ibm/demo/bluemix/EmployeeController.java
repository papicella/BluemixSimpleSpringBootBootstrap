package pas.ibm.demo.bluemix;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class EmployeeController
{
    private static final Logger logger = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeRepository repository;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String listEmployees (Model model)
    {
        List<Employee> employees = repository.findAll();

        logger.info("Employees = " + employees.size());

        model.addAttribute("employees", employees);
        model.addAttribute("employeescount", employees.size());

        return "welcome";

    }
}
