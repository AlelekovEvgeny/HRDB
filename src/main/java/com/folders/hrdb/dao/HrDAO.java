package com.folders.hrdb.dao;

import com.folders.hrdb.entity.Hr;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.folders.hrdb.utils.HibernateSessionFactoryUtil;

public class HrDAO {

    public void save(Hr hr) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(hr);
        tx1.commit();
        session.close();
    }
}