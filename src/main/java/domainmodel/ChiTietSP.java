/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author FPT
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ChiTietSp")
@ToString
public class ChiTietSP implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "IdSanPham")
    private SanPham idSanPham;

    @Column(name = "Serial")
    private String serial;

    @Column(name = "CPU")
    private String cPU;

    @Column(name = "Hang")
    private String hang;

    @Column(name = "Ram")
    private String ram;

    @Column(name = "CardMH")
    private String card;

    @Column(name = "OCung")
    private String oCung;

    @Column(name = "Gia")
    private BigDecimal gia;

    @Column(name = "Anh")
    private String anh;

    @Column(name = "TinhTrang")
    private int tinhTrang;

    @Column(name = "CreatedDate")
    private Date createdDate;

    @Column(name = "LastModifiedDate")
    private Date lastModifiedDate;
//
//    
//    public ChiTietSP(UUID id, SanPham idSanPham, String serial, String cPU, String hang, String ram, String card, String oCung, BigDecimal gia, String anh, int tinhTrang, Date createdDate, Date lastModifiedDate) {
//        this.id = id;
//        this.idSanPham = idSanPham;
//        this.serial = serial;
//        this.cPU = cPU;
//        this.hang = hang;
//        this.ram = ram;
//        this.card = card;
//        this.oCung = oCung;
//        this.gia = gia;
//        this.anh = anh;
//        this.tinhTrang = tinhTrang;
//        this.createdDate = createdDate;
//        this.lastModifiedDate = lastModifiedDate;
//    }

    public ChiTietSP(SanPham idSanPham, String serial, String cPU, String hang, String ram, String card, String oCung, BigDecimal gia, String anh, int tinhTrang, Date createdDate, Date lastModifiedDate) {
        this.idSanPham = idSanPham;
        this.serial = serial;
        this.cPU = cPU;
        this.hang = hang;
        this.ram = ram;
        this.card = card;
        this.oCung = oCung;
        this.gia = gia;
        this.anh = anh;
        this.tinhTrang = tinhTrang;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
    }

    public ChiTietSP(UUID id, String serial) {
        this.id = id;
        this.serial = serial;
    }
    public String conVert(Date x) {
        DateFormat date = new SimpleDateFormat("dd-MM-yyyy");
        return date.format(x);
    }
}
