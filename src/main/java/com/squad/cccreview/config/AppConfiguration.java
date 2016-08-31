package com.squad.cccreview.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

@Configuration
public class AppConfiguration {
	@Value("${cloudinary.cloud}")
	private String cloudName;
	@Value("${cloudinary.key}")
	private String apiKey;
	@Value("${cloudinary.secret}")
	private String apiSecret;

	@Bean
	public Cloudinary getCloudinary(){
		Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
				  "cloud_name", cloudName,
				  "api_key", apiKey,
				  "api_secret", apiSecret));
		return cloudinary;
	}
}
