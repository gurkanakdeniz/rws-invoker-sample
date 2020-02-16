package com.example.demo.sample;

import com.rws.invoker.annotation.PathVariable;

public class RequestModel {

    @PathVariable(name = "userName")
    private String pathVariable;

    public String getPathVariable() {
        return pathVariable;
    }

    public void setPathVariable(String pathVariable) {
        this.pathVariable = pathVariable;
    }

}
