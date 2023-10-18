package bjut.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import java.util.Date;
@Component
public class Doctor {


    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", doname='" + doname + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", posts='" + posts + '\'' +
                ", introduction='" + introduction + '\'' +
                ", money='" + money + '\'' +
                ", departmentid=" + departmentid +
                ", calls='" + calls + '\'' +
                ", department=" + department +
                ", begintime=" + begintime +
                ", endtime=" + endtime +
                ", booo=" + booo +
                '}';
    }

    public  Integer id;
    public  String doname;
    public  String sex;
    public  Integer age;
    public  String posts;
    public  String introduction;
    public  String money;
    public  Integer departmentid;
    public String calls;
    public Department department;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    public Date begintime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    public Date endtime;
    public Integer booo;
    public  Doctor(){}

    public Date getBegintime() {
        return begintime;
    }

    public void setBegintime(Date begintime) {
        this.begintime = begintime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Integer getBooo() {
        return booo;
    }

    public void setBooo(Integer booo) {
        this.booo = booo;
    }

    public Doctor(Integer id, String doname, String sex, Integer age, String posts, String introduction, String money, Integer departmentid, String calls, Department department, Date begintime, Date endtime, Integer booo) {
        this.id = id;
        this.doname = doname;
        this.sex = sex;
        this.age = age;
        this.posts = posts;
        this.introduction = introduction;
        this.money = money;
        this.departmentid = departmentid;
        this.calls = calls;
        this.department = department;
        this.begintime = begintime;
        this.endtime = endtime;
        this.booo = booo;
    }

    public Integer getId() {
        return id;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoname() {
        return doname;
    }

    public void setDoname(String doname) {
        this.doname = doname;
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

    public String getCalls() {
        return calls;
    }

    public void setCalls(String calls) {
        this.calls = calls;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(Integer departmentid) {
        this.departmentid = departmentid;
    }

    public String getPosts() {
        return posts;
    }

    public void setPosts(String posts) {
        this.posts = posts;
    }


    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }
}
