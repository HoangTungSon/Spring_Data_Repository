package source.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import source.model.Customer;
import source.model.Province;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
        Iterable<Customer> findAllByProvince(Province province);
}
