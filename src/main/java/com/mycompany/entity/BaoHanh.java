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
import javax.persistence.OneToMany;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class BaoHanh implements Serializable{
    @Id
    private String maBH;
    private String loaiBH;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date tuNgay;
    private Date denNgay;
    @OneToMany(mappedBy = "baoHanh")
    private List<SanPham> sanPham;
    
}
