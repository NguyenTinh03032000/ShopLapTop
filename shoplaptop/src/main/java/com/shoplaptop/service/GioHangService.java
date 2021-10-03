package com.shoplaptop.service;

import com.shoplaptop.entities.GioHang;
import com.shoplaptop.entities.NguoiDung;

public interface GioHangService {
	
	GioHang getGioHangByNguoiDung(NguoiDung n);
	
	GioHang save(GioHang g);
}
