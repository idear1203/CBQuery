package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLIgnore;
import com.oembedler.moon.graphql.engine.stereotype.GraphQLNonNull;
import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;

/**
 * Created by wangdongwei on 4/12/16.
 */
@Entity
@Table(name = "cb_people", schema = "cb_data", catalog = "")
public class CbPeople {
    private long id;
    private String objectId;
    private String firstName;
    private String lastName;
    private String birthplace;
    private String affiliationName;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "object_id")
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    @Basic
    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "birthplace")
    public String getBirthplace() {
        return birthplace;
    }

    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }

    @Basic
    @Column(name = "affiliation_name")
    public String getAffiliationName() {
        return affiliationName;
    }

    public void setAffiliationName(String affiliationName) {
        this.affiliationName = affiliationName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbPeople cbPeople = (CbPeople) o;

        if (id != cbPeople.id) return false;
        if (objectId != null ? !objectId.equals(cbPeople.objectId) : cbPeople.objectId != null) return false;
        if (firstName != null ? !firstName.equals(cbPeople.firstName) : cbPeople.firstName != null) return false;
        if (lastName != null ? !lastName.equals(cbPeople.lastName) : cbPeople.lastName != null) return false;
        if (birthplace != null ? !birthplace.equals(cbPeople.birthplace) : cbPeople.birthplace != null) return false;
        if (affiliationName != null ? !affiliationName.equals(cbPeople.affiliationName) : cbPeople.affiliationName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (birthplace != null ? birthplace.hashCode() : 0);
        result = 31 * result + (affiliationName != null ? affiliationName.hashCode() : 0);
        return result;
    }
}
