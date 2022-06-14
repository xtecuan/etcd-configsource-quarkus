
package com.xtesoft.config.source.model;

import java.io.Serializable;
import java.util.List;
import javax.annotation.Generated;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "dir",
    "nodes"
})
@Generated("jsonschema2pojo")
public class NodeAll implements Serializable
{

    @JsonProperty("dir")
    private Boolean dir;
    @JsonProperty("nodes")
    @Valid
    private List<Node> nodes = null;
    private final static long serialVersionUID = 8421340878197909287L;

    @JsonProperty("dir")
    public Boolean getDir() {
        return dir;
    }

    @JsonProperty("dir")
    public void setDir(Boolean dir) {
        this.dir = dir;
    }

    @JsonProperty("nodes")
    public List<Node> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(NodeAll.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dir");
        sb.append('=');
        sb.append(((this.dir == null)?"<null>":this.dir));
        sb.append(',');
        sb.append("nodes");
        sb.append('=');
        sb.append(((this.nodes == null)?"<null>":this.nodes));
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
        result = ((result* 31)+((this.dir == null)? 0 :this.dir.hashCode()));
        result = ((result* 31)+((this.nodes == null)? 0 :this.nodes.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NodeAll) == false) {
            return false;
        }
        NodeAll rhs = ((NodeAll) other);
        return (((this.dir == rhs.dir)||((this.dir!= null)&&this.dir.equals(rhs.dir)))&&((this.nodes == rhs.nodes)||((this.nodes!= null)&&this.nodes.equals(rhs.nodes))));
    }

}
