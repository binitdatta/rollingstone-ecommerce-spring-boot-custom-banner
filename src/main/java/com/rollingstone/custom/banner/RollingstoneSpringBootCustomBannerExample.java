package com.rollingstone.custom.banner;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RollingstoneSpringBootCustomBannerExample {
  public static void main(String[] args) {
    SpringApplication app = new SpringApplication(RollingstoneSpringBootCustomBannerExample.class);
    String bannerOff = System.getProperty("banner-off");
    if (bannerOff != null && bannerOff.equalsIgnoreCase("true")) {
    	   app.setBannerMode(Mode.OFF); // Disable banner
    }
    app.run(args);
  }
}
