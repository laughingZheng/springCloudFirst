package com.laughing;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients(basePackages = "com.laughing")
@EnableEurekaClient
@SpringBootApplication
@EnableHystrixDashboard
@EnableHystrix
//@ComponentScan(basePackages = {"com.laughing", "com.laughing.service.impl"})
public class EurekaFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaFeignClientApplication.class, args);
	}

//	// 这个是2.02要添加的，不然仪表盘不显示
//	@Bean
//	public ServletRegistrationBean getServlet(){
//		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//		registrationBean.setLoadOnStartup(1);
//		registrationBean.addUrlMappings("/hystrix.stream");
//		registrationBean.setName("HystrixMetricsStreamServlet");
//		return registrationBean;
//	}
}
