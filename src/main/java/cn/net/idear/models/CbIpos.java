package cn.net.idear.models;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@Entity
@Table(name = "cb_ipos", schema = "cb_data", catalog = "")
public class CbIpos {
    private long id;
    private long ipoId;
    private String objectId;
    private Integer valuationAmount;
    private String valuationCurrencyCode;
    private Integer raisedAmount;
    private String raisedCurrencyCode;
    private Date publicAt;
    private String stockSymbol;
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
    @Column(name = "ipo_id")
    public long getIpoId() {
        return ipoId;
    }

    public void setIpoId(long ipoId) {
        this.ipoId = ipoId;
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
    @Column(name = "valuation_amount")
    public Integer getValuationAmount() {
        return valuationAmount;
    }

    public void setValuationAmount(Integer valuationAmount) {
        this.valuationAmount = valuationAmount;
    }

    @Basic
    @Column(name = "valuation_currency_code")
    public String getValuationCurrencyCode() {
        return valuationCurrencyCode;
    }

    public void setValuationCurrencyCode(String valuationCurrencyCode) {
        this.valuationCurrencyCode = valuationCurrencyCode;
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
    @Column(name = "public_at")
    public Date getPublicAt() {
        return publicAt;
    }

    public void setPublicAt(Date publicAt) {
        this.publicAt = publicAt;
    }

    @Basic
    @Column(name = "stock_symbol")
    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
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

        CbIpos cbIpos = (CbIpos) o;

        if (id != cbIpos.id) return false;
        if (ipoId != cbIpos.ipoId) return false;
        if (objectId != null ? !objectId.equals(cbIpos.objectId) : cbIpos.objectId != null) return false;
        if (valuationAmount != null ? !valuationAmount.equals(cbIpos.valuationAmount) : cbIpos.valuationAmount != null)
            return false;
        if (valuationCurrencyCode != null ? !valuationCurrencyCode.equals(cbIpos.valuationCurrencyCode) : cbIpos.valuationCurrencyCode != null)
            return false;
        if (raisedAmount != null ? !raisedAmount.equals(cbIpos.raisedAmount) : cbIpos.raisedAmount != null)
            return false;
        if (raisedCurrencyCode != null ? !raisedCurrencyCode.equals(cbIpos.raisedCurrencyCode) : cbIpos.raisedCurrencyCode != null)
            return false;
        if (publicAt != null ? !publicAt.equals(cbIpos.publicAt) : cbIpos.publicAt != null) return false;
        if (stockSymbol != null ? !stockSymbol.equals(cbIpos.stockSymbol) : cbIpos.stockSymbol != null) return false;
        if (sourceUrl != null ? !sourceUrl.equals(cbIpos.sourceUrl) : cbIpos.sourceUrl != null) return false;
        if (sourceDescription != null ? !sourceDescription.equals(cbIpos.sourceDescription) : cbIpos.sourceDescription != null)
            return false;
        if (createdAt != null ? !createdAt.equals(cbIpos.createdAt) : cbIpos.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cbIpos.updatedAt) : cbIpos.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (ipoId ^ (ipoId >>> 32));
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (valuationAmount != null ? valuationAmount.hashCode() : 0);
        result = 31 * result + (valuationCurrencyCode != null ? valuationCurrencyCode.hashCode() : 0);
        result = 31 * result + (raisedAmount != null ? raisedAmount.hashCode() : 0);
        result = 31 * result + (raisedCurrencyCode != null ? raisedCurrencyCode.hashCode() : 0);
        result = 31 * result + (publicAt != null ? publicAt.hashCode() : 0);
        result = 31 * result + (stockSymbol != null ? stockSymbol.hashCode() : 0);
        result = 31 * result + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        result = 31 * result + (sourceDescription != null ? sourceDescription.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
