package utility;

import domainmodel.ChiTietSP;
import domainmodel.HoaDon;
import domainmodel.HoaDonChiTiet;
import domainmodel.KhachHang;
import domainmodel.NhanVien;
import domainmodel.SanPham;
import domainmodel.SerialDaBan;
import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, "jdbc:sqlserver://localhost:1433;databaseName=DuAn1");
        properties.put(Environment.USER, "sa");
        properties.put(Environment.PASS, "25082003");
        properties.put(Environment.SHOW_SQL, "true");

        conf.setProperties(properties);
        conf.addAnnotatedClass(SanPham.class);
        conf.addAnnotatedClass(NhanVien.class);
        conf.addAnnotatedClass(KhachHang.class);
        conf.addAnnotatedClass(HoaDon.class);
        conf.addAnnotatedClass(ChiTietSP.class);
        conf.addAnnotatedClass(HoaDonChiTiet.class);
        conf.addAnnotatedClass(SerialDaBan.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties()).build();
        FACTORY = conf.buildSessionFactory(registry);

    }

    public static SessionFactory getFACTORY() {
        return FACTORY;
    }

    public static void main(String[] args) {
        getFACTORY();
    }
}
