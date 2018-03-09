//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.08.09 at 01:52:56 PM BST 
//

package org.orcid.jaxb.model.record_rc4;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.orcid.jaxb.model.common_rc4.Amount;
import org.orcid.jaxb.model.common_rc4.CreatedDate;
import org.orcid.jaxb.model.common_rc4.Filterable;
import org.orcid.jaxb.model.common_rc4.FuzzyDate;
import org.orcid.jaxb.model.common_rc4.LastModifiedDate;
import org.orcid.jaxb.model.common_rc4.Organization;
import org.orcid.jaxb.model.common_rc4.OrganizationDefinedFundingSubType;
import org.orcid.jaxb.model.common_rc4.OrganizationHolder;
import org.orcid.jaxb.model.common_rc4.Source;
import org.orcid.jaxb.model.common_rc4.Url;
import org.orcid.jaxb.model.common_rc4.Visibility;

import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * Java class for anonymous complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { "createdDate", "lastModifiedDate", "source", "putCode", "path", "type", "organizationDefinedType", "title", "description", "amount", "url",
        "startDate", "endDate", "externalIdentifiers", "contributors", "organization" })
@XmlRootElement(name = "funding", namespace = "http://www.orcid.org/ns/funding")
public class Funding implements Filterable, Activity, Serializable, OrganizationHolder, SourceAware {

    private final static long serialVersionUID = 1L;

