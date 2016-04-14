package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@GraphQLObject
@Entity
@Table(name = "cb_objects", schema = "cb_data", catalog = "")
public class CbObjects {
    private String id;
    private String entityType;
    private long entityId;
    private String parentId;
    private String name;
    private String normalizedName;
    private String permalink;
    private String categoryCode;
    private String status;
    private Date foundedAt;
    private Date closedAt;
    private String domain;
    private String homepageUrl;
    private String twitterUsername;
    private String logoUrl;
    private Integer logoWidth;
    private Integer logoHeight;
    private String shortDescription;
    private String description;
    private String overview;
    private String tagList;
    private String countryCode;
    private String stateCode;
    private String city;
    private String region;
    private Date firstInvestmentAt;
    private Date lastInvestmentAt;
    private Integer investmentRounds;
    private Integer investedCompanies;
    private Date firstFundingAt;
    private Date lastFundingAt;
    private Integer fundingRounds;
    private Integer fundingTotalUsd;
    private Date firstMilestoneAt;
    private Date lastMilestoneAt;
    private Integer milestones;
    private Integer relationships;
    private String createdBy;
    private Date createdAt;
    private Date updatedAt;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "entity_type")
    public String getEntityType() {
        return entityType;
    }

    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    @Basic
    @Column(name = "entity_id")
    public long getEntityId() {
        return entityId;
    }

    public void setEntityId(long entityId) {
        this.entityId = entityId;
    }

    @Basic
    @Column(name = "parent_id")
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
    @Column(name = "normalized_name")
    public String getNormalizedName() {
        return normalizedName;
    }

    public void setNormalizedName(String normalizedName) {
        this.normalizedName = normalizedName;
    }

    @Basic
    @Column(name = "permalink")
    public String getPermalink() {
        return permalink;
    }

    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    @Basic
    @Column(name = "category_code")
    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "founded_at")
    public Date getFoundedAt() {
        return foundedAt;
    }

    public void setFoundedAt(Date foundedAt) {
        this.foundedAt = foundedAt;
    }

    @Basic
    @Column(name = "closed_at")
    public Date getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(Date closedAt) {
        this.closedAt = closedAt;
    }

    @Basic
    @Column(name = "domain")
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    @Basic
    @Column(name = "homepage_url")
    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    @Basic
    @Column(name = "twitter_username")
    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    @Basic
    @Column(name = "logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    @Basic
    @Column(name = "logo_width")
    public Integer getLogoWidth() {
        return logoWidth;
    }

    public void setLogoWidth(Integer logoWidth) {
        this.logoWidth = logoWidth;
    }

    @Basic
    @Column(name = "logo_height")
    public Integer getLogoHeight() {
        return logoHeight;
    }

    public void setLogoHeight(Integer logoHeight) {
        this.logoHeight = logoHeight;
    }

    @Basic
    @Column(name = "short_description")
    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
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
    @Column(name = "overview")
    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    @Basic
    @Column(name = "tag_list")
    public String getTagList() {
        return tagList;
    }

    public void setTagList(String tagList) {
        this.tagList = tagList;
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
    @Column(name = "state_code")
    public String getStateCode() {
        return stateCode;
    }

    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
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
    @Column(name = "region")
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "first_investment_at")
    public Date getFirstInvestmentAt() {
        return firstInvestmentAt;
    }

    public void setFirstInvestmentAt(Date firstInvestmentAt) {
        this.firstInvestmentAt = firstInvestmentAt;
    }

    @Basic
    @Column(name = "last_investment_at")
    public Date getLastInvestmentAt() {
        return lastInvestmentAt;
    }

    public void setLastInvestmentAt(Date lastInvestmentAt) {
        this.lastInvestmentAt = lastInvestmentAt;
    }

    @Basic
    @Column(name = "investment_rounds")
    public Integer getInvestmentRounds() {
        return investmentRounds;
    }

    public void setInvestmentRounds(Integer investmentRounds) {
        this.investmentRounds = investmentRounds;
    }

    @Basic
    @Column(name = "invested_companies")
    public Integer getInvestedCompanies() {
        return investedCompanies;
    }

    public void setInvestedCompanies(Integer investedCompanies) {
        this.investedCompanies = investedCompanies;
    }

    @Basic
    @Column(name = "first_funding_at")
    public Date getFirstFundingAt() {
        return firstFundingAt;
    }

    public void setFirstFundingAt(Date firstFundingAt) {
        this.firstFundingAt = firstFundingAt;
    }

    @Basic
    @Column(name = "last_funding_at")
    public Date getLastFundingAt() {
        return lastFundingAt;
    }

    public void setLastFundingAt(Date lastFundingAt) {
        this.lastFundingAt = lastFundingAt;
    }

    @Basic
    @Column(name = "funding_rounds")
    public Integer getFundingRounds() {
        return fundingRounds;
    }

    public void setFundingRounds(Integer fundingRounds) {
        this.fundingRounds = fundingRounds;
    }

    @Basic
    @Column(name = "funding_total_usd")
    public Integer getFundingTotalUsd() {
        return fundingTotalUsd;
    }

    public void setFundingTotalUsd(Integer fundingTotalUsd) {
        this.fundingTotalUsd = fundingTotalUsd;
    }

    @Basic
    @Column(name = "first_milestone_at")
    public Date getFirstMilestoneAt() {
        return firstMilestoneAt;
    }

    public void setFirstMilestoneAt(Date firstMilestoneAt) {
        this.firstMilestoneAt = firstMilestoneAt;
    }

    @Basic
    @Column(name = "last_milestone_at")
    public Date getLastMilestoneAt() {
        return lastMilestoneAt;
    }

    public void setLastMilestoneAt(Date lastMilestoneAt) {
        this.lastMilestoneAt = lastMilestoneAt;
    }

    @Basic
    @Column(name = "milestones")
    public Integer getMilestones() {
        return milestones;
    }

    public void setMilestones(Integer milestones) {
        this.milestones = milestones;
    }

    @Basic
    @Column(name = "relationships")
    public Integer getRelationships() {
        return relationships;
    }

    public void setRelationships(Integer relationships) {
        this.relationships = relationships;
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

        CbObjects cbObjects = (CbObjects) o;

        if (entityId != cbObjects.entityId) return false;
        if (id != null ? !id.equals(cbObjects.id) : cbObjects.id != null) return false;
        if (entityType != null ? !entityType.equals(cbObjects.entityType) : cbObjects.entityType != null) return false;
        if (parentId != null ? !parentId.equals(cbObjects.parentId) : cbObjects.parentId != null) return false;
        if (name != null ? !name.equals(cbObjects.name) : cbObjects.name != null) return false;
        if (normalizedName != null ? !normalizedName.equals(cbObjects.normalizedName) : cbObjects.normalizedName != null)
            return false;
        if (permalink != null ? !permalink.equals(cbObjects.permalink) : cbObjects.permalink != null) return false;
        if (categoryCode != null ? !categoryCode.equals(cbObjects.categoryCode) : cbObjects.categoryCode != null)
            return false;
        if (status != null ? !status.equals(cbObjects.status) : cbObjects.status != null) return false;
        if (foundedAt != null ? !foundedAt.equals(cbObjects.foundedAt) : cbObjects.foundedAt != null) return false;
        if (closedAt != null ? !closedAt.equals(cbObjects.closedAt) : cbObjects.closedAt != null) return false;
        if (domain != null ? !domain.equals(cbObjects.domain) : cbObjects.domain != null) return false;
        if (homepageUrl != null ? !homepageUrl.equals(cbObjects.homepageUrl) : cbObjects.homepageUrl != null)
            return false;
        if (twitterUsername != null ? !twitterUsername.equals(cbObjects.twitterUsername) : cbObjects.twitterUsername != null)
            return false;
        if (logoUrl != null ? !logoUrl.equals(cbObjects.logoUrl) : cbObjects.logoUrl != null) return false;
        if (logoWidth != null ? !logoWidth.equals(cbObjects.logoWidth) : cbObjects.logoWidth != null) return false;
        if (logoHeight != null ? !logoHeight.equals(cbObjects.logoHeight) : cbObjects.logoHeight != null) return false;
        if (shortDescription != null ? !shortDescription.equals(cbObjects.shortDescription) : cbObjects.shortDescription != null)
            return false;
        if (description != null ? !description.equals(cbObjects.description) : cbObjects.description != null)
            return false;
        if (overview != null ? !overview.equals(cbObjects.overview) : cbObjects.overview != null) return false;
        if (tagList != null ? !tagList.equals(cbObjects.tagList) : cbObjects.tagList != null) return false;
        if (countryCode != null ? !countryCode.equals(cbObjects.countryCode) : cbObjects.countryCode != null)
            return false;
        if (stateCode != null ? !stateCode.equals(cbObjects.stateCode) : cbObjects.stateCode != null) return false;
        if (city != null ? !city.equals(cbObjects.city) : cbObjects.city != null) return false;
        if (region != null ? !region.equals(cbObjects.region) : cbObjects.region != null) return false;
        if (firstInvestmentAt != null ? !firstInvestmentAt.equals(cbObjects.firstInvestmentAt) : cbObjects.firstInvestmentAt != null)
            return false;
        if (lastInvestmentAt != null ? !lastInvestmentAt.equals(cbObjects.lastInvestmentAt) : cbObjects.lastInvestmentAt != null)
            return false;
        if (investmentRounds != null ? !investmentRounds.equals(cbObjects.investmentRounds) : cbObjects.investmentRounds != null)
            return false;
        if (investedCompanies != null ? !investedCompanies.equals(cbObjects.investedCompanies) : cbObjects.investedCompanies != null)
            return false;
        if (firstFundingAt != null ? !firstFundingAt.equals(cbObjects.firstFundingAt) : cbObjects.firstFundingAt != null)
            return false;
        if (lastFundingAt != null ? !lastFundingAt.equals(cbObjects.lastFundingAt) : cbObjects.lastFundingAt != null)
            return false;
        if (fundingRounds != null ? !fundingRounds.equals(cbObjects.fundingRounds) : cbObjects.fundingRounds != null)
            return false;
        if (fundingTotalUsd != null ? !fundingTotalUsd.equals(cbObjects.fundingTotalUsd) : cbObjects.fundingTotalUsd != null)
            return false;
        if (firstMilestoneAt != null ? !firstMilestoneAt.equals(cbObjects.firstMilestoneAt) : cbObjects.firstMilestoneAt != null)
            return false;
        if (lastMilestoneAt != null ? !lastMilestoneAt.equals(cbObjects.lastMilestoneAt) : cbObjects.lastMilestoneAt != null)
            return false;
        if (milestones != null ? !milestones.equals(cbObjects.milestones) : cbObjects.milestones != null) return false;
        if (relationships != null ? !relationships.equals(cbObjects.relationships) : cbObjects.relationships != null)
            return false;
        if (createdBy != null ? !createdBy.equals(cbObjects.createdBy) : cbObjects.createdBy != null) return false;
        if (createdAt != null ? !createdAt.equals(cbObjects.createdAt) : cbObjects.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cbObjects.updatedAt) : cbObjects.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (entityType != null ? entityType.hashCode() : 0);
        result = 31 * result + (int) (entityId ^ (entityId >>> 32));
        result = 31 * result + (parentId != null ? parentId.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (normalizedName != null ? normalizedName.hashCode() : 0);
        result = 31 * result + (permalink != null ? permalink.hashCode() : 0);
        result = 31 * result + (categoryCode != null ? categoryCode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (foundedAt != null ? foundedAt.hashCode() : 0);
        result = 31 * result + (closedAt != null ? closedAt.hashCode() : 0);
        result = 31 * result + (domain != null ? domain.hashCode() : 0);
        result = 31 * result + (homepageUrl != null ? homepageUrl.hashCode() : 0);
        result = 31 * result + (twitterUsername != null ? twitterUsername.hashCode() : 0);
        result = 31 * result + (logoUrl != null ? logoUrl.hashCode() : 0);
        result = 31 * result + (logoWidth != null ? logoWidth.hashCode() : 0);
        result = 31 * result + (logoHeight != null ? logoHeight.hashCode() : 0);
        result = 31 * result + (shortDescription != null ? shortDescription.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (overview != null ? overview.hashCode() : 0);
        result = 31 * result + (tagList != null ? tagList.hashCode() : 0);
        result = 31 * result + (countryCode != null ? countryCode.hashCode() : 0);
        result = 31 * result + (stateCode != null ? stateCode.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (firstInvestmentAt != null ? firstInvestmentAt.hashCode() : 0);
        result = 31 * result + (lastInvestmentAt != null ? lastInvestmentAt.hashCode() : 0);
        result = 31 * result + (investmentRounds != null ? investmentRounds.hashCode() : 0);
        result = 31 * result + (investedCompanies != null ? investedCompanies.hashCode() : 0);
        result = 31 * result + (firstFundingAt != null ? firstFundingAt.hashCode() : 0);
        result = 31 * result + (lastFundingAt != null ? lastFundingAt.hashCode() : 0);
        result = 31 * result + (fundingRounds != null ? fundingRounds.hashCode() : 0);
        result = 31 * result + (fundingTotalUsd != null ? fundingTotalUsd.hashCode() : 0);
        result = 31 * result + (firstMilestoneAt != null ? firstMilestoneAt.hashCode() : 0);
        result = 31 * result + (lastMilestoneAt != null ? lastMilestoneAt.hashCode() : 0);
        result = 31 * result + (milestones != null ? milestones.hashCode() : 0);
        result = 31 * result + (relationships != null ? relationships.hashCode() : 0);
        result = 31 * result + (createdBy != null ? createdBy.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
