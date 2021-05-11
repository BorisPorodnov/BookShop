package net.porodnov.bookshop.dao;

import net.porodnov.bookshop.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDao extends CrudRepository<Employee, Long> {
}
