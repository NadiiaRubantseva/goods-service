package ua.pr.goodsservice.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ua.pr.goodsservice.model.Category;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
}
