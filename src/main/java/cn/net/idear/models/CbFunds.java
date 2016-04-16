package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@Entity
@Table(name = "cb_funds", schema = "cb_data", catalog = "")
public class CbFunds {
    private long id;
    private long fundId;
    private String objectId;
    private String name;
    private Date fundedAt;
    private Integer raisedAmount;
    private String raisedCurrencyCode;
    private String sourceUrl;
    private String sourceDescription;
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
    @Column(name = "fund_id")
    public long getFundId() {
        return fundId;
    }

    public void setFundId(long fundId) {
        this.fundId = fundId;
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
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "funded_at")
    public Date getFundedAt() {
        return fundedAt;
    }

    public void setFundedAt(Date fundedAt) {
        this.fundedAt = fundedAt;
    }

    @Basic
    @Column(name = "raised_amount")
    public Integer getRaisedAmount() {
        return raisedAmount;
    }

    public void setRaisedAmount(Integer raisedAmount) {
        this.raisedAmount = raisedAmount;
    }

    @Basic
    @Column(name = "raised_currency_code")
    public String getRaisedCurrencyCode() {
        return raisedCurrencyCode;
    }

    public void setRaisedCurrencyCode(String raisedCurrencyCode) {
        this.raisedCurrencyCode = raisedCurrencyCode;
    }

    @Basic
    @Column(name = "source_url")
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    @Basic
    @Column(name = "source_description")
    public String getSourceDescription() {
        return sourceDescription;
    }

    public void setSourceDescription(String sourceDescription) {
        this.sourceDescription = sourceDescription;
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

        CbFunds cbFunds = (CbFunds) o;

        if (id != cbFunds.id) return false;
        if (fundId != cbFunds.fundId) return false;
        if (objectId != null ? !objectId.equals(cbFunds.objectId) : cbFunds.objectId != null) return false;
        if (name != null ? !name.equals(cbFunds.name) : cbFunds.name != null) return false;
        if (fundedAt != null ? !fundedAt.equals(cbFunds.fundedAt) : cbFunds.fundedAt != null) return false;
        if (raisedAmount != null ? !raisedAmount.equals(cbFunds.raisedAmount) : cbFunds.raisedAmount != null)
            return false;
        if (raisedCurrencyCode != null ? !raisedCurrencyCode.equals(cbFunds.raisedCurrencyCode) : cbFunds.raisedCurrencyCode != null)
            return false;
        if (sourceUrl != null ? !sourceUrl.equals(cbFunds.sourceUrl) : cbFunds.sourceUrl != null) return false;
        if (sourceDescription != null ? !sourceDescription.equals(cbFunds.sourceDescription) : cbFunds.sourceDescription != null)
            return false;
        if (createdAt != null ? !createdAt.equals(cbFunds.createdAt) : cbFunds.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cbFunds.updatedAt) : cbFunds.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (fundId ^ (fundId >>> 32));
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (fundedAt != null ? fundedAt.hashCode() : 0);
        result = 31 * result + (raisedAmount != null ? raisedAmount.hashCode() : 0);
        result = 31 * result + (raisedCurrencyCode != null ? raisedCurrencyCode.hashCode() : 0);
        result = 31 * result + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        result = 31 * result + (sourceDescription != null ? sourceDescription.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
