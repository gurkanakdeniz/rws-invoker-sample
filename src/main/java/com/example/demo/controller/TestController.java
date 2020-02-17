package com.example.demo.controller;

import java.lang.reflect.Method;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.sample.RequestModel;
import com.example.demo.sample.RequestPostModel;
import com.example.demo.sample.RequestRequestParam;
import com.example.demo.sample.ResponseModel;
import com.example.demo.sample.ResponsePostModel;
import com.example.demo.sample.ResponseRequestParam;
import com.example.demo.sample.TestRestClient;
import com.rws.invoker.annotation.RestWebService;
import com.rws.invoker.config.RestWebServiceHandler;
import com.rws.invoker.core.RestWebServiceFactory;

@Controller
@RequestMapping("/")
public class TestController {

    @RestWebService
    private TestRestClient testRestClient;
    
    @RestWebService
    private TestRestClient testRestClientasd;

    private TestRestClient testRestClient2 = RestWebServiceFactory.newInstance(TestRestClient.class,
            new RestWebServiceHandler() {

                @Override
                public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
                    System.out.println(" ------------------- custom invoke rest service -------------------");

                    return null;
                }
            });

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        ResponseModel test = testRestClient.test();

        RequestModel request1 = new RequestModel();
        request1.setPathVariable("gurkanakdeniz");
        ResponseModel test1 = testRestClient.testPathVariable(request1);

        RequestRequestParam request2 = new RequestRequestParam();
        request2.setPage(2);
        ResponseRequestParam test2 = testRestClient.testRequestParam(request2);

        RequestPostModel request3 = new RequestPostModel();
        request3.setJob("jedi");
        request3.setName("yoda");
        ResponsePostModel test3 = testRestClient.testPost(request3);

        return "of the jedi";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        testRestClient2.test();
        return "of the jedi";
    }

}
