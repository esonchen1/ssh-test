package com.jld.ssh.dao.impl;

import com.jld.ssh.dao.UserDao;
import com.jld.ssh.enity.UsersEntity;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDaoImpl implements UserDao {
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


    @Override
    public void add() {
        System.out.println("userDao");
/*        添加操作
                实际的时候直接传user进来*/
        UsersEntity user = new UsersEntity();
        user.setAccount("add");
        user.setPassword("asd");
        hibernateTemplate.save(user);
    }
}
