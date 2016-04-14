package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@GraphQLObject
@Entity
@Table(name = "cb_investments", schema = "cb_data", catalog = "")
public class CbInvestments {
    private long id;
    private long fundingRoundId;
    private String fundedObjectId;
    private String investorObjectId;
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
    @Column(name = "funding_round_id")
    public long getFundingRoundId() {
        return fundingRoundId;
    }

    public void setFundingRoundId(long fundingRoundId) {
        this.fundingRoundId = fundingRoundId;
    }

    @Basic
    @Column(name = "funded_object_id")
    public String getFundedObjectId() {
        return fundedObjectId;
    }

    public void setFundedObjectId(String fundedObjectId) {
        this.fundedObjectId = fundedObjectId;
    }

    @Basic
    @Column(name = "investor_object_id")
    public String getInvestorObjectId() {
        return investorObjectId;
    }

    public void setInvestorObjectId(String investorObjectId) {
        this.investorObjectId = investorObjectId;
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

        CbInvestments that = (CbInvestments) o;

        if (id != that.id) return false;
        if (fundingRoundId != that.fundingRoundId) return false;
        if (fundedObjectId != null ? !fundedObjectId.equals(that.fundedObjectId) : that.fundedObjectId != null)
            return false;
        if (investorObjectId != null ? !investorObjectId.equals(that.investorObjectId) : that.investorObjectId != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (fundingRoundId ^ (fundingRoundId >>> 32));
        result = 31 * result + (fundedObjectId != null ? fundedObjectId.hashCode() : 0);
        result = 31 * result + (investorObjectId != null ? investorObjectId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
