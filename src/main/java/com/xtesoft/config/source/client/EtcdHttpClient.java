package com.xtesoft.config.source.client;

import com.xtesoft.config.source.service.EtcdClientV2ServiceV2;
import com.xtesoft.config.source.model.EtcdKeyValue;
import com.xtesoft.config.source.model.EtcdKeyValueAll;
import com.xtesoft.config.source.model.EtcdMeta;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;

import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.UriBuilder;

public class EtcdHttpClient {
    public static final String KEYS_PATH="/v2/keys/";
    private String baseUrl;
    private UriBuilder fullPath;
    private ResteasyClient client;
    private ResteasyWebTarget target;
    private EtcdClientV2ServiceV2 serviceV2;



    public EtcdHttpClient(String baseUrl) {
        this.baseUrl = baseUrl;
        init();
    }

    public EtcdHttpClient() {
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public void init(){
        this.fullPath = UriBuilder.fromPath(getBaseUrl());
        this.client = (ResteasyClient) ClientBuilder.newClient();
        this.target = client.target(this.fullPath);
        this.serviceV2 = target.proxy(EtcdClientV2ServiceV2.class);
    }

    public EtcdKeyValue getKey(String key){
        return serviceV2.getKey(key);
    }

    public EtcdKeyValueAll getKeys(){
        return serviceV2.getKeys();
    }

    public void putKey(String key, String value){
        serviceV2.putKey(key,value);
    }

    public EtcdMeta getMetadata(){
        return serviceV2.getVersion();
    }
}
