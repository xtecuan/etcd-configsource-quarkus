
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
    "node",
    "prevNode"
})
@Generated("jsonschema2pojo")
public class EtcdKeyValue implements Serializable
{

    @JsonProperty("action")
    private String action;
    @JsonProperty("node")
    @Valid
    private Node node;
    @JsonProperty("prevNode")
    @Valid
    private PrevNode prevNode;
    private final static long serialVersionUID = 3657387651499939918L;

    @JsonProperty("action")
    public String getAction() {
        return action;
    }

    @JsonProperty("action")
    public void setAction(String action) {
        this.action = action;
    }

    @JsonProperty("node")
    public Node getNode() {
        return node;
    }

    @JsonProperty("node")
    public void setNode(Node node) {
        this.node = node;
    }

    @JsonProperty("prevNode")
    public PrevNode getPrevNode() {
        return prevNode;
    }

    @JsonProperty("prevNode")
    public void setPrevNode(PrevNode prevNode) {
        this.prevNode = prevNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(EtcdKeyValue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("action");
        sb.append('=');
        sb.append(((this.action == null)?"<null>":this.action));
        sb.append(',');
        sb.append("node");
        sb.append('=');
        sb.append(((this.node == null)?"<null>":this.node));
        sb.append(',');
        sb.append("prevNode");
        sb.append('=');
        sb.append(((this.prevNode == null)?"<null>":this.prevNode));
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
        result = ((result* 31)+((this.prevNode == null)? 0 :this.prevNode.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EtcdKeyValue) == false) {
            return false;
        }
        EtcdKeyValue rhs = ((EtcdKeyValue) other);
        return ((((this.action == rhs.action)||((this.action!= null)&&this.action.equals(rhs.action)))&&((this.node == rhs.node)||((this.node!= null)&&this.node.equals(rhs.node))))&&((this.prevNode == rhs.prevNode)||((this.prevNode!= null)&&this.prevNode.equals(rhs.prevNode))));
    }

}
