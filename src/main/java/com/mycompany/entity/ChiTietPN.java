/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;



@Entity
public class ChiTietPN implements Serializable {

    
    private String soLuong;
    @ManyToOne
    @JoinColumn(name = "maPN")
    @Id
    private PhieuNhap phieuNhap;
    @ManyToOne
    @JoinColumn(name = "maSP")
   
    @Id
    private SanPham sanPham;
    

}
