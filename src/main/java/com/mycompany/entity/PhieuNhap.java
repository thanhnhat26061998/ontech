/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class PhieuNhap implements Serializable{
    @Id
    private String maPN;
    private double tongTien;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date ngayNhap;
    @OneToMany(mappedBy = "phieuNhap")
    private List<NhaCungCap> nhaCungCap;
    @OneToMany(mappedBy = "phieuNhap")
    private List<ChiTietPN> chiTietPN;
    @ManyToOne
    @JoinColumn(name = "maNV")
    private NhanVien nhanVien;
}
