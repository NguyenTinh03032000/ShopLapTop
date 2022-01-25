package com.shoplaptop.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoplaptop.entities.ChiMucGioHang;
import com.shoplaptop.entities.GioHang;
import com.shoplaptop.entities.SanPham;

public interface ChiMucGioHangRepository extends JpaRepository<ChiMucGioHang, Long>{
	
	ChiMucGioHang findBySanPhamAndGioHang(SanPham sp,GioHang g);
	
	List<ChiMucGioHang> findByGioHang(GioHang g);
}
