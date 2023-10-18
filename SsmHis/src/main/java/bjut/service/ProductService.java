package bjut.service;

import bjut.pojo.Product;
import bjut.pojo.User;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

public interface ProductService {

    int insert (MultipartFile file );
    Product select(String id);


}
