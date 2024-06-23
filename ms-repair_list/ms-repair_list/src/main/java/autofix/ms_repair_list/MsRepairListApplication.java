package autofix.ms_repair_list;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class MsRepairListApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsRepairListApplication.class, args);
	}

}
