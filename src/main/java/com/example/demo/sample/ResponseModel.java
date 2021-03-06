package com.example.demo.sample;

import com.rws.invoker.model.RestWebServiceBaseResponse;

public class ResponseModel extends RestWebServiceBaseResponse {

    private String name;
    private String blog;

    private String current_user_url;
    private String current_user_authorizations_html_url;
    // blah blah

    public String getCurrent_user_url() {
        return current_user_url;
    }

    public void setCurrent_user_url(String current_user_url) {
        this.current_user_url = current_user_url;
    }

    public String getCurrent_user_authorizations_html_url() {
        return current_user_authorizations_html_url;
    }

    public void setCurrent_user_authorizations_html_url(String current_user_authorizations_html_url) {
        this.current_user_authorizations_html_url = current_user_authorizations_html_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

}
