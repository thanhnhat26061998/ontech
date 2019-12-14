
package com.mycompany.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class KhachHang implements Serializable{
    @Id
    private String maKH;
    private String tenKH;
    private String diaChi;
    private String email;
    private String tenTK;
    private String matKhau;
    @OneToMany(mappedBy = "khachHang")
    private List<DonHang> donHang;
          
    
}
