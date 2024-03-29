package source.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import source.model.Customer;
import source.model.Province;

public interface CustomerService {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(Long id);

    void save(Customer customer);

    void remove(Long id);

    Iterable<Customer> findAllByProvince(Province province);

    Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);

}
