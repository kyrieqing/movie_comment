package com.wq;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author kyrieqing[wangq_0228@163.com]
 */
@SpringBootApplication
@MapperScan("com.wq.mapper")
//@ComponentScan(basePackages = {"com.wq"})
public class MovieApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}
}
