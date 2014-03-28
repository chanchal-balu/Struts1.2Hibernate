package com.naveen.struts.java.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.naveen.struts.java.entities.Subscriber;
import com.naveen.struts.java.hib.HibernateUtil;

public class SubscriberDAO {
    public static boolean add(String email, String fullname) {
        Subscriber s = new Subscriber();
        s.setEmail(email);
        s.setFullname(fullname);
        s.setDj(new Date());
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            Transaction t = session.beginTransaction();
            session.save(s);
            t.commit();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            session.close();
        }
    }

    public static boolean update(String email, String fullname) {
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            Transaction t = session.beginTransaction();
            Subscriber s = (Subscriber) session.load(Subscriber.class,email);
            s.setFullname(fullname);
            session.update(s);
            t.commit();
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            session.close();
        }
    }

    public static boolean delete(String email) {
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            Transaction t = session.beginTransaction();
            Subscriber s = (Subscriber) session.load(Subscriber.class, email);
            if (s != null) {
                session.delete(s);
                t.commit();
                return true;
            } else {
                t.rollback();
                return false;
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        } finally {
            session.close();
        }
    }

    public static List query() {
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            return session.createQuery("from Subscriber s order by s.email").list();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            session.close();
        }
    }

    public static Subscriber getSubscriber(String email) {
        SessionFactory sf = null;
        Session session = null;
        try {
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            Transaction t = session.beginTransaction();
            Subscriber s = (Subscriber) session.get(Subscriber.class,email);
            return s;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            session.close();
        }
    }
}
