package bjut.service.Impl;

import bjut.mapper.ProductMapper;
import bjut.pojo.Product;
import bjut.pojo.User;
import bjut.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import sun.nio.cs.US_ASCII;

import javax.servlet.http.HttpSession;
import java.io.File;

@Service
public class ProductServiceImpl  implements ProductService {
@Autowired
ProductMapper productMapper;

    @Override
    public int insert(MultipartFile file  ) {
        String OriginalFilename = file.getOriginalFilename();  //得到原本的（前端传过来的）文件名
        //加上时间戳 新名字 = 时间戳.原文件后缀名
        String fileName = System.currentTimeMillis()+"."+OriginalFilename.substring(OriginalFilename.lastIndexOf(".")+1);
        //文件存放路径。现在存在本地，之后可以存在数据库中  路径的最后别忘了加两个\\ 如果不加，字符串拼接会拼到父目录里面去
        String filePath = "C:\\Users\\sir\\hisvui\\src\\assets\\";
        Product product=new Product();
        product.setPimage(fileName);
        int insert = productMapper.insert(product);
        int keyid=product.getPid();


        File dest = new File(filePath+fileName);
        //如果不存在该目录就创建文件夹
        if(!dest.getParentFile().exists())
            dest.getParentFile().mkdirs();
        try {
            //保存上传的文件
            file.transferTo(dest);
        }catch (Exception e){
            e.printStackTrace();
        }






        return  keyid;

    }

    @Override
    public Product select(String id) {
        return productMapper.select(id);
    }
}
