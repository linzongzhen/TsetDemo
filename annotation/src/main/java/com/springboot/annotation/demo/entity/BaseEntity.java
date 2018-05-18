package com.springboot.annotation.demo.entity;

import java.io.Serializable;
import java.util.Date;

public abstract class BaseEntity implements Serializable
{

    private static final long serialVersionUID = 1L;

    // primary key
    private java.lang.String id;

    private Date createdDate;
    private Date lastUpdateDate;
    private String createdBy;
    private String lastUpdateBy;
    private String enabledFlag;

    // constructors
    public BaseEntity()
    {
        initialize();
    }

    /**
     * Constructor for primary key
     */
    public BaseEntity(java.lang.String id)
    {
        this.setId(id);
        initialize();
    }

    /**
     * Constructor for required key
     */
    public BaseEntity(java.lang.String id, Date createdDate, Date lastUpdateDate, String createdBy,
                      String lastUpdateBy, String enabledFlag)
    {
        this.setId(id);
        this.setCreatedDate(createdDate);
        this.setLastUpdateDate(lastUpdateDate);
        this.setCreatedBy(createdBy);
        this.setLastUpdateBy(lastUpdateBy);
        this.setEnabledFlag(enabledFlag);
        initialize();
    }

    protected void initialize()
    {

    }

    public java.lang.String getId()
    {
        return id;
    }

    public void setId(java.lang.String id)
    {
        this.id = id;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate)
    {
        this.createdDate = createdDate;
    }

    public Date getLastUpdateDate()
    {
        return lastUpdateDate;
    }

    public void setLastUpdateDate(Date lastUpdateDate)
    {
        this.lastUpdateDate = lastUpdateDate;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public void setCreatedBy(String createdBy)
    {
        this.createdBy = createdBy;
    }

    public String getLastUpdateBy()
    {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(String lastUpdateBy)
    {
        this.lastUpdateBy = lastUpdateBy;
    }

    public String getEnabledFlag()
    {
        return enabledFlag;
    }

    public void setEnabledFlag(String enabledFlag)
    {
        this.enabledFlag = enabledFlag;
    }

}
