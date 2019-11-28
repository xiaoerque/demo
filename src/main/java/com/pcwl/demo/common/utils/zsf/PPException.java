package com.pcwl.demo.common.utils.zsf;


import org.apache.commons.lang3.StringUtils;

public class PPException extends RuntimeException{
    public static final String EXCEPTION_CODE_PRE = "E_";                 //如果是E_开头的，则会找国际化文件转换
    private String[] args;
    private Object data;
    private String formatedMessage;

    public PPException() {
        super();
    }
    public PPException(String messageOrCode) {
        super(messageOrCode);
    }
    public PPException(String messageOrCode,String arg) {
        super(messageOrCode);
        this.args = (null == arg ? null : new String[]{arg});
    }
    public PPException(String messageOrCode,String[] args) {
        super(messageOrCode);
        this.args = args;
    }
    public PPException(Throwable cause) {
        super(cause);
    }
    public PPException(String messageOrCode, Throwable cause)  {
        super(messageOrCode, cause);
    }
    public PPException(String messageOrCode, String arg, Throwable cause) {
        super(messageOrCode, cause);
        this.args = (null == arg ? null : new String[]{arg});
    }
    public PPException(String messageOrCode, String[] args, Throwable cause) {
        super(messageOrCode, cause);
        this.args = args;
    }
    /**
     * 得到展示的消息（如果在message文件中找到对应的key，则展示对应文本）
     * @return
     */
    @Override
    public String getMessage() {
        return this.formatMessage();
    }

    @Override
    public String getLocalizedMessage() {
        return this.formatMessage();
    }
    /**
     * 得到原始消息
     * @return
     */
    public String getOrgMessage() {
        return super.getMessage();
    }

    private String formatMessage() {
        if (this.formatedMessage == null) {
            String orgMessage = this.getOrgMessage();
            if (StringUtils.indexOf(orgMessage, EXCEPTION_CODE_PRE) == 0) {
                this.formatedMessage = MessageUtils.getMessageDefault(orgMessage,this.args);
            }else{
                this.formatedMessage = orgMessage;
            }
        }
        return this.formatedMessage;
    }

    public Object getData() {
        return data;
    }

    public PPException setData(Object data) {
        this.data = data;
        return this;
    }
}
