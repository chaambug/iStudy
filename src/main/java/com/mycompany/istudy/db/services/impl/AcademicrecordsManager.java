/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.istudy.db.services.impl;

import com.mycompany.istudy.db.services.intf.AcademicrecordsManagerIntf;
import com.mycompany.istudy.db.connection.Connection;
import com.mycompany.istudy.db.entities.Academicrecords;
import com.mycompany.istudy.db.entities.Modul;
import com.mycompany.istudy.db.entities.Student;
import java.util.Collections;
import java.util.List;
import javax.persistence.EntityManager;
import org.apache.log4j.Logger;

/**
 *
 * @author Varuni
 */
public class AcademicrecordsManager implements AcademicrecordsManagerIntf{

    private final EntityManager em;
    private static AcademicrecordsManager instance;
    private final static Logger logger = Logger.getLogger(ModulManager.class);

    private AcademicrecordsManager() {
        em = Connection.getInstance().getEntityManager();
    }

    public static AcademicrecordsManager getInstance() {
        if (instance == null) {
            instance = new AcademicrecordsManager();
        }
        return instance;
    }

    @Override
    public void insertTry(Academicrecords obj) {
        try {
            logger.info("service call insertTry");
            em.getTransaction().begin();
            em.persist(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            logger.error("insertTry not successfull", e);
        }
    }

    @Override
    public List<Academicrecords> getAllRecords(Student student, Modul modul) {
        try {
            logger.info("service call getAllRecords");
            return em.createNamedQuery("Academicrecords.findAllRecords", Academicrecords.class)
                    .setParameter("student", student)
                    .setParameter("module", modul)
                    .getResultList();
        } catch (Exception e) {
            logger.error("getAllRecords not successfull", e);
        }
        return Collections.EMPTY_LIST;
    }

    @Override
    public void removeRecord(Academicrecords obj) {
        try {
            logger.info("service call removeRecord");
            em.getTransaction().begin();
            em.remove(obj);
            em.getTransaction().commit();
        } catch (Exception e) {
            logger.error("removeRecord not successfull", e);
        }
    }
}
