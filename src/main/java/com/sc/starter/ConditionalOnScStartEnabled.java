package com.sc.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@ConditionalOnProperty(
        value = {"sc.test.enabled"},
        matchIfMissing = true
)
//是否开启使用
public @interface ConditionalOnScStartEnabled {



}
