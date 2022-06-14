
package com.xtesoft.config.source.model;

import java.io.Serializable;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "action",
    "node"
})
@Generated("jsonschema2pojo")
public class EtcdKeyValueAll implements Serializable
{

    @JsonProperty("action")
    private String action;
    @JsonProperty("node")
    @Valid
    private NodeAll node;
    private final static long serialVersionUID = 7365765756925705356L;

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("node")
    public NodeAll getNode() {
        return node;
    }

    @JsonProperty("node")
    public void setNode(NodeAll node) {
        this.node = node;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EtcdKeyValueAll.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("node");
        sb.append('=');
        sb.append(((this.node == null)?"<null>":this.node));
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
        result = ((result* 31)+((this.action == null)? 0 :this.action.hashCode()));
        result = ((result* 31)+((this.node == null)? 0 :this.node.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EtcdKeyValueAll) == false) {
            return false;
        }
        EtcdKeyValueAll rhs = ((EtcdKeyValueAll) other);
        return (((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action)))&&((this.node == rhs.node)||((this.node!= null)&&this.node.equals(rhs.node))));
    }

}
