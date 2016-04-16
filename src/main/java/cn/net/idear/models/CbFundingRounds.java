package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@GraphQLObject
@Entity
@Table(name = "cb_funding_rounds", schema = "cb_data", catalog = "")
public class CbFundingRounds {
    private long id;
    private long fundingRoundId;
    private String objectId;
    private Date fundedAt;
    private String fundingRoundType;
    private String fundingRoundCode;
    private Long raisedAmountUsd;
    private Integer raisedAmount;
    private String raisedCurrencyCode;
    private Long preMoneyValuationUsd;
    private Long preMoneyValuation;
    private String preMoneyCurrencyCode;
    private Long postMoneyValuationUsd;
    private Long postMoneyValuation;
    private String postMoneyCurrencyCode;
    private Integer participants;
    private Integer isFirstRound;
    private Integer isLastRound;
    private String sourceUrl;
    private String sourceDescription;
    private String createdBy;
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
    @Column(name = "object_id")
    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
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
    @Column(name = "funding_round_type")
    public String getFundingRoundType() {
        return fundingRoundType;
    }

    public void setFundingRoundType(String fundingRoundType) {
        this.fundingRoundType = fundingRoundType;
    }

    @Basic
    @Column(name = "funding_round_code")
    public String getFundingRoundCode() {
        return fundingRoundCode;
    }

    public void setFundingRoundCode(String fundingRoundCode) {
        this.fundingRoundCode = fundingRoundCode;
    }

    @Basic
    @Column(name = "raised_amount_usd")
    public Long getRaisedAmountUsd() {
        return raisedAmountUsd;
    }

