package cn.net.idear.models;

import com.oembedler.moon.graphql.engine.stereotype.GraphQLObject;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by wangdongwei on 4/12/16.
 */
@GraphQLObject
@Entity
@Table(name = "cb_degrees", schema = "cb_data", catalog = "")
public class CbDegrees {
    private long id;
    private String objectId;
    private String degreeType;
    private String subject;
    private String institution;
    private Date graduatedAt;
    private String createdAt;
    private String updatedAt;

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
    @Column(name = "degree_type")
    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    @Basic
    @Column(name = "subject")
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Basic
    @Column(name = "institution")
    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    @Basic
    @Column(name = "graduated_at")
    public Date getGraduatedAt() {
        return graduatedAt;
    }

    public void setGraduatedAt(Date graduatedAt) {
        this.graduatedAt = graduatedAt;
    }

    @Basic
    @Column(name = "created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Basic
    @Column(name = "updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CbDegrees cbDegrees = (CbDegrees) o;

        if (id != cbDegrees.id) return false;
        if (objectId != null ? !objectId.equals(cbDegrees.objectId) : cbDegrees.objectId != null) return false;
        if (degreeType != null ? !degreeType.equals(cbDegrees.degreeType) : cbDegrees.degreeType != null) return false;
        if (subject != null ? !subject.equals(cbDegrees.subject) : cbDegrees.subject != null) return false;
        if (institution != null ? !institution.equals(cbDegrees.institution) : cbDegrees.institution != null)
            return false;
        if (graduatedAt != null ? !graduatedAt.equals(cbDegrees.graduatedAt) : cbDegrees.graduatedAt != null)
            return false;
        if (createdAt != null ? !createdAt.equals(cbDegrees.createdAt) : cbDegrees.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(cbDegrees.updatedAt) : cbDegrees.updatedAt != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (objectId != null ? objectId.hashCode() : 0);
        result = 31 * result + (degreeType != null ? degreeType.hashCode() : 0);
        result = 31 * result + (subject != null ? subject.hashCode() : 0);
        result = 31 * result + (institution != null ? institution.hashCode() : 0);
        result = 31 * result + (graduatedAt != null ? graduatedAt.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        return result;
    }
}
