package payroll;

import org.springframework.hateoas.EntityModel;

public interface RepresentationModelAssembler {
	
	EntityModel<Employee> toModel(Employee employee);

}
