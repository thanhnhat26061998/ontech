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

/**
 *
 * @author Laptop88
 */
@Entity
public class HinhAnh implements Serializable{
    @Id
    private String id;
    private String ten;
    @ManyToOne
    @JoinColumn(name = "maSP")
    private SanPham sanPham;
    
}
