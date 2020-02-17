package com.example.demo.sample;

import com.rws.invoker.annotation.RestWebServiceType;
import com.rws.invoker.model.RestWebServiceMethod;

public interface TestRestClient {

    @RestWebServiceType(RestWebServiceMethod.GET)
    public ResponseModel test();
    
    @RestWebServiceType(RestWebServiceMethod.GET)
    public ResponseModel testPathVariable(RequestModel request);
    
    @RestWebServiceType(RestWebServiceMethod.GET)
    public ResponseRequestParam testRequestParam(RequestRequestParam request);
    
    @RestWebServiceType(RestWebServiceMethod.POST)
    public ResponsePostModel testPost(RequestPostModel request);
    

}
