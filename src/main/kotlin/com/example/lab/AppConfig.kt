package com.example.lab

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class AppConfig {
    @Bean
    open fun enterpriseContainer(): EnterpriseContainer {
        return EnterpriseContainer()
    }
}