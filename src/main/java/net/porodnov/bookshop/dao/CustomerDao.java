package net.porodnov.bookshop.dao;

import net.porodnov.bookshop.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerDao extends CrudRepository<Customer, Long> {
}
