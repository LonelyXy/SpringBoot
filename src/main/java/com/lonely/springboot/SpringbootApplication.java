package com.lonely.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lonely.springboot.dao")
//extends SpringBootServletInitializer
public class SpringbootApplication  {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}

	//	实现fastjson的转换
//	@Bean
//	public HttpMessageConverters fastJsonHttpMessageConverters(){
//		//1. 需要定义一个converter转换消息的对象
//		FastJsonHttpMessageConverter fasHttpMessageConverter = new FastJsonHttpMessageConverter();
//
//		//2. 添加fastjson的配置信息，比如:是否需要格式化返回的json的数据
//		FastJsonConfig fastJsonConfig = new FastJsonConfig();
//		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
//
//		//3. 在converter中添加配置信息
//		fasHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
//		HttpMessageConverter<?> converter = fasHttpMessageConverter;
//		return new HttpMessageConverters(converter);
//	}

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//		return builder.sources(SpringbootApplication.class);
//	}
}
