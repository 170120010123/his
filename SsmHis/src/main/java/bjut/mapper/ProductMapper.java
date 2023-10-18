package bjut.mapper;

import bjut.pojo.Product;
import bjut.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
   int insert (Product product);
  Product select(String pid);



}
