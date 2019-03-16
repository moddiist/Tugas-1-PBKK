package modis.app;
import modis.model.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		Mahasiswa modis = context.getBean("diriku", Mahasiswa.class);
		modis.setNama("Modista Garsia");
		modis.setNrp("5116100031");
		modis.setEmail("garsiamodista@gmail.com");
		modis.setNohp("081330515755");
		System.out.println("Data Mahasiswa");
		System.out.println(modis);
		
		System.out.println("Mata Kuliah yang sedang diambil");
		System.out.println("Nama Mata Kuliah : " + modis.getMatkul().namaMatKul());
		System.out.println("Bobot Mata Kuliah : " + modis.getMatkul().bobot());
		System.out.println("Kelas diadakan pada hari : " + modis.getMatkul().jadwal());
		
		context.close();
	}

}