    @XmlElement(namespace = "http://www.orcid.org/ns/funding", required = true)
    protected FundingType type;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding", name = "organization-defined-type")
    protected OrganizationDefinedFundingSubType organizationDefinedType;
    @XmlElement(required = true, namespace = "http://www.orcid.org/ns/funding")
    protected FundingTitle title;
    @XmlElement(required = true, namespace = "http://www.orcid.org/ns/funding")
    protected Organization organization;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding", name = "short-description")
    protected String description;
    @XmlElement(name = "amount", namespace = "http://www.orcid.org/ns/funding")
    protected Amount amount;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding")
    protected Url url;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "start-date")
    protected FuzzyDate startDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "end-date")
    protected FuzzyDate endDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "external-ids")
    protected ExternalIDs externalIdentifiers;
    @XmlElement(namespace = "http://www.orcid.org/ns/funding")
    protected FundingContributors contributors;
    @XmlElement(namespace = "http://www.orcid.org/ns/common")
    protected Source source;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "last-modified-date")
    protected LastModifiedDate lastModifiedDate;
    @XmlElement(namespace = "http://www.orcid.org/ns/common", name = "created-date")
    protected CreatedDate createdDate;

    @XmlAttribute(name = "put-code")
    @ApiModelProperty(hidden = true) 
    protected Long putCode;
    @XmlAttribute(name = "path")
    protected String path;
    @XmlAttribute
    protected Visibility visibility;

    public FundingTitle getTitle() {
        return title;
    }

    public void setTitle(FundingTitle title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FundingType getType() {
        return type;
    }

    public void setType(FundingType type) {
        this.type = type;
    }

    public OrganizationDefinedFundingSubType getOrganizationDefinedType() {
        return organizationDefinedType;
    }

    public void setOrganizationDefinedType(OrganizationDefinedFundingSubType organizationDefinedFundingType) {
        this.organizationDefinedType = organizationDefinedFundingType;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public Url getUrl() {
        return url;
    }

    public void setUrl(Url url) {
        this.url = url;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Source getSource() {
        return source;
    }

    @Override
    public String retrieveSourcePath() {
        if (source == null) {
            return null;
        }
        return source.retrieveSourcePath();
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Visibility getVisibility() {
        return visibility;
    }

    public void setVisibility(Visibility visibility) {
        this.visibility = visibility;
    }

    @Override
    public Long getPutCode() {
        return putCode;
    }

    public void setPutCode(Long putCode) {
        this.putCode = putCode;
    }

    public ExternalIDs getExternalIdentifiers() {
        return externalIdentifiers;
    }

    public void setExternalIdentifiers(ExternalIDs externalIdentifiers) {
        this.externalIdentifiers = externalIdentifiers;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return possible object is {@link Object }
     * 
     */
    public String getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param path
     *            allowed object is {@link Object }
     * 
     */
    public void setPath(String path) {
        this.path = path;
    }

    public FundingContributors getContributors() {
        return contributors;
    }

    public void setContributors(FundingContributors fundingContributors) {
        this.contributors = fundingContributors;
    }

    /**
     * Gets the value of the startDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getStartDate() {
        return startDate;
    }

    /**
     * Sets the value of the startDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setStartDate(FuzzyDate value) {
        this.startDate = value;
    }

    /**
     * Gets the value of the endDate property.
     * 
     * @return possible object is {@link FuzzyDate }
     * 
     */
    public FuzzyDate getEndDate() {
        return endDate;
    }

    /**
     * Sets the value of the endDate property.
     * 
     * @param value
     *            allowed object is {@link FuzzyDate }
     * 
     */
    public void setEndDate(FuzzyDate value) {
        this.endDate = value;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((title == null) ? 0 : title.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        result = prime * result + ((type == null) ? 0 : type.hashCode());
        result = prime * result + ((organizationDefinedType == null) ? 0 : organizationDefinedType.hashCode());
        result = prime * result + ((amount == null) ? 0 : amount.hashCode());
        result = prime * result + ((url == null) ? 0 : url.hashCode());
        result = prime * result + ((organization == null) ? 0 : organization.hashCode());
        result = prime * result + ((visibility == null) ? 0 : visibility.hashCode());
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        result = prime * result + ((externalIdentifiers == null) ? 0 : externalIdentifiers.hashCode());
        result = prime * result + ((contributors == null) ? 0 : contributors.hashCode());
        result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
        result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
        return result;
    }

    @Override
    public CreatedDate getCreatedDate() {
        return createdDate;
    }

    @Override
    public void setCreatedDate(CreatedDate value) {
        createdDate = value;
    }

    @Override
    public LastModifiedDate getLastModifiedDate() {
        return lastModifiedDate;
    }

    @Override
    public void setLastModifiedDate(LastModifiedDate value) {
        lastModifiedDate = value;
    }

    /**
     * 
     * Note that put-code is not part of hashCode or equals! This is to allow
     * better de-duplication.
     * 
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funding other = (Funding) obj;
        if (title == null) {
            if (other.title != null)
                return false;
        } else {
            if (!title.equals(other.title))
                return false;
        }
        if (description == null) {
            if (other.description != null)
                return false;
        } else {
            if (!description.equals(other.description))
                return false;
        }
        if (organization == null) {
            if (other.organization != null)
                return false;
        } else {
            if (!organization.equals(other.organization))
                return false;
        }
        if (externalIdentifiers == null) {
            if (other.externalIdentifiers != null)
                return false;
        } else {
            if (!externalIdentifiers.equals(other.externalIdentifiers))
                return false;
        }
        if (contributors == null) {
            if (other.contributors != null)
                return false;
        } else {
            if (!contributors.equals(other.contributors))
                return false;
        }
        if (type == null) {
            if (other.type != null)
                return false;
        } else {
            if (!type.equals(other.type))
                return false;
        }

        if (organizationDefinedType == null) {
            if (other.organizationDefinedType != null)
                return false;
        } else {
            if (!organizationDefinedType.equals(other.organizationDefinedType))
                return false;
        }
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else {
            if (!amount.equals(other.amount))
                return false;
        }
        if (url == null) {
            if (other.url != null)
                return false;
        } else {
            if (!url.equals(other.url))
                return false;
        }
        if (startDate == null) {
            if (other.startDate != null)
                return false;
        } else if (!startDate.equals(other.startDate))
            return false;
        if (endDate == null) {
            if (other.endDate != null)
                return false;
        } else if (!endDate.equals(other.endDate))
            return false;

        /*
         * Breaks our deduping if (lastModifiedDate != other.lastModifiedDate)
         * return false; if (createdDate != other.createdDate) return false;
         */

        return true;
    }

    /**
     * Indicates if two funding are ORCID duplicated. Two fundings will be
     * duplicated if they have the same type, title, organization, description
     * and amount
     * 
     * @return true if the two fundings are duplicated according to ORCID
     *         requirements
     * */
    public boolean isDuplicated(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Funding other = (Funding) obj;

        if (type == null) {
            if (other.type != null)
                return false;
        } else {
            if (!type.equals(other.type))
                return false;
        }

        if (organizationDefinedType == null) {
            if (other.organizationDefinedType != null)
                return false;
        } else {
            if (!organizationDefinedType.equals(other.organizationDefinedType))
                return false;
        }

        if (title == null) {
            if (other.title != null)
                return false;
        } else {
            if (!title.equals(other.title))
                return false;
        }

        if (organization == null) {
            if (other.organization != null)
                return false;
        } else {
            if (!organization.equals(other.organization))
                return false;
        }
        if (amount == null) {
            if (other.amount != null)
                return false;
        } else {
            if (!amount.equals(other.amount))
                return false;
        }
        if (description == null) {
            if (other.description != null)
                return false;
        } else {
            if (!description.equals(other.description))
                return false;
        }
        return true;
    }
}
