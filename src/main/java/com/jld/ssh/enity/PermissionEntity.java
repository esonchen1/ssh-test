package com.jld.ssh.enity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "permission", schema = "jldschool1", catalog = "")
public class PermissionEntity {
    private int id;
    private String permissionName;
    private String peimissionSign;
    private String description;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "permission_name")
    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    @Basic
    @Column(name = "peimission_sign")
    public String getPeimissionSign() {
        return peimissionSign;
    }

    public void setPeimissionSign(String peimissionSign) {
        this.peimissionSign = peimissionSign;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PermissionEntity that = (PermissionEntity) o;
        return id == that.id &&
                Objects.equals(permissionName, that.permissionName) &&
                Objects.equals(peimissionSign, that.peimissionSign) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, permissionName, peimissionSign, description);
    }
}
