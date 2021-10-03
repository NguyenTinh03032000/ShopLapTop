package com.shoplaptop.service;

import java.util.List;

import com.shoplaptop.entities.VaiTro;

public interface VaiTroService {

	VaiTro findByTenVaiTro(String tenVaiTro);
	List<VaiTro> findAllVaiTro();
}
