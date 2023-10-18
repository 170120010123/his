package bjut.pojo;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;
import java.util.Date;
@Component
public class Register {
    public  Integer id;
    public  String name;
    public  Integer age;
    public  String sex;
    public  Integer state;
    public  String department;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss" ,timezone="GMT+8")
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss")
    public Date time;
    public  String result;
    public  String doctor;
    public  String diagnosis;
    public  Integer money;

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public  Register(){

}

    public Register(Integer id, String name, Integer age, String sex,String department,      Date time, String result, String doctor, String diagnosis,Integer state, Integer money) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.department = department;

        this.time = time;
        this.result = result;
        this.doctor = doctor;
        this.diagnosis = diagnosis;
        this.state = state;
        this.money = money;

}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }



    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }


}
