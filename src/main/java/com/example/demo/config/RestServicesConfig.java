package com.example.demo.config;

import java.util.HashMap;

import org.springframework.context.annotation.Configuration;

import com.rws.invoker.annotation.RestWebServiceInvokerEnable;
import com.rws.invoker.config.RestWebServiceConfig;
import com.rws.invoker.model.RestWebServiceEndpoint;
import com.rws.invoker.model.RestWebServiceMethod;

@RestWebServiceInvokerEnable
@Configuration
public class RestServicesConfig extends RestWebServiceConfig {

    @Override
    public HashMap<String, RestWebServiceEndpoint> endpoints() {
        HashMap<String, RestWebServiceEndpoint> response = new HashMap<String, RestWebServiceEndpoint>();

        RestWebServiceEndpoint restWebServiceEndpoint = new RestWebServiceEndpoint("https://api.github.com/",
                "com.example.demo.sample.TestRestClient", "test", RestWebServiceMethod.GET);
        response.put(restWebServiceEndpoint.getEndpointKey(), restWebServiceEndpoint);

        RestWebServiceEndpoint restWebServiceEndpoint2 = new RestWebServiceEndpoint(
                "https://api.github.com/users/:userName", "com.example.demo.sample.TestRestClient", "testPathVariable",
                RestWebServiceMethod.GET);
        response.put(restWebServiceEndpoint2.getEndpointKey(), restWebServiceEndpoint2);

//      https://reqres.in/api/users?page=2
        RestWebServiceEndpoint restWebServiceEndpoint4 = new RestWebServiceEndpoint("https://reqres.in/api/users",
                "com.example.demo.sample.TestRestClient", "testRequestParam", RestWebServiceMethod.GET);
        response.put(restWebServiceEndpoint4.getEndpointKey(), restWebServiceEndpoint4);

        RestWebServiceEndpoint restWebServiceEndpoint3 = new RestWebServiceEndpoint("https://reqres.in/api/users",
                "com.example.demo.sample.TestRestClient", "testPost", RestWebServiceMethod.POST);
        response.put(restWebServiceEndpoint3.getEndpointKey(), restWebServiceEndpoint3);

        return response;
    }

}
