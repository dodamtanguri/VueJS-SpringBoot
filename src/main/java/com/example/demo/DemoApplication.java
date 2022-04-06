package com.example.demo;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	private final EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		Employee employee = Employee.builder()
				.firstName("sophie")
				.lastName("lim")
				.email("dodam@naver.com").build();

		Employee employee2 = Employee.builder()
				.firstName("dodam")
				.lastName("babo")
				.email("babo@naver.com").build();

		employeeRepository.save(employee);
		employeeRepository.save(employee2);

	}
}
