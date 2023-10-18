package bjut.controller;
import bjut.pojo.User;
import bjut.service.ProductService;
import bjut.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@RequestMapping("/product")
public class ProductController {
  @Autowired
  ProductService productService;
  @PostMapping("/pic")
    public Result  pic( @RequestParam("file") MultipartFile file ,HttpSession session    ) {
session.setAttribute("keyid",productService.insert(file) );
    System.out.println(session.getAttribute("keyid"));
    return Result.success("ok");


  }

}
