package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@GraphQLObject
@Entity
@Table(name = "cb_acquisitions", schema = "cb_data", catalog = "")
public class CbAcquisitions {
    private long id;
    private long acquisitionId;
    private String acquiringObjectId;
    private String acquiredObjectId;
    private String termCode;
    private Integer priceAmount;
    private String priceCurrencyCode;
    private Date acquiredAt;
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
    @Column(name = "acquisition_id")
    public long getAcquisitionId() {
        return acquisitionId;
    }

    public void setAcquisitionId(long acquisitionId) {
        this.acquisitionId = acquisitionId;
    }

    @Basic
    @Column(name = "acquiring_object_id")
    public String getAcquiringObjectId() {
        return acquiringObjectId;
    }

    public void setAcquiringObjectId(String acquiringObjectId) {
        this.acquiringObjectId = acquiringObjectId;
    }

    @Basic
    @Column(name = "acquired_object_id")
    public String getAcquiredObjectId() {
        return acquiredObjectId;
    }

    public void setAcquiredObjectId(String acquiredObjectId) {
        this.acquiredObjectId = acquiredObjectId;
    }

    @Basic
    @Column(name = "term_code")
    public String getTermCode() {
        return termCode;
    }

    public void setTermCode(String termCode) {
        this.termCode = termCode;
    }

    @Basic
    @Column(name = "price_amount")
    public Integer getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(Integer priceAmount) {
        this.priceAmount = priceAmount;
    }

    @Basic
    @Column(name = "price_currency_code")
    public String getPriceCurrencyCode() {
        return priceCurrencyCode;
    }

    public void setPriceCurrencyCode(String priceCurrencyCode) {
        this.priceCurrencyCode = priceCurrencyCode;
    }

    @Basic
    @Column(name = "acquired_at")
    public Date getAcquiredAt() {
        return acquiredAt;
    }

    public void setAcquiredAt(Date acquiredAt) {
        this.acquiredAt = acquiredAt;
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

        CbAcquisitions that = (CbAcquisitions) o;

        if (id != that.id) return false;
        if (acquisitionId != that.acquisitionId) return false;
        if (acquiringObjectId != null ? !acquiringObjectId.equals(that.acquiringObjectId) : that.acquiringObjectId != null)
            return false;
        if (acquiredObjectId != null ? !acquiredObjectId.equals(that.acquiredObjectId) : that.acquiredObjectId != null)
            return false;
        if (termCode != null ? !termCode.equals(that.termCode) : that.termCode != null) return false;
        if (priceAmount != null ? !priceAmount.equals(that.priceAmount) : that.priceAmount != null) return false;
        if (priceCurrencyCode != null ? !priceCurrencyCode.equals(that.priceCurrencyCode) : that.priceCurrencyCode != null)
            return false;
        if (acquiredAt != null ? !acquiredAt.equals(that.acquiredAt) : that.acquiredAt != null) return false;
        if (sourceUrl != null ? !sourceUrl.equals(that.sourceUrl) : that.sourceUrl != null) return false;
        if (sourceDescription != null ? !sourceDescription.equals(that.sourceDescription) : that.sourceDescription != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (acquisitionId ^ (acquisitionId >>> 32));
        result = 31 * result + (acquiringObjectId != null ? acquiringObjectId.hashCode() : 0);
        result = 31 * result + (acquiredObjectId != null ? acquiredObjectId.hashCode() : 0);
        result = 31 * result + (termCode != null ? termCode.hashCode() : 0);
        result = 31 * result + (priceAmount != null ? priceAmount.hashCode() : 0);
        result = 31 * result + (priceCurrencyCode != null ? priceCurrencyCode.hashCode() : 0);
        result = 31 * result + (acquiredAt != null ? acquiredAt.hashCode() : 0);
        result = 31 * result + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        result = 31 * result + (sourceDescription != null ? sourceDescription.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
