package com.shoplaptop.repository;

import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.shoplaptop.entities.NguoiDung;
import com.shoplaptop.entities.VaiTro;

public interface NguoiDungRepository extends JpaRepository<NguoiDung, Long>{

	NguoiDung findByEmail(String email);

	//Page<NguoiDung> findByVaiTro(Set<VaiTro> vaiTro, Pageable of);

	//List<NguoiDung> findByVaiTro(Set<VaiTro> vaiTro);
}
