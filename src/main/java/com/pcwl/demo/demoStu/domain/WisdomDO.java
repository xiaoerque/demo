package com.pcwl.demo.demoStu.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 
 *
 * @author pengPeng
 * @email xiaoerque@126.com
 * @date 2019-10-11 15:08:20
 */
public class WisdomDO implements Serializable {
    private static final long serialVersionUID = 1L;

            //ID
        private Integer id;
            //名字
        private String name;
            //名言
        private String wisdom;
    
            /**
         * 设置：ID
         */
        public void setId(Integer id) {
            this.id = id;
        }

        /**
         * 获取：ID
         */
        public Integer getId() {
            return id;
        }
            /**
         * 设置：名字
         */
        public void setName(String name) {
            this.name = name;
        }

        /**
         * 获取：名字
         */
        public String getName() {
            return name;
        }
            /**
         * 设置：名言
         */
        public void setWisdom(String wisdom) {
            this.wisdom = wisdom;
        }

        /**
         * 获取：名言
         */
        public String getWisdom() {
            return wisdom;
        }
    }
