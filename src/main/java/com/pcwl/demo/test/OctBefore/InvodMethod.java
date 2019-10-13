package com.pcwl.demo.test.OctBefore;

public class InvodMethod {

    private static String className = "com.pcwl.demo.test.OctBefore.InvodQuote";

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader=InvodMethod.class.getClassLoader();
        Class clazz = classLoader.loadClass(className);
        System.out.println(clazz.getName());
    }
}
