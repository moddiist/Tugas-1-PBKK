package modis.model;

import org.springframework.stereotype.Component;

public class PBKK implements MataKuliah {

	@Override
	public String namaMatKul() {
		// TODO Auto-generated method stub
		return "Pemrograman Berbasis Kerangka Kerja";
	}

	@Override
	public Integer jumlahSiswa() {
		// TODO Auto-generated method stub
		return 28;
	}

	@Override
	public String jadwal() {
		// TODO Auto-generated method stub
		return "Senin";
	}

	@Override
	public Integer bobot() {
		// TODO Auto-generated method stub
		return 3;
	}

}
