package com.study.centerlearning.web.test;

import com.tvd12.ezyhttp.server.boot.EzyHttpApplicationBootstrap;
import com.tvd12.ezyhttp.server.core.annotation.ComponentsScan;
import com.tvd12.ezyhttp.server.core.annotation.PropertiesSources;

@PropertiesSources({
    "config.properties",
    "setup.properties"
})
@ComponentsScan({
    "org.youngmonkeys.ezyplatform",
    "com.study.centerlearning",
    "org.youngmonkeys.elearning",
    "org.youngmonkeys.ezymail",
    "org.youngmonkeys.ecommerce",
    "org.youngmonkeys.ezylogin",
    "org.youngmonkeys.ezypayment",
    "org.youngmonkeys.ezysupport",
    "org.youngmonkeys.ezyarticle",
    "org.youngmonkeys.ezyrating"
})
public class CenterlearningThemeStartupTest {

    public static void main(String[] args) throws Exception {
        EzyHttpApplicationBootstrap.start(CenterlearningThemeStartupTest.class);
    }
}
