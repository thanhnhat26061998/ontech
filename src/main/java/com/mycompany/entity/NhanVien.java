/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class NhanVien implements Serializable{
    @Id
    private String maNV;
    private String tenNV;
    private String chucVu;
    private long SDT;
    private String tenDN;
    private String matKhau;
    @OneToMany(mappedBy = "nhanVien")
    private List<DonHang> donHang;
    @OneToMany(mappedBy = "nhanVien")
    private List<PhieuNhap> phieuNhap;
    
}
