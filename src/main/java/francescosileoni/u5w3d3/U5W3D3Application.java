package francescosileoni.u5w3d3;

import francescosileoni.u5w3d3.Es1.InfoAdapter;
import francescosileoni.u5w3d3.Es1.UserData;

import francescosileoni.u5w3d3.Es1.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);

		System.out.println();
		System.out.println("==== ES 1 ====");
		UserData ud = new UserData();
		Info info = new Info("Giovanni", "Bianchi", LocalDate.parse("1990-01-01"));

		ud.getData(new InfoAdapter(info));

		System.out.println();
		System.out.println("==== ES  2 ====");


	}

}
