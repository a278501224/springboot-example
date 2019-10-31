package com.example.demo.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Description:自定义配置类
 * Auther:cherry
 * CreateTime:2019-10-30 14:06
 */

@Component
public class NeoProperties {
    @Value("${com.example.demo.title}")
    private String title;
    @Value("${com.example.demo.title.decription")
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
