package bjut.pojo;
import org.springframework.stereotype.Component;
@Component
public class User {
    private   Long id;
    private   String  username;
    private   String password;
    private   String sex;
    private   Integer age;
    private   String phone;
    private   String address;
    private   String idcard;


    private  Integer  money;
    private  Integer pid;
    public  Product product;
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
public  User(){}

    public Integer getMoney() {
        return money;
    }



    public void setMoney(Integer money) {
        this.money = money;
    }

    public User(Long id, String username, String password, String sex, Integer age, String phone, String address, String idcard, Integer money, Integer pid, Product product) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.idcard = idcard;

        this.money = money;
        this.pid = pid;
        this.product = product;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", idcard='" + idcard + '\'' +
                ", money=" + money +
                ", pid=" + pid +
                ", product=" + product +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }
}
