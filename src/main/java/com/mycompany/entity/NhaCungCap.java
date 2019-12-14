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
public class NhaCungCap implements Serializable{
    @Id
    private String maNCP;
    private String diaChi;
    private String tenNCC;
    private long SDT;
    @ManyToOne
    @JoinColumn(name = "maPN")
    private PhieuNhap phieuNhap;
    
}
