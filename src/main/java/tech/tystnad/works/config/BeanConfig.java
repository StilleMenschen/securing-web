package tech.tystnad.works.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import tech.tystnad.works.util.IdWorker;

@Configuration
public class BeanConfig {
    @Value("${server.workerId}")
    private long workerId;
    @Value("${server.dataCenterId}")
    private long dataCenterId;

    @Bean("idWorker")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public IdWorker idWorker() {
        return new IdWorker(workerId, dataCenterId);
    }
}
