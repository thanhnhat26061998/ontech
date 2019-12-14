/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class SanPham implements Serializable{
    @Id
    private String maSP;
    private String tenSP;
    private int soLuong;
    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private ThongTinSP thongTinSP;
    @OneToMany(mappedBy = "sanPham")
    private List<ChiTietPN> chiTietPN;
    @OneToMany(mappedBy = "sanPham")
    private List<ChiTietDonHang> chiTietDonHang;
    @ManyToOne 
    @JoinColumn(name = "maBH")
    private BaoHanh baoHanh;
    @ManyToOne 
    @JoinColumn(name = "maLoaiSP")
    private LoaiSP loaiSP;
    @OneToMany(mappedBy = "sanPham")
    private List<HinhAnh> hinhAnh;
}
