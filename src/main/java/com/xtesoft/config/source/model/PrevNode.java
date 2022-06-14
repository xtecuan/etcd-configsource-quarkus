
package com.xtesoft.config.source.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "key",
    "value",
    "modifiedIndex",
    "createdIndex"
})
@Generated("jsonschema2pojo")
public class PrevNode implements Serializable
{

    @JsonProperty("key")
    private String key;
    @JsonProperty("value")
    private String value;
    @JsonProperty("modifiedIndex")
    private Integer modifiedIndex;
    @JsonProperty("createdIndex")
    private Integer createdIndex;
    private final static long serialVersionUID = -4855444940156062174L;

    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    @JsonProperty("key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("modifiedIndex")
    public Integer getModifiedIndex() {
        return modifiedIndex;
    }

    @JsonProperty("modifiedIndex")
    public void setModifiedIndex(Integer modifiedIndex) {
        this.modifiedIndex = modifiedIndex;
    }

    @JsonProperty("createdIndex")
    public Integer getCreatedIndex() {
        return createdIndex;
    }

    @JsonProperty("createdIndex")
    public void setCreatedIndex(Integer createdIndex) {
        this.createdIndex = createdIndex;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(PrevNode.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("key");
        sb.append('=');
        sb.append(((this.key == null)?"<null>":this.key));
        sb.append(',');
        sb.append("value");
        sb.append('=');
        sb.append(((this.value == null)?"<null>":this.value));
        sb.append(',');
        sb.append("modifiedIndex");
        sb.append('=');
        sb.append(((this.modifiedIndex == null)?"<null>":this.modifiedIndex));
        sb.append(',');
        sb.append("createdIndex");
        sb.append('=');
        sb.append(((this.createdIndex == null)?"<null>":this.createdIndex));
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
        result = ((result* 31)+((this.value == null)? 0 :this.value.hashCode()));
        result = ((result* 31)+((this.key == null)? 0 :this.key.hashCode()));
        result = ((result* 31)+((this.modifiedIndex == null)? 0 :this.modifiedIndex.hashCode()));
        result = ((result* 31)+((this.createdIndex == null)? 0 :this.createdIndex.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrevNode) == false) {
            return false;
        }
        PrevNode rhs = ((PrevNode) other);
        return (((((this.value == rhs.value)||((this.value!= null)&&this.value.equals(rhs.value)))&&((this.key == rhs.key)||((this.key!= null)&&this.key.equals(rhs.key))))&&((this.modifiedIndex == rhs.modifiedIndex)||((this.modifiedIndex!= null)&&this.modifiedIndex.equals(rhs.modifiedIndex))))&&((this.createdIndex == rhs.createdIndex)||((this.createdIndex!= null)&&this.createdIndex.equals(rhs.createdIndex))));
    }

}
