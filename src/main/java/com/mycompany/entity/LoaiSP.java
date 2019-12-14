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
public class LoaiSP implements Serializable{
    @Id
    private String maLSP;
    private String TenLSP;
    @OneToMany(mappedBy = "loaiSP")
    private List<SanPham> sanPhams;
}
