/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import domainmodel.NhanVien;
import domainmodel.TenTKNV;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author FPT
 */
public class ViewQuanLy extends javax.swing.JFrame {

    //Biến để làm hover í mà anh không cần quan tâm
    private int b1 = 0;
    private int b2 = 0;
    private int b3 = 0;
    private int b4 = 0;
    private int b5 = 0;
    private int b6 = 0;
    private int b7 = 0;
    private int b8 = 0;

    /**
     * Creates new form ViewQuanLy
     */
    public ViewQuanLy() {
        initComponents();
        designImg();
        designMenu();
        btnBanHang.setBackground(new Color(50, 159, 200));
        panelBanHang.removeAll();
        PanelBanHang pbh = new PanelBanHang();
        panelBanHang.add(pbh);
        panelBanHang.setLayout(new FlowLayout());
        this.pack();
        pbh.setVisible(true);
    }

    private Image scaleImage(Image image, int w, int h) {
        Image scaled = image.getScaledInstance(w, h, Image.SCALE_SMOOTH);
        return scaled;
    }

    private void designImg() {
        ImageIcon originalIcon = new ImageIcon("src/main/img/logo.png");
        int width = 200;
        int height = 164;
        Image scaled = scaleImage(originalIcon.getImage(), width, height);
        ImageIcon scaledIcon = new ImageIcon(scaled);
        lblLogo.setIcon(scaledIcon);

        ImageIcon thoat = new ImageIcon("src/main/img/thoat.png");
        int widthThoat = 55;
        int heightThoat = 55;
        Image imgThoat = scaleImage(thoat.getImage(), widthThoat, heightThoat);
        ImageIcon scaledIconThoat = new ImageIcon(imgThoat);
        btnThoat.setIcon(scaledIconThoat);

        ImageIcon banHang = new ImageIcon("src/main/img/ban.png");
        int withBan = 45;
        int heightBan = 45;
        Image imgBanHang = scaleImage(banHang.getImage(), withBan, heightBan);
        ImageIcon scaledIconBanHang = new ImageIcon(imgBanHang);
        btnBanHang.setIcon(scaledIconBanHang);

        ImageIcon mayTinh = new ImageIcon("src/main/img/maytinh.png");
        int withMayTinh = 40;
        int heightMayTinh = 40;
        Image imgMayTinh = scaleImage(mayTinh.getImage(), withMayTinh, heightMayTinh);
        ImageIcon scaledIconMayTinh = new ImageIcon(imgMayTinh);
        btnSanPham.setIcon(scaledIconMayTinh);

        ImageIcon nhanVien = new ImageIcon("src/main/img/nhanvien.png");
        int withNhanVien = 45;
        int heightNhanVien = 45;
        Image imgNhanVien = scaleImage(nhanVien.getImage(), withNhanVien, heightNhanVien);
        ImageIcon scaledIconNhanVien = new ImageIcon(imgNhanVien);
        btnNhanVien.setIcon(scaledIconNhanVien);

        ImageIcon hoaDon = new ImageIcon("src/main/img/hoadon.png");
        int withHoaDon = 40;
        int heightHoaDon = 40;
        Image imgHoaDon = scaleImage(hoaDon.getImage(), withHoaDon, heightHoaDon);
        ImageIcon scaledIconHoaDon = new ImageIcon(imgHoaDon);
        btnHoaDon.setIcon(scaledIconHoaDon);

        ImageIcon sale = new ImageIcon("src/main/img/sale.png");
        int withSale = 45;
        int heightSale = 45;
        Image imgSale = scaleImage(sale.getImage(), withSale, heightSale);
        ImageIcon scaledIconSale = new ImageIcon(imgSale);
        btnkhuyenMai.setIcon(scaledIconSale);

        ImageIcon khachHang = new ImageIcon("src/main/img/khachhang.png");
        int withKhachHang = 45;
        int heightKhachHang = 45;
        Image imgKhachHang = scaleImage(khachHang.getImage(), withKhachHang, heightKhachHang);
        ImageIcon scaledIconKhachHang = new ImageIcon(imgKhachHang);
        btnKhachHang.setIcon(scaledIconKhachHang);

        ImageIcon thongKe = new ImageIcon("src/main/img/thongke.png");
        int withThongKe = 50;
        int heightThongKe = 50;
        Image imgThongKe = scaleImage(thongKe.getImage(), withThongKe, heightThongKe);
        ImageIcon scaledIconThongKe = new ImageIcon(imgThongKe);
        btnThongKe.setIcon(scaledIconThongKe);
    }

