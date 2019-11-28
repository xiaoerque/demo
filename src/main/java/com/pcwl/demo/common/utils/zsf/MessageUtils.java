package com.pcwl.demo.common.utils.zsf;

import org.springframework.context.i18n.LocaleContextHolder;

import java.util.Locale;

public class MessageUtils {
    public static String getMessage(String key, String... args){
        Locale locale = LocaleContextHolder.getLocale();
        String message = SpringContextUtils.getContext().getMessage(key, args, locale);
        return message;
    }
    public static String getMessageDefault(String key, String... args){
        try {
            Locale locale = LocaleContextHolder.getLocale();
            String message = SpringContextUtils.getContext().getMessage(key, args,key, locale);
            return message;
        } catch (Exception e) {
            return key;
        }
    }
}
