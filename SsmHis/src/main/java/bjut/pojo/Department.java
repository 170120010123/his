package bjut.pojo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;

@Component
public class Department {
    public  Integer id;

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", dpname='" + dpname + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }

    public  String dpname;
    public  String floor;

public Department(){}
    public Department(Integer id, String dpname, String floor) {
        this.id = id;
        this.dpname = dpname;
        this.floor = floor;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDpname() {
        return dpname;
    }

    public void setDpname(String dpname) {
        this.dpname = dpname;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }


}
