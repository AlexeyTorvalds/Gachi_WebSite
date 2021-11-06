package org.gachi;

import org.gachi.dataBase.DataBaseDungeon;
import org.gachi.dataBase.Master;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.gachi.dataBase.HibernateSessionFactory;
import org.springframework.context.annotation.*;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource(value = "classpath:application.properties", ignoreResourceNotFound = true)
public class SpringConfig implements WebMvcConfigurer {

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public DataBaseDungeon dataBase() {
        DataBaseDungeon dataBase = new DataBaseDungeon();
        dataBase.addMaster(new Master("Bill.jpg"));
        dataBase.addMaster(new Master("recardo.jpeg"));
        dataBase.addMaster(new Master("van1.jpg"));
        dataBase.addMaster(new Master("van2.jpeg"));
        return dataBase;
    }
}