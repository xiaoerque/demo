package com.pcwl.demo.demoStu.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 * 
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-09-20 18:04:04
 */
public class ClassinfoDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer classid;
	//
	private String cname;
	//
	private String cpresentation;

	/**
	 * 设置：
	 */
	public void setClassid(Integer classid) {
		this.classid = classid;
	}
	/**
	 * 获取：
	 */
	public Integer getClassid() {
		return classid;
	}
	/**
	 * 设置：
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}
	/**
	 * 获取：
	 */
	public String getCname() {
		return cname;
	}
	/**
	 * 设置：
	 */
	public void setCpresentation(String cpresentation) {
		this.cpresentation = cpresentation;
	}
	/**
	 * 获取：
	 */
	public String getCpresentation() {
		return cpresentation;
	}
}
