package com.ninjasul._02_bean_overriding_familyman_prep;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FamilyManAutoConfiguration {

    /**
     * @ConditionalOnMissingBean 애노테이션 설정을 통해
     * familyMan 이라는 빈이 존재하지 않을 때만 해당 빈이 자동 설정 됨.
     */
    @Bean
    @ConditionalOnMissingBean
    public FamilyMan familyMan() {
        FamilyMan familyMan = new FamilyMan();
        familyMan.setName("dy");
        return familyMan;
    }
}
