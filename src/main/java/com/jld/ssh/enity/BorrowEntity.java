package com.jld.ssh.enity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "borrow", schema = "jldschool1", catalog = "")
public class BorrowEntity {
    private int id;
    private Timestamp btime;
    private Timestamp retime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "btime")
    public Timestamp getBtime() {
        return btime;
    }

    public void setBtime(Timestamp btime) {
        this.btime = btime;
    }

    @Basic
    @Column(name = "retime")
    public Timestamp getRetime() {
        return retime;
    }

    public void setRetime(Timestamp retime) {
        this.retime = retime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BorrowEntity that = (BorrowEntity) o;
        return id == that.id &&
                Objects.equals(btime, that.btime) &&
                Objects.equals(retime, that.retime);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, btime, retime);
    }
}
