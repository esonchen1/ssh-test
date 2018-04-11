package com.jld.ssh.enity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "book", schema = "jldschool1", catalog = "")
public class BookEntity {
    private int id;
    private String name;
    private Integer bnum;
    private String pic;
    private Integer roid;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "bnum")
    public Integer getBnum() {
        return bnum;
    }

    public void setBnum(Integer bnum) {
        this.bnum = bnum;
    }

    @Basic
    @Column(name = "pic")
    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    @Basic
    @Column(name = "roid")
    public Integer getRoid() {
        return roid;
    }

    public void setRoid(Integer roid) {
        this.roid = roid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookEntity that = (BookEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(bnum, that.bnum) &&
                Objects.equals(pic, that.pic) &&
                Objects.equals(roid, that.roid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, bnum, pic, roid);
    }
}
