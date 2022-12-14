/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package custommodel;

import domainmodel.KhachHang;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author FPT
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class HoaDonResponse {

    private UUID id;
    private String ma;
    private String tenKH;
    private String sdtKH;
    private int capBacKH;
    private Date ngayTao;
    private KhachHang idKH;
    private int hinhThuc;
    private BigDecimal tongTien;
    private BigDecimal tienKhachTra;
    private BigDecimal tienCK;
    private String maNV;
    private String tenNhanVien;
    private int tinhTrang;
    
    public HoaDonResponse(Date ngayTao, int hinhThuc, BigDecimal tongTien, BigDecimal tienKhachTra, BigDecimal tienCK) {
        this.ngayTao = ngayTao;
        this.hinhThuc = hinhThuc;
        this.tongTien = tongTien;
        this.tienKhachTra = tienKhachTra;
        this.tienCK = tienCK;
    }

    public HoaDonResponse(UUID id, String ma, KhachHang maKH, Date ngayTao, int hinhThuc, BigDecimal tongTien, BigDecimal tienKhachTra, BigDecimal tienCK, String maNV, String tenNhanVien, int tinhTrang) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.idKH = maKH;
        this.hinhThuc = hinhThuc;
        this.tongTien = tongTien;
        this.tienKhachTra = tienKhachTra;
        this.tienCK = tienCK;
        this.maNV = maNV;
        this.tenNhanVien = tenNhanVien;
        this.tinhTrang = tinhTrang;
    }

    public HoaDonResponse(UUID id, String ma, Date ngayTao, int hinhThuc, BigDecimal tongTien, BigDecimal tienKhachTra, BigDecimal tienCK) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.hinhThuc = hinhThuc;
        this.tongTien = tongTien;
        this.tienKhachTra = tienKhachTra;
        this.tienCK = tienCK;
    }

    public HoaDonResponse(UUID id, String ma, Date ngayTao, String tenNhanVien, int tinhTrang) {
        this.id = id;
        this.ma = ma;
        this.ngayTao = ngayTao;
        this.tenNhanVien = tenNhanVien;
        this.tinhTrang = tinhTrang;
    }

    

    public String loaiThanhToan() {
        switch (hinhThuc) {
            case 0:
                return "Chuy???n Kho???n";
            case 1:
                return "Ti???n M???t";
            case 2:
                return "C??? Hai";
            default:
                return null;
        }
    }

    public String capBac() {
        switch (capBacKH) {
            case 0:
                return "Ch??a c?? rank";
            case 1:
                return "?????ng";
            case 2:
                return "B???c";
            case 3:
                return "V??ng";
            case 4:
                return "Kim c????ng";
            default:
                return null;
        }
    }

    public String trangThai() {
        switch (tinhTrang) {
            case 0:
                return "Ch??? thanh to??n";
            case 1:
                return "???? thanh to??n";
            case 2:
                return "H???y";
            default:
                throw new AssertionError();
        }
    }

    private String ngayTao() {
        DateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
        String ngayTaoConvert = dateFormat.format(this.ngayTao);
        return ngayTaoConvert;
    }

    public Object[] toDataRow1() {
        return new Object[]{ma, ngayTao(), tenNhanVien, trangThai()};
    }

    public Object[] toDataRow(int stt) {
        return new Object[]{stt, ma, ngayTao(), tenNhanVien, trangThai()};
    }
}