    public void setRaisedAmountUsd(Long raisedAmountUsd) {
        this.raisedAmountUsd = raisedAmountUsd;
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
    @Column(name = "pre_money_valuation_usd")
    public Long getPreMoneyValuationUsd() {
        return preMoneyValuationUsd;
    }

    public void setPreMoneyValuationUsd(Long preMoneyValuationUsd) {
        this.preMoneyValuationUsd = preMoneyValuationUsd;
    }

    @Basic
    @Column(name = "pre_money_valuation")
    public Long getPreMoneyValuation() {
        return preMoneyValuation;
    }

    public void setPreMoneyValuation(Long preMoneyValuation) {
        this.preMoneyValuation = preMoneyValuation;
    }

    @Basic
    @Column(name = "pre_money_currency_code")
    public String getPreMoneyCurrencyCode() {
        return preMoneyCurrencyCode;
    }

    public void setPreMoneyCurrencyCode(String preMoneyCurrencyCode) {
        this.preMoneyCurrencyCode = preMoneyCurrencyCode;
    }

    @Basic
    @Column(name = "post_money_valuation_usd")
    public Long getPostMoneyValuationUsd() {
        return postMoneyValuationUsd;
    }

    public void setPostMoneyValuationUsd(Long postMoneyValuationUsd) {
        this.postMoneyValuationUsd = postMoneyValuationUsd;
    }

    @Basic
    @Column(name = "post_money_valuation")
    public Long getPostMoneyValuation() {
        return postMoneyValuation;
    }

    public void setPostMoneyValuation(Long postMoneyValuation) {
        this.postMoneyValuation = postMoneyValuation;
    }

    @Basic
    @Column(name = "post_money_currency_code")
    public String getPostMoneyCurrencyCode() {
        return postMoneyCurrencyCode;
    }

    public void setPostMoneyCurrencyCode(String postMoneyCurrencyCode) {
        this.postMoneyCurrencyCode = postMoneyCurrencyCode;
    }

    @Basic
    @Column(name = "participants")
    public Integer getParticipants() {
        return participants;
    }

    public void setParticipants(Integer participants) {
        this.participants = participants;
    }

    @Basic
    @Column(name = "is_first_round")
    public Integer getIsFirstRound() {
        return isFirstRound;
    }

    public void setIsFirstRound(Integer isFirstRound) {
        this.isFirstRound = isFirstRound;
    }

    @Basic
    @Column(name = "is_last_round")
    public Integer getIsLastRound() {
        return isLastRound;
    }

    public void setIsLastRound(Integer isLastRound) {
        this.isLastRound = isLastRound;
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
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
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

        CbFundingRounds that = (CbFundingRounds) o;

        if (id != that.id) return false;
        if (fundingRoundId != that.fundingRoundId) return false;
        if (objectId != null ? !objectId.equals(that.objectId) : that.objectId != null) return false;
        if (fundedAt != null ? !fundedAt.equals(that.fundedAt) : that.fundedAt != null) return false;
        if (fundingRoundType != null ? !fundingRoundType.equals(that.fundingRoundType) : that.fundingRoundType != null)
            return false;
        if (fundingRoundCode != null ? !fundingRoundCode.equals(that.fundingRoundCode) : that.fundingRoundCode != null)
            return false;
        if (raisedAmountUsd != null ? !raisedAmountUsd.equals(that.raisedAmountUsd) : that.raisedAmountUsd != null)
            return false;
        if (raisedAmount != null ? !raisedAmount.equals(that.raisedAmount) : that.raisedAmount != null) return false;
        if (raisedCurrencyCode != null ? !raisedCurrencyCode.equals(that.raisedCurrencyCode) : that.raisedCurrencyCode != null)
            return false;
        if (preMoneyValuationUsd != null ? !preMoneyValuationUsd.equals(that.preMoneyValuationUsd) : that.preMoneyValuationUsd != null)
            return false;
        if (preMoneyValuation != null ? !preMoneyValuation.equals(that.preMoneyValuation) : that.preMoneyValuation != null)
            return false;
        if (preMoneyCurrencyCode != null ? !preMoneyCurrencyCode.equals(that.preMoneyCurrencyCode) : that.preMoneyCurrencyCode != null)
            return false;
        if (postMoneyValuationUsd != null ? !postMoneyValuationUsd.equals(that.postMoneyValuationUsd) : that.postMoneyValuationUsd != null)
            return false;
        if (postMoneyValuation != null ? !postMoneyValuation.equals(that.postMoneyValuation) : that.postMoneyValuation != null)
            return false;
        if (postMoneyCurrencyCode != null ? !postMoneyCurrencyCode.equals(that.postMoneyCurrencyCode) : that.postMoneyCurrencyCode != null)
            return false;
        if (participants != null ? !participants.equals(that.participants) : that.participants != null) return false;
        if (isFirstRound != null ? !isFirstRound.equals(that.isFirstRound) : that.isFirstRound != null) return false;
        if (isLastRound != null ? !isLastRound.equals(that.isLastRound) : that.isLastRound != null) return false;
        if (sourceUrl != null ? !sourceUrl.equals(that.sourceUrl) : that.sourceUrl != null) return false;
        if (sourceDescription != null ? !sourceDescription.equals(that.sourceDescription) : that.sourceDescription != null)
            return false;
        if (createdBy != null ? !createdBy.equals(that.createdBy) : that.createdBy != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (fundingRoundId ^ (fundingRoundId >>> 32));
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (fundedAt != null ? fundedAt.hashCode() : 0);
        result = 31 * result + (fundingRoundType != null ? fundingRoundType.hashCode() : 0);
        result = 31 * result + (fundingRoundCode != null ? fundingRoundCode.hashCode() : 0);
        result = 31 * result + (raisedAmountUsd != null ? raisedAmountUsd.hashCode() : 0);
        result = 31 * result + (raisedAmount != null ? raisedAmount.hashCode() : 0);
        result = 31 * result + (raisedCurrencyCode != null ? raisedCurrencyCode.hashCode() : 0);
        result = 31 * result + (preMoneyValuationUsd != null ? preMoneyValuationUsd.hashCode() : 0);
        result = 31 * result + (preMoneyValuation != null ? preMoneyValuation.hashCode() : 0);
        result = 31 * result + (preMoneyCurrencyCode != null ? preMoneyCurrencyCode.hashCode() : 0);
        result = 31 * result + (postMoneyValuationUsd != null ? postMoneyValuationUsd.hashCode() : 0);
        result = 31 * result + (postMoneyValuation != null ? postMoneyValuation.hashCode() : 0);
        result = 31 * result + (postMoneyCurrencyCode != null ? postMoneyCurrencyCode.hashCode() : 0);
        result = 31 * result + (participants != null ? participants.hashCode() : 0);
        result = 31 * result + (isFirstRound != null ? isFirstRound.hashCode() : 0);
        result = 31 * result + (isLastRound != null ? isLastRound.hashCode() : 0);
        result = 31 * result + (sourceUrl != null ? sourceUrl.hashCode() : 0);
        result = 31 * result + (sourceDescription != null ? sourceDescription.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
