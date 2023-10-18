package bjut.pojo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class Product {
    private Integer pid;
    private String pimage;
public Product(){}
    public Product(Integer pid, String pimage) {
        this.pid = pid;
        this.pimage = pimage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", pimage='" + pimage + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPimage() {
        return pimage;
    }

    public void setPimage(String pimage) {
        this.pimage = pimage;
    }
}
