package modis.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("diriku")
public class Mahasiswa {
	
	@Autowired
	@Qualifier("PBKK")
	private MataKuliah matkul;
	private String nama;
	private String nrp;
	private String email;
	private String nohp;
	
	public Mahasiswa() {}
	
	public Mahasiswa(MataKuliah matkul) {
		super();
		this.matkul = matkul;
	}

	public Mahasiswa(MataKuliah matkul, String nama, String nrp, String email, String nohp) {
		super();
		this.matkul = matkul;
		this.nama = nama;
		this.nrp = nrp;
		this.email = email;
		this.nohp = nohp;
	}

	public MataKuliah getMatkul() {
		return matkul;
	}

	public void setMatkul(MataKuliah matkul) {
		this.matkul = matkul;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getNrp() {
		return nrp;
	}
	public void setNrp(String nrp) {
		this.nrp = nrp;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNohp() {
		return nohp;
	}
	public void setNohp(String nohp) {
		this.nohp = nohp;
	}
	

	@Override
	public String toString() {
		return "Mahasiswa [nama=" + nama + ", nrp=" + nrp + ", email=" + email + ", nohp=" + nohp + "]";
	}
	
	
	
}
