
package com.xtesoft.config.source.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "etcdserver",
    "etcdcluster"
})
@Generated("jsonschema2pojo")
public class EtcdMeta implements Serializable
{

    @JsonProperty("etcdserver")
    private String etcdserver;
    @JsonProperty("etcdcluster")
    private String etcdcluster;
    private final static long serialVersionUID = 6668934495155216714L;

    @JsonProperty("etcdserver")
    public String getEtcdserver() {
        return etcdserver;
    }

    @JsonProperty("etcdserver")
    public void setEtcdserver(String etcdserver) {
        this.etcdserver = etcdserver;
    }

    @JsonProperty("etcdcluster")
    public String getEtcdcluster() {
        return etcdcluster;
    }

    @JsonProperty("etcdcluster")
    public void setEtcdcluster(String etcdcluster) {
        this.etcdcluster = etcdcluster;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EtcdMeta.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("etcdserver");
        sb.append('=');
        sb.append(((this.etcdserver == null)?"<null>":this.etcdserver));
        sb.append(',');
        sb.append("etcdcluster");
        sb.append('=');
        sb.append(((this.etcdcluster == null)?"<null>":this.etcdcluster));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.etcdserver == null)? 0 :this.etcdserver.hashCode()));
        result = ((result* 31)+((this.etcdcluster == null)? 0 :this.etcdcluster.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EtcdMeta) == false) {
            return false;
        }
        EtcdMeta rhs = ((EtcdMeta) other);
        return (((this.etcdserver == rhs.etcdserver)||((this.etcdserver!= null)&&this.etcdserver.equals(rhs.etcdserver)))&&((this.etcdcluster == rhs.etcdcluster)||((this.etcdcluster!= null)&&this.etcdcluster.equals(rhs.etcdcluster))));
    }

}
