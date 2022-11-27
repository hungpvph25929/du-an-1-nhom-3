/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;

import domainmodel.NhanVien;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import service.impl.NhanVienServiceImpl;

/**
 *
 * @author Quang Huy
 */
public class PanelNhanVien extends javax.swing.JPanel {
    
    private DefaultTableModel dtm = new DefaultTableModel();
    private List<NhanVien> list = new ArrayList<>();
    private List<NhanVien> listSearch = new ArrayList<>();
    private NhanVienServiceImpl nhanVienServiceImpl = new NhanVienServiceImpl();

    /**
     * Creates new form PanelNhanVien
     */
    public PanelNhanVien() {
        initComponents();
        pnQLNV.setBackground(Color.white);
        pnThongTinNV.setBackground(Color.white);
        pnDanhSachNV.setBackground(Color.white);
        tbNhanVien.setBackground(Color.white);
        String[] header = {"Mã NV", "Tên NV", "Giới tính", "Ngày sinh", "Địa chỉ", "SĐT", "Email", "Trạng thái", "Chức vụ"};
        tbNhanVien.setModel(dtm);
        dtm.setColumnIdentifiers(header);
        list = nhanVienServiceImpl.getAll();
        showData(list);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnQLNV = new javax.swing.JPanel();
        pnThongTinNV = new javax.swing.JPanel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        radioNam = new javax.swing.JRadioButton();
        radioNu = new javax.swing.JRadioButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        txtSdt = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        radioQuanLy = new javax.swing.JRadioButton();
        radioNhanVien = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        radioDaNghi = new javax.swing.JRadioButton();
        jLabel55 = new javax.swing.JLabel();
        radioDangLamViec = new javax.swing.JRadioButton();
        btnNew = new javax.swing.JButton();
        txtNgaySinh = new javax.swing.JTextField();
        pnDanhSachNV = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbNhanVien = new javax.swing.JTable();
        jLabel54 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();

        pnThongTinNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Thông Tin Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        jLabel47.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel47.setText("Họ tên");

        jLabel48.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel48.setText("Giới tính");

        buttonGroup1.add(radioNam);
        radioNam.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioNam.setSelected(true);
        radioNam.setText("Nam");

        buttonGroup1.add(radioNu);
        radioNu.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioNu.setText("Nữ");

        jLabel49.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel49.setText("Ngày sinh");

        jLabel50.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel50.setText("Số điện thoại");

        jLabel51.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel51.setText("Địa Chỉ");

        jLabel52.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel52.setText("Email");

        jLabel53.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel53.setText("Chức vụ");

        txtTen.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtTen.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(40, 184, 213)));

        txtSdt.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(40, 184, 213)));

        txtDiaChi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDiaChi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(40, 184, 213)));

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(40, 184, 213)));

        buttonGroup2.add(radioQuanLy);
        radioQuanLy.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioQuanLy.setText("Quản lý");

        buttonGroup2.add(radioNhanVien);
        radioNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioNhanVien.setSelected(true);
        radioNhanVien.setText("Nhân Viên");

        btnThem.setBackground(new java.awt.Color(41, 183, 212));
        btnThem.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnThem.setForeground(new java.awt.Color(255, 255, 255));
        btnThem.setIcon(new ImageIcon("src/main/img/addNV.png"));
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(41, 183, 212));
        btnSua.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSua.setForeground(new java.awt.Color(255, 255, 255));
        btnSua.setIcon(new ImageIcon("src/main/img/updateNV.png"));
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        buttonGroup3.add(radioDaNghi);
        radioDaNghi.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioDaNghi.setText("Đã nghỉ việc");

        jLabel55.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel55.setText("Trạng thái");

        buttonGroup3.add(radioDangLamViec);
        radioDangLamViec.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        radioDangLamViec.setSelected(true);
        radioDangLamViec.setText("Đang làm việc");

        btnNew.setBackground(new java.awt.Color(41, 183, 212));
        btnNew.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnNew.setForeground(new java.awt.Color(255, 255, 255));
        btnNew.setIcon(new ImageIcon("src/main/img/newNV.png"));
        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        txtNgaySinh.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtNgaySinh.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(40, 184, 213)));

        javax.swing.GroupLayout pnThongTinNVLayout = new javax.swing.GroupLayout(pnThongTinNV);
        pnThongTinNV.setLayout(pnThongTinNVLayout);
        pnThongTinNVLayout.setHorizontalGroup(
            pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinNVLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnThongTinNVLayout.createSequentialGroup()
                        .addComponent(jLabel50)
                        .addGap(18, 18, 18)
                        .addComponent(txtSdt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnThongTinNVLayout.createSequentialGroup()
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel48, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel49, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnThongTinNVLayout.createSequentialGroup()
                                .addComponent(radioNam)
                                .addGap(21, 21, 21)
                                .addComponent(radioNu))
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgaySinh))))
                .addGap(158, 158, 158)
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(465, 465, 465))
                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnThongTinNVLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioDangLamViec)
                                            .addComponent(radioQuanLy))
                                        .addGap(18, 18, 18)
                                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(radioNhanVien)
                                            .addComponent(radioDaNghi)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinNVLayout.createSequentialGroup()
                                .addComponent(jLabel51, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(34, 34, 34)
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(169, 169, 169))))
            .addGroup(pnThongTinNVLayout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnThongTinNVLayout.setVerticalGroup(
            pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnThongTinNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel51)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(radioNam)
                            .addComponent(radioNu)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnThongTinNVLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)))
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnThongTinNVLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioQuanLy, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel53)
                            .addComponent(radioNhanVien))))
                .addGap(21, 21, 21)
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel50)
                    .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel55)
                    .addComponent(radioDangLamViec)
                    .addComponent(radioDaNghi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnThongTinNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnNew, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnDanhSachNV.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Danh Sách Nhân Viên", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        tbNhanVien.setAutoCreateRowSorter(true);
        tbNhanVien.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        tbNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tbNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã", "Họ Và Tên", "Giới Tính", "Ngày Sinh", "Số điện thoại", "Địa Chỉ", "Email", "Tình Trạng"
            }
        ));
        tbNhanVien.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbNhanVien.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tbNhanVien.setGridColor(new java.awt.Color(0, 0, 0));
        tbNhanVien.setRowHeight(20);
        tbNhanVien.setShowGrid(false);
        tbNhanVien.getTableHeader().setReorderingAllowed(false);
        tbNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNhanVienMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbNhanVien);

        jLabel54.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel54.setIcon(new ImageIcon("src/main/img/searchNV.png"));
        jLabel54.setText("Tìm kiếm");

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(40, 184, 213)));
        txtSearch.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchCaretUpdate(evt);
            }
        });

        javax.swing.GroupLayout pnDanhSachNVLayout = new javax.swing.GroupLayout(pnDanhSachNV);
        pnDanhSachNV.setLayout(pnDanhSachNVLayout);
        pnDanhSachNVLayout.setHorizontalGroup(
            pnDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7)
                    .addGroup(pnDanhSachNVLayout.createSequentialGroup()
                        .addComponent(jLabel54)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnDanhSachNVLayout.setVerticalGroup(
            pnDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnDanhSachNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnDanhSachNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel54)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnQLNVLayout = new javax.swing.GroupLayout(pnQLNV);
        pnQLNV.setLayout(pnQLNVLayout);
        pnQLNVLayout.setHorizontalGroup(
            pnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnQLNVLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnDanhSachNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnThongTinNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnQLNVLayout.setVerticalGroup(
            pnQLNVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnQLNVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnThongTinNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnDanhSachNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        NhanVien nhanVien = getData();
        JOptionPane.showMessageDialog(this, nhanVienServiceImpl.addOrUpdate(nhanVien)+"\nHệ thống đang tiến hành gửi Email \nVui lòng nhấn OK và đợi trong giây lát...");
        list = nhanVienServiceImpl.getAll();
        showData(list);
        String email = nhanVien.getEmail();
        if (nhanVienServiceImpl.addOrUpdate(nhanVien).equalsIgnoreCase("Thành công")) {
            guiMail(email);
            JOptionPane.showMessageDialog(this, "Đã gửi thông báo và mật khẩu tới email của "+nhanVien.getMa()+"\nNhân viên: "+nhanVien.getHoTen()+"\nEmail: "+nhanVien.getEmail());
        }
    }//GEN-LAST:event_btnThemActionPerformed
    private NhanVien getData() {
        NhanVien nhanVien = new NhanVien();
        nhanVien.setMa("NV0"+(list.size()+1));
        nhanVien.setHoTen(txtTen.getText());
        if (radioNam.isSelected()) {
            nhanVien.setGioiTinh(true);
        } else {
            nhanVien.setGioiTinh(false);
        }
        if (!txtEmail.getText().isEmpty()) {
            SimpleDateFormat convertToDate = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = convertToDate.parse(txtNgaySinh.getText());
            nhanVien.setNgaySinh(date);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        }
        nhanVien.setDiaChi(txtDiaChi.getText());
        nhanVien.setSdt(txtSdt.getText());
        nhanVien.setEmail(txtEmail.getText());
        nhanVien.setMatKhau("123456");
        if (radioDangLamViec.isSelected()) {
            nhanVien.setTrangThai(0);
        } else {
            nhanVien.setTrangThai(1);
        }
        if (radioQuanLy.isSelected()) {
            nhanVien.setChucVu(0);
        } else {
            nhanVien.setChucVu(1);
        }
        nhanVien.setCreatedDate(new Date());
        nhanVien.setLastModifiedDate(new Date());
        return nhanVien;
    }

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        int row = tbNhanVien.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên để tiến hành sửa.");
        } else {
            NhanVien nv = list.get(row);
        NhanVien nhanVien = new NhanVien();
        nhanVien.setId(nv.getId());
        nhanVien.setMa(nv.getMa());
        nhanVien.setHoTen(txtTen.getText());
        if (radioNam.isSelected()) {
            nhanVien.setGioiTinh(true);
        } else {
            nhanVien.setGioiTinh(false);
        }
        SimpleDateFormat convertToDate = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date date = convertToDate.parse(txtNgaySinh.getText());
            nhanVien.setNgaySinh(date);
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
        nhanVien.setMatKhau(nv.getMatKhau());
        nhanVien.setDiaChi(txtDiaChi.getText());
        nhanVien.setSdt(txtSdt.getText());
        nhanVien.setEmail(txtEmail.getText());
        if (radioDangLamViec.isSelected()) {
            nhanVien.setTrangThai(0);
        } else {
            nhanVien.setTrangThai(1);
        }
        if (radioQuanLy.isSelected()) {
            nhanVien.setChucVu(0);
        } else {
            nhanVien.setChucVu(1);
        }
        nhanVien.setLastModifiedDate(new Date());
        JOptionPane.showMessageDialog(this, nhanVienServiceImpl.addOrUpdate(nhanVien));
        list = nhanVienServiceImpl.getAll();
        showData(list);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void txtSearchCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchCaretUpdate
        String search = txtSearch.getText();
        if (search.isEmpty()) {
            showData(list);
        } else {
            List<NhanVien> listSearch = nhanVienServiceImpl.search(search);
            showData(listSearch);
        }
    }//GEN-LAST:event_txtSearchCaretUpdate

    private void tbNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNhanVienMouseClicked
        // TODO add your handling code here:
        if (txtSearch.getText().isEmpty()) {
            int row = tbNhanVien.getSelectedRow();
            NhanVien nv = list.get(row);
            txtTen.setText(nv.getHoTen());
            if (nv.isGioiTinh()) {
                radioNam.setSelected(true);
            } else {
                radioNu.setSelected(true);
            }
            String date;
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            date = dateFormat.format(nv.getNgaySinh());
            txtNgaySinh.setText(date);
            txtDiaChi.setText(nv.getDiaChi());
            txtSdt.setText(nv.getSdt());
            txtEmail.setText(nv.getEmail());
            if (nv.getChucVu() == 0) {
                radioQuanLy.setSelected(true);
            } else {
                radioNhanVien.setSelected(true);
            }
            if (nv.getTrangThai() == 0) {
                radioDangLamViec.setSelected(true);
            } else {
                radioDaNghi.setSelected(true);
            }
        } else {
            List<NhanVien> listSearch = nhanVienServiceImpl.search(txtSearch.getText());
            int row = tbNhanVien.getSelectedRow();
            NhanVien nv = listSearch.get(row);
            txtTen.setText(nv.getHoTen());
            if (nv.isGioiTinh()) {
                radioNam.setSelected(true);
            } else {
                radioNu.setSelected(true);
            }
            String date;
            DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            date = dateFormat.format(nv.getNgaySinh());
            txtNgaySinh.setText(date);
            txtDiaChi.setText(nv.getDiaChi());
            txtSdt.setText(nv.getSdt());
            txtEmail.setText(nv.getEmail());
            if (nv.getChucVu() == 0) {
                radioQuanLy.setSelected(true);
            } else {
                radioNhanVien.setSelected(true);
            }
            if (nv.getTrangThai() == 0) {
                radioDangLamViec.setSelected(true);
            } else {
                radioDaNghi.setSelected(true);
            }
            
        }
    }//GEN-LAST:event_tbNhanVienMouseClicked

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        txtTen.setText("");
        radioNam.setSelected(true);
        txtNgaySinh.setText("");
        txtSdt.setText("");
        txtDiaChi.setText("");
        txtEmail.setText("");
        radioNhanVien.setSelected(true);
        radioDangLamViec.setSelected(true);
    }//GEN-LAST:event_btnNewActionPerformed
    private void showData(List<NhanVien> list) {
        dtm.setRowCount(0);
        for (NhanVien nhanVien : list) {
            dtm.addRow(nhanVien.toDataRow());
        }
    }
    
    private void guiMail(String email) {
        final String username = "laptopgroup3@gmail.com";
        final String password = "lveekscgavporrkq";
        
        Properties prop = new Properties();
        prop.put("mail.smtp.host", "smtp.gmail.com");
        prop.put("mail.smtp.port", "587");
        prop.put("mail.smtp.auth", "true");
        prop.put("mail.smtp.starttls.enable", "true"); //TLS

        Session session = Session.getInstance(prop,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });
        
        try {
            
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("from@gmail.com"));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(email)
            );
            message.setSubject("Welcome to Laptop Group 3 Store");
            message.setText("Dear " + email + ", "
                    + "\nCongratulations on being recruited as an employee of Laptop Group 3 Store "
                    + "\nYour default password is: 123456 \nPlease change your password the first time you log in to the system. "
                    + "\nSincerely thank you."
                    + "\nWish you will have a lot of fun when working at our store in the near future.");
            
            Transport.send(message);
            
            System.out.println("Done");
            
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JPanel pnDanhSachNV;
    private javax.swing.JPanel pnQLNV;
    private javax.swing.JPanel pnThongTinNV;
    private javax.swing.JRadioButton radioDaNghi;
    private javax.swing.JRadioButton radioDangLamViec;
    private javax.swing.JRadioButton radioNam;
    private javax.swing.JRadioButton radioNhanVien;
    private javax.swing.JRadioButton radioNu;
    private javax.swing.JRadioButton radioQuanLy;
    private javax.swing.JTable tbNhanVien;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}
