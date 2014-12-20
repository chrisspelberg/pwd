package pwd.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class User {

    @JsonProperty
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String emailAddress;

    @JsonProperty
    private String fullName;

    public User(String name, String emailAddress, String fullName) {
        assert name != null : "name is null";
        assert emailAddress != null : "emailAddress is null";
        assert fullName != null : "fullName is null";
        this.name = name;
        this.emailAddress = emailAddress;
        this.fullName = fullName;
    }

    @Override
    public int hashCode() {
        return id == null ? 0 : id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
