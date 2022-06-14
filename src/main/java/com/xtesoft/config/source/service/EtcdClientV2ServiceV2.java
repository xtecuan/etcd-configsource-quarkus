package com.xtesoft.config.source.service;

import com.xtesoft.config.source.model.EtcdKeyValue;
import com.xtesoft.config.source.model.EtcdKeyValueAll;
import com.xtesoft.config.source.model.EtcdMeta;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/")
public interface EtcdClientV2ServiceV2 {
    @GET
    @Path("v2/keys/{key}")
    @Produces(MediaType.APPLICATION_JSON)
    public EtcdKeyValue getKey(@PathParam("key") String key) throws WebApplicationException;

    @GET
    @Path("v2/keys")
    @Produces(MediaType.APPLICATION_JSON)
    public EtcdKeyValueAll getKeys() throws WebApplicationException;

    @GET
    @Path("version")
    @Produces(MediaType.APPLICATION_JSON)
    public EtcdMeta getVersion();

    @PUT
    @Path("v2/keys/{key}")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    public void putKey(@PathParam("key") String key, @FormParam("value") String value) throws WebApplicationException;
}
