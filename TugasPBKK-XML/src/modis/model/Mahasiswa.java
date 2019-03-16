package modis.model;

public class Mahasiswa {
	
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
