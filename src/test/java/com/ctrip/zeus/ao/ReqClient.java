package com.ctrip.zeus.ao;

import com.ctrip.zeus.client.AbstractRestClient;
import test.StringDemo;

import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by fanqq on 2015/3/30.
 */
public class ReqClient extends AbstractRestClient {

    public ReqClient(String url) {
        super(url);
    }

    public Response request(String path, String data) {
        Response res = getTarget().path(path).request()
                .post(Entity.entity(data,
                        MediaType.APPLICATION_JSON
                ));

        return res;
    }

    public Response request() {
        Response res = getTarget().request()
                .get();

        return res;
    }

    public Response get() {
        return request();
    }

    public String getstr() {
        String res = getTarget().request()
                .get(String.class);

        return res;
    }

    public Response post(String path, String data) {
        return request(path, data);
    }
}