    private void designMenu() {
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        view2 = new view.ViewMenu();
        lblLogo = new javax.swing.JLabel();
        btnSanPham = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnkhuyenMai = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnCTNV = new javax.swing.JButton();
        btnDoiMK = new javax.swing.JButton();
        panelBanHang = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1540, 850));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new ImageIcon("src/main/img/logo.png"));

        btnSanPham.setBackground(new java.awt.Color(0, 0, 0));
        btnSanPham.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSanPham.setForeground(new java.awt.Color(255, 255, 255));
        btnSanPham.setIcon(new ImageIcon("src/main/img/maytinh.png"));
        btnSanPham.setText("Sản phẩm");
        btnSanPham.setActionCommand(" Sản phẩm");
        btnSanPham.setAlignmentY(0.0F);
        btnSanPham.setBorder(null);
        btnSanPham.setMargin(new java.awt.Insets(2, 13, 2, 14));
        btnSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSanPhamMouseExited(evt);
            }
        });
        btnSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSanPhamActionPerformed(evt);
            }
        });

        btnBanHang.setBackground(new java.awt.Color(0, 0, 0));
        btnBanHang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setIcon(new ImageIcon("src/main/img/ban.png"));
        btnBanHang.setText("Bán hàng");
        btnBanHang.setAlignmentY(0.0F);
        btnBanHang.setBorder(null);
        btnBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBanHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBanHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBanHangMouseExited(evt);
            }
        });
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(0, 0, 0));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setIcon(new ImageIcon("src/main/img/nhanvien.png"));
        btnNhanVien.setText("Nhân viên");
        btnNhanVien.setAlignmentY(0.0F);
        btnNhanVien.setBorder(null);
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseExited(evt);
            }
        });
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnHoaDon.setBackground(new java.awt.Color(0, 0, 0));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnHoaDon.setForeground(new java.awt.Color(255, 255, 255));
        btnHoaDon.setIcon(new ImageIcon("src/main/img/hoadon.png"));
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setToolTipText("");
        btnHoaDon.setActionCommand("   Hóa đơn");
        btnHoaDon.setAlignmentY(0.0F);
        btnHoaDon.setBorder(null);
        btnHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHoaDonMouseExited(evt);
            }
        });
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        btnkhuyenMai.setBackground(new java.awt.Color(0, 0, 0));
        btnkhuyenMai.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnkhuyenMai.setForeground(new java.awt.Color(255, 255, 255));
        btnkhuyenMai.setIcon(new ImageIcon("src/main/img/sale.png"));
        btnkhuyenMai.setText("Khuyến mãi");
        btnkhuyenMai.setAlignmentY(0.0F);
        btnkhuyenMai.setBorder(null);
        btnkhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkhuyenMaiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkhuyenMaiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkhuyenMaiMouseExited(evt);
            }
        });
        btnkhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhuyenMaiActionPerformed(evt);
            }
        });

        btnKhachHang.setBackground(new java.awt.Color(0, 0, 0));
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnKhachHang.setForeground(new java.awt.Color(255, 255, 255));
        btnKhachHang.setIcon(new ImageIcon("src/main/img/khachhang.png"));
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.setAlignmentY(0.0F);
        btnKhachHang.setBorder(null);
        btnKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnKhachHangMouseExited(evt);
            }
        });
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new java.awt.Color(0, 0, 0));
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setIcon(new ImageIcon("src/main/img/thongke.png"));
        btnThongKe.setText("Thống kê");
        btnThongKe.setAlignmentY(0.0F);
        btnThongKe.setBorder(null);
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThongKeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(0, 0, 0));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));
        btnThoat.setIcon(new ImageIcon("src/main/img/thoat.png"));
        btnThoat.setText("Thoát");
        btnThoat.setAlignmentY(0.0F);
        btnThoat.setBorder(null);
        btnThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThoatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThoatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThoatMouseExited(evt);
            }
        });
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnCTNV.setBackground(new java.awt.Color(77, 83, 161));
        btnCTNV.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCTNV.setForeground(new java.awt.Color(255, 255, 255));
        btnCTNV.setText("Chi tiết nhân viên");
        btnCTNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCTNVActionPerformed(evt);
            }
        });

        btnDoiMK.setBackground(new java.awt.Color(77, 83, 161));
        btnDoiMK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDoiMK.setForeground(new java.awt.Color(255, 255, 255));
        btnDoiMK.setText("Đổi mật khẩu");
        btnDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout view2Layout = new javax.swing.GroupLayout(view2);
        view2.setLayout(view2Layout);
        view2Layout.setHorizontalGroup(
            view2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnSanPham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnHoaDon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnkhuyenMai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnKhachHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(view2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, view2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(view2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCTNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDoiMK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        view2Layout.setVerticalGroup(
            view2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(view2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnkhuyenMai, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCTNV, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoiMK, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(view2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panelBanHang.setBackground(new java.awt.Color(255, 255, 255));
        panelBanHang.setMaximumSize(new java.awt.Dimension(1300, 850));
        panelBanHang.setMinimumSize(new java.awt.Dimension(1300, 850));
        panelBanHang.setName(""); // NOI18N
        panelBanHang.setPreferredSize(new java.awt.Dimension(1300, 850));

        javax.swing.GroupLayout panelBanHangLayout = new javax.swing.GroupLayout(panelBanHang);
        panelBanHang.setLayout(panelBanHangLayout);
        panelBanHangLayout.setHorizontalGroup(
            panelBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        panelBanHangLayout.setVerticalGroup(
            panelBanHangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        // TODO add your handling code here:
        panelBanHang.removeAll();
        PanelBanHang pbh = new PanelBanHang();
        panelBanHang.add(pbh);
        panelBanHang.setLayout(new FlowLayout());
        this.pack();
        pbh.setVisible(true);
    }//GEN-LAST:event_btnBanHangActionPerformed

    private void btnSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSanPhamActionPerformed
        // TODO add your handling code here:
        panelBanHang.removeAll();
        PanelSanPham panelSanPham = new PanelSanPham();
        panelBanHang.add(panelSanPham);
        panelBanHang.setLayout(new FlowLayout());
        this.pack();
        panelSanPham.setVisible(true);
    }//GEN-LAST:event_btnSanPhamActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        panelBanHang.removeAll();
        PanelNhanVien pnv = new PanelNhanVien();
        panelBanHang.add(pnv);
        panelBanHang.setLayout(new FlowLayout());
        this.pack();
        pnv.setVisible(true);
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        panelBanHang.removeAll();
        PanelHoaDon panelHoaDon = new PanelHoaDon();
        panelBanHang.add(panelHoaDon);
        panelBanHang.setLayout(new FlowLayout());
        this.pack();
        panelHoaDon.setVisible(true);
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void btnkhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhuyenMaiActionPerformed
//        panelBanHang.removeAll();
//        PanelKhuyenMai km = new PanelKhuyenMai();
//        panelBanHang.add(km);
//        panelBanHang.setLayout(new FlowLayout());
//        this.pack();
//        km.setVisible(true);
    }//GEN-LAST:event_btnkhuyenMaiActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        panelBanHang.removeAll();
        PanelKhachHang pkh = new PanelKhachHang();
        panelBanHang.add(pkh);
        panelBanHang.setLayout(new FlowLayout());
        this.pack();
        pkh.setVisible(true);
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        try {
            panelBanHang.removeAll();
            PanelThongKe panelTK = new PanelThongKe();
            panelBanHang.add(panelTK);
            panelBanHang.setLayout(new FlowLayout());
            this.pack();
            panelTK.setVisible(true);
        } catch (ParseException ex) {
            Logger.getLogger(ViewQuanLy.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnBanHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseExited
        if (b1 == 0) {
            btnBanHang.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnBanHangMouseExited

    private void btnBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseClicked
        b1 = 1;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;

        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnBanHangMouseClicked

    private void btnSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseClicked
        b1 = 0;
        b2 = 1;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnSanPhamMouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        b1 = 0;
        b2 = 0;
        b3 = 1;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseClicked
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 1;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnHoaDonMouseClicked

    private void btnkhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhuyenMaiMouseClicked
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 1;
        b6 = 0;
        b7 = 0;
        b8 = 0;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnkhuyenMaiMouseClicked

    private void btnKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseClicked
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 1;
        b7 = 0;
        b8 = 0;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnKhachHangMouseClicked

    private void btnThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseClicked
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 1;
        b8 = 0;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThoat.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnThongKeMouseClicked

    private void btnThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseClicked
        b1 = 0;
        b2 = 0;
        b3 = 0;
        b4 = 0;
        b5 = 0;
        b6 = 0;
        b7 = 0;
        b8 = 1;
        btnBanHang.setBackground(new Color(0, 0, 0, 0));
        btnSanPham.setBackground(new Color(0, 0, 0, 0));
        btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        btnThongKe.setBackground(new Color(0, 0, 0, 0));
    }//GEN-LAST:event_btnThoatMouseClicked

    private void btnBanHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBanHangMouseEntered
        btnBanHang.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnBanHangMouseEntered

    private void btnSanPhamMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseEntered
        btnSanPham.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnSanPhamMouseEntered

    private void btnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseEntered
        btnNhanVien.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnNhanVienMouseEntered

    private void btnHoaDonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseEntered
        btnHoaDon.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnHoaDonMouseEntered

    private void btnkhuyenMaiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhuyenMaiMouseEntered
        btnkhuyenMai.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnkhuyenMaiMouseEntered

    private void btnKhachHangMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseEntered
        btnKhachHang.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnKhachHangMouseEntered

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        btnThongKe.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThoatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseEntered
        btnThoat.setBackground(new Color(50, 159, 200));
    }//GEN-LAST:event_btnThoatMouseEntered

    private void btnSanPhamMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSanPhamMouseExited
        if (b2 == 0) {
            btnSanPham.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnSanPhamMouseExited

    private void btnNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseExited
        if (b3 == 0) {
            btnNhanVien.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnNhanVienMouseExited

    private void btnHoaDonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHoaDonMouseExited
        if (b4 == 0) {
            btnHoaDon.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnHoaDonMouseExited

    private void btnkhuyenMaiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkhuyenMaiMouseExited
        if (b5 == 0) {
            btnkhuyenMai.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnkhuyenMaiMouseExited

    private void btnKhachHangMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKhachHangMouseExited
        if (b6 == 0) {
            btnKhachHang.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnKhachHangMouseExited

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        if (b7 == 0) {
            btnThongKe.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnThoatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThoatMouseExited
        if (b8 == 0) {
            btnThoat.setBackground(new Color(0, 0, 0, 0));
        }
    }//GEN-LAST:event_btnThoatMouseExited

    private void btnCTNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCTNVActionPerformed
        // TODO add your handling code here:
        NhanVien nv = TenTKNV.tenNV;
        DetailChiTietNV detailChiTietNV = new DetailChiTietNV(this, true, nv);
        detailChiTietNV.setVisible(true);
    }//GEN-LAST:event_btnCTNVActionPerformed

    private void btnDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMKActionPerformed
        // TODO add your handling code here:
        ViewDoiMatKhau2 dmk = new ViewDoiMatKhau2();
        dmk.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnDoiMKActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewQuanLy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnCTNV;
    private javax.swing.JButton btnDoiMK;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSanPham;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnkhuyenMai;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel panelBanHang;
    private view.ViewMenu view2;
    // End of variables declaration//GEN-END:variables
}
