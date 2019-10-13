package com.pcwl.demo.demoStu.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 *
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 12:54:16
 */
public class StuinfoDO implements Serializable {
    private static final long serialVersionUID = 1L;

            //
        private Integer sid;
            //
        private String sname;
            //
        private String spwd;
            //
        private String sex;
            //
        private String sbirthday;
            //
        private Integer classid;
    
            /**
         * 设置：
         */
        public void setSid(Integer sid) {
            this.sid = sid;
        }

        /**
         * 获取：
         */
        public Integer getSid() {
            return sid;
        }
            /**
         * 设置：
         */
        public void setSname(String sname) {
            this.sname = sname;
        }

        /**
         * 获取：
         */
        public String getSname() {
            return sname;
        }
            /**
         * 设置：
         */
        public void setSpwd(String spwd) {
            this.spwd = spwd;
        }

        /**
         * 获取：
         */
        public String getSpwd() {
            return spwd;
        }
            /**
         * 设置：
         */
        public void setSex(String sex) {
            this.sex = sex;
        }

        /**
         * 获取：
         */
        public String getSex() {
            return sex;
        }

/**
         * 设置：
         */
        /*public void setSbirthday(Date sbirthday) {
            this.sbirthday = sbirthday;
        }*/

        /**
         * 获取：
         */
    public String getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(String sbirthday) {
        this.sbirthday = sbirthday;
    }
        /*public Date getSbirthday() {
            return sbirthday;
        }*/
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
    }
