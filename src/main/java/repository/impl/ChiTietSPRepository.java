/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.impl;



import domainmodel.ChiTietSP;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utility.HibernateUtil;



/**
 *
 * @author Đức Hiệu
 */
public class ChiTietSPRepository {

    public List<ChiTietSP> getAllChiTietSP() {
        List<ChiTietSP> listCTSP = new ArrayList<>();
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("From ChiTietSP");
            listCTSP = query.getResultList();
        } catch (Exception e) {
        }
        return listCTSP;
    }

    private String fromTable = "From SanPham";
    private Session session = HibernateUtil.getFACTORY().openSession();
    
    public ChiTietSP getOne(String serial) {
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery(" SELECT new ChiTietSP (ct.id , ct.serial) FROM ChiTietSP ct WHERE Serial =:serial ", ChiTietSP.class);
            query.setParameter("serial", serial);
            ChiTietSP ctsp = (ChiTietSP) query.getSingleResult();
            return ctsp;
        } catch (Exception e) {
             e.printStackTrace(System.out);
        }
        return null;
    }

    public Boolean Add(ChiTietSP ctsp) {
        Transaction transantion = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transantion = session.beginTransaction();
            session.save(ctsp);
            transantion.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    public Boolean Update(ChiTietSP ctsp, UUID id) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            ChiTietSP ctSP = session.get(ChiTietSP.class, id);
            ctSP.setId(id);
            ctSP.setCard(ctsp.getCard());
            ctSP.setCPU(ctsp.getCPU());
            ctSP.setCreatedDate(ctsp.getCreatedDate());
            ctSP.setGia(ctsp.getGia());
            ctSP.setHang(ctsp.getHang());
            ctSP.setLastModifiedDate(ctsp.getLastModifiedDate());
            ctSP.setRam(ctsp.getRam());
            ctSP.setSerial(ctsp.getSerial());
            ctSP.setIdSanPham(ctsp.getIdSanPham());
            session.update(ctSP);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    public Boolean Delete(ChiTietSP ctsp, UUID id) {
        Transaction transaction = null;
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            transaction = session.beginTransaction();
            ChiTietSP ctSP = session.get(ChiTietSP.class, id);
            session.delete(ctSP);
            transaction.commit();
            return true;
        } catch (Exception e) {
            e.printStackTrace(System.out);
            return false;
        }
    }

    public List<ChiTietSP> seatch(String ram) {
        List<ChiTietSP> listCTSP = new ArrayList<>();
        try ( Session session = HibernateUtil.getFACTORY().openSession()) {
            Query query = session.createQuery("From ChiTietSP WHERE Ram = :ram");
            query.setParameter("ram", ram);
            listCTSP = query.getResultList();
            return listCTSP;
        } catch (Exception e) {
        }
        return null;
    }

}
