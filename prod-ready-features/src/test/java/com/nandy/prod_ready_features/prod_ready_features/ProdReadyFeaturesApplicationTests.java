package com.nandy.prod_ready_features.prod_ready_features;

import com.nandy.prod_ready_features.prod_ready_features.clients.EmployeeClient;
import com.nandy.prod_ready_features.prod_ready_features.dto.EmployeeDTO;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
@TestMethodOrder(MethodOrderer.class)
class ProdReadyFeaturesApplicationTests {


	@Autowired
	private EmployeeClient employeeClient;


	@Test
	@Order(3)
	void getAllEmployees() {
		List<EmployeeDTO> employeeDTOList= employeeClient.getAllEmployees();
		System.out.println(employeeDTOList);
	}

	@Test
	@Order(2)
	void getEmployeeById() {
		EmployeeDTO employeeDTO= employeeClient.getEmployeeById(1453L);
		System.out.println(employeeDTO);
	}

	@Test
	@Order(1)
	void createNewEmployeeTest(){
		EmployeeDTO employeeDTO = new EmployeeDTO(null, "Sushant", "nandysushanta8@gmail.com", 2, LocalDate.now(), "ADMIN", true);
		EmployeeDTO savedEmployee = employeeClient.createNewEmployee(employeeDTO);
		System.out.println(savedEmployee.getId());
	}

}
