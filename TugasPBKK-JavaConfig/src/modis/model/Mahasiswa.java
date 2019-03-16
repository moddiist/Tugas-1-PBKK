package modis.model;

import org.springframework.beans.factory.annotation.Value;
public class Mahasiswa {

	private MataKuliah matkul;
	@Value("${test.nama}")
	private String nama;
	
	@Value("${test.nrp}")
	private String nrp;
	
	@Value("${test.email}")
	private String email;
	
	@Value("${test.nohp}")
	private String nohp;
	
	public Mahasiswa() {}
	
	public Mahasiswa(MataKuliah matkul) {
		super();
		this.matkul = matkul;
	}

	public MataKuliah getMatkul() {
		return matkul;
	}

	public void setMatkul(MataKuliah matkul) {
		this.matkul = matkul;
	}


	@Override
	public String toString() {
		return "Mahasiswa [nama=" + nama + ", nrp=" + nrp + ", email=" + email + ", nohp=" + nohp + "]";
	}
	
	
	
}
