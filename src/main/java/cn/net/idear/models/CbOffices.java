package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@Entity
@Table(name = "cb_offices", schema = "cb_data", catalog = "")
public class CbOffices {
    private long id;
    private String objectId;
    private long officeId;
    private String description;
    private String region;
    private String address1;
    private String address2;
    private String city;
    private String zipCode;
    private String stateCode;
    private String countryCode;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private Date createdAt;
    private Date updatedAt;

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
    @Column(name = "office_id")
    public long getOfficeId() {
        return officeId;
    }

    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "address1")
    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    @Basic
    @Column(name = "address2")
    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "zip_code")
    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Basic
    @Column(name = "state_code")
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

    @Basic
    @Column(name = "country_code")
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Basic
    @Column(name = "latitude")
    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    @Basic
    @Column(name = "longitude")
    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @Basic
    @Column(name = "created_at")
    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbOffices cbOffices = (CbOffices) o;

        if (id != cbOffices.id) return false;
        if (officeId != cbOffices.officeId) return false;
        if (objectId != null ? !objectId.equals(cbOffices.objectId) : cbOffices.objectId != null) return false;
        if (description != null ? !description.equals(cbOffices.description) : cbOffices.description != null)
            return false;
        if (region != null ? !region.equals(cbOffices.region) : cbOffices.region != null) return false;
        if (address1 != null ? !address1.equals(cbOffices.address1) : cbOffices.address1 != null) return false;
        if (address2 != null ? !address2.equals(cbOffices.address2) : cbOffices.address2 != null) return false;
        if (city != null ? !city.equals(cbOffices.city) : cbOffices.city != null) return false;
        if (zipCode != null ? !zipCode.equals(cbOffices.zipCode) : cbOffices.zipCode != null) return false;
        if (stateCode != null ? !stateCode.equals(cbOffices.stateCode) : cbOffices.stateCode != null) return false;
        if (countryCode != null ? !countryCode.equals(cbOffices.countryCode) : cbOffices.countryCode != null)
            return false;
        if (latitude != null ? !latitude.equals(cbOffices.latitude) : cbOffices.latitude != null) return false;
        if (longitude != null ? !longitude.equals(cbOffices.longitude) : cbOffices.longitude != null) return false;
        if (createdAt != null ? !createdAt.equals(cbOffices.createdAt) : cbOffices.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cbOffices.updatedAt) : cbOffices.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (int) (officeId ^ (officeId >>> 32));
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (address1 != null ? address1.hashCode() : 0);
        result = 31 * result + (address2 != null ? address2.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (zipCode != null ? zipCode.hashCode() : 0);
        result = 31 * result + (stateCode != null ? stateCode.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (latitude != null ? latitude.hashCode() : 0);
        result = 31 * result + (longitude != null ? longitude.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
