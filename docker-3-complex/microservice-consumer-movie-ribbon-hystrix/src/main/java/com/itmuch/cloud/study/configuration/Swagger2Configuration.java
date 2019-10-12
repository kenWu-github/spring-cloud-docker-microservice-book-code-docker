package com.itmuch.cloud.study.configuration;

import com.github.xiaoymin.knife4j.spring.annotations.EnableSwaggerBootstrapUi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUi
@Import(BeanValidatorPluginsConfiguration.class)
@ConditionalOnProperty(name = "swagger2.enable", havingValue = "true")
public class Swagger2Configuration {
    //swagger2的配置文件，这里可以配置swagger2的一些基本的内容，比如扫描的包等等

    //构建 api文档的详细信息函数,注意这里的注解引用的是哪个
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("消费者")
                .description("消费者")
                .termsOfServiceUrl("http://localhost:8010")
//                .contact("developer@mail.com")
                .version("1.0")
                .build();
    }

}
