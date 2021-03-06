package com.baishop.entity.ass;

import java.io.Serializable;

public class Modules implements Serializable {
	
	private static final long serialVersionUID = 4101396557949370770L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.moduleId
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private Integer moduleId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.modulePid
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private Integer modulePid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.text
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private String text;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.url
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private String url;
    
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.type
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private String type;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.iconCls
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private String iconCls;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_modules.expanded
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    private Byte expanded;
    
    private Integer sort;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_modules.moduleId
     *
     * @return the value of bai_modules.moduleId
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public Integer getModuleId() {
        return moduleId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_modules.moduleId
     *
     * @param moduleId the value for bai_modules.moduleId
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_modules.modulePid
     *
     * @return the value of bai_modules.modulePid
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public Integer getModulePid() {
        return modulePid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_modules.modulePid
     *
     * @param modulePid the value for bai_modules.modulePid
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public void setModulePid(Integer modulePid) {
        this.modulePid = modulePid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_modules.text
     *
     * @return the value of bai_modules.text
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public String getText() {
        return text;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_modules.text
     *
     * @param text the value for bai_modules.text
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_modules.url
     *
     * @return the value of bai_modules.url
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public String getUrl() {
        return url;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_modules.url
     *
     * @param url the value for bai_modules.url
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_modules.iconCls
     *
     * @return the value of bai_modules.iconCls
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public String getIconCls() {
        return iconCls;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_modules.iconCls
     *
     * @param iconCls the value for bai_modules.iconCls
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public void setIconCls(String iconCls) {
        this.iconCls = iconCls;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_modules.expanded
     *
     * @return the value of bai_modules.expanded
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public Byte getExpanded() {
        return expanded;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_modules.expanded
     *
     * @param expanded the value for bai_modules.expanded
     *
     * @ibatorgenerated Fri Oct 28 15:06:09 CST 2011
     */
    public void setExpanded(Byte expanded) {
        this.expanded = expanded;
    }

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}
}