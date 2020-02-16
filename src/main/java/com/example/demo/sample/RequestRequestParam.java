package com.example.demo.sample;

import com.rws.invoker.annotation.RequestParam;

public class RequestRequestParam {
    
    @RequestParam(name = "page")
    private int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
    
}
