package imannrhman.belajarspringdasar.processor;


import imannrhman.belajarspringdasar.aware.IdAware;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PrefixIdGeneratorPostProcessor implements BeanPostProcessor, Ordered {

    @Override
    public int getOrder() {
        return 2;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        log.info("Prefix Generator Processor {}", beanName);
        if (bean instanceof IdAware idAware) {
            log.info("Prefix Set Id Generator for Bean {}", beanName);
            idAware.setId("IMN-" + idAware.getId());
        }

        return bean;
    }
}
