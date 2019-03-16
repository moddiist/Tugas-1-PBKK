package modis.app;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import modis.model.*;

 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		
		Mahasiswa modis = context.getBean("modis", Mahasiswa.class);
		System.out.println("Data Mahasiswa");
		System.out.println(modis);
		
		System.out.println("Mata Kuliah yang sedang diambil");
		System.out.println("Nama Mata Kuliah : " + modis.getMatkul().namaMatKul());
		System.out.println("Bobot Mata Kuliah : " + modis.getMatkul().bobot());
		System.out.println("Kelas diadakan pada hari : " + modis.getMatkul().jadwal());
		context.close();
	}

}
