/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domainmodel;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author FPT
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Hang")
public class Hang implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "Id")
    private UUID id;

    @Column(name = "Ma")
    private String ma;

    @Column(name = "Ten")
    private String ten;

    @Column(name = "CreatedDate")
    private Date createdDate;

    @Column(name = "LastModifiedDate")
    private Date alstModifiedDate;

    public String conVert(Date x) {
        DateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return format.format(x);
    }

    public Hang(String ma, String ten, Date createdDate, Date alstModifiedDate) {
        this.ma = ma;
        this.ten = ten;
        this.createdDate = createdDate;
        this.alstModifiedDate = alstModifiedDate;
    }

    public Hang(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Hang(UUID id) {
        this.id = id;
    }

}