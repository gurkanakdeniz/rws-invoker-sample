package com.example.demo.sample;

import com.rws.invoker.model.RestWebServiceBaseResponse;

public class ResponseRequestParam extends RestWebServiceBaseResponse {

    private int page;
    private int per_page;
    private int total;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getPer_page() {
        return per_page;
    }

    public void setPer_page(int per_page) {
        this.per_page = per_page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    // blah

    // TODO:GA:
}
//{
//    "page": 2,
//    "per_page": 6,
//    "total": 12,
//    "total_pages": 2,
//    "data": [
//        {
//            "id": 7,
//            "email": "michael.lawson@reqres.in",
//            "first_name": "Michael",
//            "last_name": "Lawson",
//            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/follettkyle/128.jpg"
//        },
//        {
//            "id": 8,
//            "email": "lindsay.ferguson@reqres.in",
//            "first_name": "Lindsay",
//            "last_name": "Ferguson",
//            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/araa3185/128.jpg"
//        },
//        {
//            "id": 9,
//            "email": "tobias.funke@reqres.in",
//            "first_name": "Tobias",
//            "last_name": "Funke",
//            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/vivekprvr/128.jpg"
//        },
//        {
//            "id": 10,
//            "email": "byron.fields@reqres.in",
//            "first_name": "Byron",
//            "last_name": "Fields",
//            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/russoedu/128.jpg"
//        },
//        {
//            "id": 11,
//            "email": "george.edwards@reqres.in",
//            "first_name": "George",
//            "last_name": "Edwards",
//            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/mrmoiree/128.jpg"
//        },
//        {
//            "id": 12,
//            "email": "rachel.howell@reqres.in",
//            "first_name": "Rachel",
//            "last_name": "Howell",
//            "avatar": "https://s3.amazonaws.com/uifaces/faces/twitter/hebertialmeida/128.jpg"
//        }
//    ]
//}