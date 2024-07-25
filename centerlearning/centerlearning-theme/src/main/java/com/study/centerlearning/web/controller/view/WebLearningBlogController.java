package com.study.centerlearning.web.controller.view;

import com.tvd12.ezyhttp.server.core.annotation.Controller;
import com.tvd12.ezyhttp.server.core.annotation.DoGet;
import com.tvd12.ezyhttp.server.core.view.View;

import static org.youngmonkeys.ezyplatform.constant.CommonConstants.VIEW_VARIABLE_PAGE_TITLE;

@Controller
public class WebLearningBlogController {

    @DoGet("/blog")
    public View blog() {
        return View.builder()
            .template("blog")
            .addVariable(VIEW_VARIABLE_PAGE_TITLE, "Blog")
            .build();
    }
}
