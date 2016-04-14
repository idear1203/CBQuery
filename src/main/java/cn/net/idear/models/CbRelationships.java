package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@GraphQLObject
@Entity
@Table(name = "cb_relationships", schema = "cb_data", catalog = "")
public class CbRelationships {
    private long id;
    private long relationshipId;
    private String personObjectId;
    private String relationshipObjectId;
    private Date startAt;
    private Date endAt;
    private Byte isPast;
    private Integer sequence;
    private String title;
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
    @Column(name = "relationship_id")
    public long getRelationshipId() {
        return relationshipId;
    }

    public void setRelationshipId(long relationshipId) {
        this.relationshipId = relationshipId;
    }

    @Basic
    @Column(name = "person_object_id")
    public String getPersonObjectId() {
        return personObjectId;
    }

    public void setPersonObjectId(String personObjectId) {
        this.personObjectId = personObjectId;
    }

    @Basic
    @Column(name = "relationship_object_id")
    public String getRelationshipObjectId() {
        return relationshipObjectId;
    }

    public void setRelationshipObjectId(String relationshipObjectId) {
        this.relationshipObjectId = relationshipObjectId;
    }

    @Basic
    @Column(name = "start_at")
    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    @Basic
    @Column(name = "end_at")
    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    @Basic
    @Column(name = "is_past")
    public Byte getIsPast() {
        return isPast;
    }

    public void setIsPast(Byte isPast) {
        this.isPast = isPast;
    }

    @Basic
    @Column(name = "sequence")
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

        CbRelationships that = (CbRelationships) o;

        if (id != that.id) return false;
        if (relationshipId != that.relationshipId) return false;
        if (personObjectId != null ? !personObjectId.equals(that.personObjectId) : that.personObjectId != null)
            return false;
        if (relationshipObjectId != null ? !relationshipObjectId.equals(that.relationshipObjectId) : that.relationshipObjectId != null)
            return false;
        if (startAt != null ? !startAt.equals(that.startAt) : that.startAt != null) return false;
        if (endAt != null ? !endAt.equals(that.endAt) : that.endAt != null) return false;
        if (isPast != null ? !isPast.equals(that.isPast) : that.isPast != null) return false;
        if (sequence != null ? !sequence.equals(that.sequence) : that.sequence != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (relationshipId ^ (relationshipId >>> 32));
        result = 31 * result + (personObjectId != null ? personObjectId.hashCode() : 0);
        result = 31 * result + (relationshipObjectId != null ? relationshipObjectId.hashCode() : 0);
        result = 31 * result + (startAt != null ? startAt.hashCode() : 0);
        result = 31 * result + (endAt != null ? endAt.hashCode() : 0);
        result = 31 * result + (isPast != null ? isPast.hashCode() : 0);
        result = 31 * result + (sequence != null ? sequence.hashCode() : 0);
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
