package com.study.centerlearning.web.view;

import com.tvd12.ezyfox.bean.annotation.EzySingleton;
import com.tvd12.ezyhttp.server.core.view.View;
import lombok.AllArgsConstructor;
import org.youngmonkeys.ezyplatform.web.view.WebViewDecorator;

import javax.servlet.http.HttpServletRequest;

@EzySingleton
@AllArgsConstructor
public class WebLearningViewDecorator extends WebViewDecorator {

    @Override
    public void decorate(HttpServletRequest request, View view) {
        super.decorate(request, view);
    }

}
