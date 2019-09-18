package cn.com.scrh.scrh_business_server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;

@MapperScan("cn.com.scrh.scrh_business_server.mapper")
@SpringBootApplication
public class ScrhBusinessServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScrhBusinessServerApplication.class, args);
	}

}
