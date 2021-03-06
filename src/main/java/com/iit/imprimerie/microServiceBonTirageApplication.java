package com.iit.imprimerie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.iit.imprimerie.services.BonTirageService;
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
@RefreshScope
@EnableConfigurationProperties
public class microServiceBonTirageApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(microServiceBonTirageApplication.class, args);
	}
@Autowired
BonTirageService bs;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//BonTirage b= new BonTirage(new Date(), 52);
		//bs.EffectuerBon(b);
	}

}
