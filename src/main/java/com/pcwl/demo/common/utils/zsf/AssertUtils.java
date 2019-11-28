package com.pcwl.demo.common.utils.zsf;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Collection;

public class AssertUtils {
    public static void notNull(Object o, String message, String... args) {
        if (null == o) {
            throw new PPException(message, args);
        }
    }


    public static void isNull(Object o, String message, String... args) {
        if (null != o) {
            throw new PPException(message, args);
        }
    }

    public static void notEmpty(String o, String message, String... args) {
        if (StringUtils.isEmpty(o)) {
            throw new PPException(message, args);
        }
    }

    public static void notEmpty(Object[] o, String message, String... args) {
        if (o == null || o.length < 1) {
            throw new PPException(message, args);
        }
    }

    public static void notEmpty(Collection<?> o, String message, String... args) {
        if (o == null || o.size() < 1) {
            throw new PPException(message, args);
        }
    }

    public static void isEmpty(String o, String message, String... args) {
        if (StringUtils.isNotEmpty(o)) {
            throw new PPException(message, args);
        }
    }

    public static void isEmpty(Object[] o, String message, String... args) {
        if (o != null && o.length > 0) {
            throw new PPException(message, args);
        }
    }

    public static void isEmpty(Collection<?> o, String message, String... args) {
        if (o != null && o.size() > 0) {
            throw new PPException(message, args);
        }
    }


    public static void notBlank(String o, String message, String... args) {
        if (StringUtils.isBlank(o)) {
            throw new PPException(message, args);
        }
    }

    public static void equals(String o1, String o2, String message, String... args) {
        if (!StringUtils.equals(o1, o2)) {
            throw new PPException(message, args);
        }
    }

    public static void equals(Integer o1, Integer o2, String message, String... args) {
        if (!(o1 == null ? o2 == null : o1.equals(o2))) {
            throw new PPException(message, args);
        }
    }

    public static void equals(Object o1, Object o2, String message, String... args) {
        if (!(o1 == null ? o2 == null : o1.equals(o2))) {
            throw new PPException(message, args);
        }
    }

    public static void notEquals(String o1, String o2, String message, String... args) {
        if (StringUtils.equals(o1, o2)) {
            throw new PPException(message, args);
        }
    }

    public static void notEquals(Integer o1, Integer o2, String message, String... args) {
        if (o1 == null ? o2 == null : o1.equals(o2)) {
            throw new PPException(message, args);
        }
    }

    public static void notEquals(Object o1, Object o2, String message, String... args) {
        if (o1 == null ? o2 == null : o1.equals(o2)) {
            throw new PPException(message, args);
        }
    }

    public static void isTrue(Boolean b, String message, String... args) {
        if (!b) {
            throw new PPException(message, args);
        }
    }

    public static void isFalse(Boolean b, String message, String... args) {
        if (b) {
            throw new PPException(message, args);
        }
    }

    public static void contains(Object[] array, Object valueToFind, String message, String... args) {
        if (!ArrayUtils.contains(array, valueToFind)) {
            throw new PPException(message, args);
        }
    }
}
