package ua.pr.goodsservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ua.pr.goodsservice.model.Product;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
}
