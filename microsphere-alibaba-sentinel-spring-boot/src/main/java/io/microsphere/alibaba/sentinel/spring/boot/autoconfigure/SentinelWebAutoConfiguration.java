package io.microsphere.alibaba.sentinel.spring.boot.autoconfigure;

import io.microsphere.alibaba.sentinel.redis.spring.SentinelRedisCommandInterceptor;
import io.microsphere.alibaba.sentinel.spring.boot.condition.ConditionalOnSentinelAvailable;
import io.microsphere.redis.spring.annotation.EnableRedisInterceptor;
import io.microsphere.redis.spring.boot.autoconfigure.condition.ConditionalOnRedisAvailable;
import io.microsphere.redis.spring.boot.autoconfigure.condition.ConditionalOnRedisInterceptorEnabled;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

import static io.microsphere.alibaba.sentinel.redis.SentinelRedisConstants.ENABLED_PROPERTY_NAME;

/**
 * Microsphere Sentinel Spring Boot Auto-Configuration
 *
 * @author <a href="mailto:mercyblitz@gmail.com">Mercy<a/>
 * @see com.alibaba.cloud.sentinel.custom.SentinelAutoConfiguration
 * @since 1.0.0
 */
@ConditionalOnSentinelAvailable
@ConditionalOnProperty(name = ENABLED_PROPERTY_NAME, matchIfMissing = true)
@ConditionalOnClass(name = {
        "io.microsphere.spring.web.method.support.HandlerMethodInterceptor",              // Microsphere Spring Web
        "io.microsphere.alibaba.sentinel.spring.web.SentinelHandlerMethodInterceptor"     // Microsphere Alibaba Sentinel x Spring Web
})
@AutoConfigureAfter(name = {
        "com.alibaba.cloud.sentinel.custom.SentinelAutoConfiguration",                    // Spring Cloud Alibaba Sentinel
        "org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration",     // Spring Boot WebMVC
        "org.springframework.boot.webmvc.autoconfigure.WebMvcAutoConfiguration",          // Spring Boot 4.0+ WebMVC
        "org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration",   // Spring Boot WebFlux
        "org.springframework.boot.webflux.autoconfigure.WebFluxAutoConfiguration"         // Spring Boot 4.0+ WebFlux
})
@Import(value = {
        SentinelWebAutoConfiguration.Config.class,
})
public class SentinelWebAutoConfiguration {

    @ConditionalOnRedisAvailable
    @ConditionalOnRedisInterceptorEnabled
    @EnableRedisInterceptor
    static class Config {

        @Bean
        @ConditionalOnMissingBean
        public SentinelRedisCommandInterceptor sentinelRedisCommandInterceptor() {
            return new SentinelRedisCommandInterceptor();
        }
    }

}