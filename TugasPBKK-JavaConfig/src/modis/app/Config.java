package modis.app;
import modis.model.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:ini.properties")
public class Config {

	
	@Bean
	public MataKuliah matkulPBKK() {
		return new PBKK();
	}
	
	@Bean
	public Mahasiswa modis(MataKuliah matkul) {
		Mahasiswa modis = new Mahasiswa(matkulPBKK());
		return modis;
	}
	
}
