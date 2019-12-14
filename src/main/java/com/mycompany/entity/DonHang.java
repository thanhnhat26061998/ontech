/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class DonHang implements Serializable{
    @Id
    private String maDH;
    private String tinhTrang;
    private LocalDate ngayLap;
    private double tongTien;
    @ManyToOne
    @JoinColumn(name = "maKH")
    private KhachHang khachHang;
    @ManyToOne
    @JoinColumn(name = "maNV")
    private NhanVien nhanVien;
    @OneToMany(mappedBy = "donHang")
    private List<ChiTietDonHang> chiTietDonHang;
    
    
    
    
}
