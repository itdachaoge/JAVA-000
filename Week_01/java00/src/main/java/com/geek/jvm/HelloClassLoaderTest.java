package com.geek.jvm;

import java.util.Base64;

/**
 * @author: zhang
 * @date: 2020/10/19
 * @description: 自定义 ClassLoader
 */
public class HelloClassLoaderTest extends ClassLoader {

    public static void main(String[] args) {
        try {
//            Hello hello = new Hello();
            new HelloClassLoaderTest().findClass("com.geek.jvm.Hello").newInstance();//加载并初始化Hello类

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected Class<?> findClass(String name) throws  ClassNotFoundException{
        String helloBase64 = "yv66vgAAADQAHAoABgAOCQAPABAIABEKABIAEwcAFAcAFQEABjxpbml0PgEAAygpVgEABENvZGUB" +
                "AA9MaW5lTnVtYmVyVGFibGUBAAg8Y2xpbml0PgEAClNvdXJjZUZpbGUBAApIZWxsby5qYXZhDAAH" +
                "AAgHABYMABcAGAEAGEhlbGxvIENsYXNzIEluaXRpYWxpemVkIQcAGQwAGgAbAQASY29tL2dlZWsv" +
                "anZtL0hlbGxvAQAQamF2YS9sYW5nL09iamVjdAEAEGphdmEvbGFuZy9TeXN0ZW0BAANvdXQBABVM" +
                "amF2YS9pby9QcmludFN0cmVhbTsBABNqYXZhL2lvL1ByaW50U3RyZWFtAQAHcHJpbnRsbgEAFShM" +
                "amF2YS9sYW5nL1N0cmluZzspVgAhAAUABgAAAAAAAgABAAcACAABAAkAAAAdAAEAAQAAAAUqtwAB" +
                "sQAAAAEACgAAAAYAAQAAAAgACAALAAgAAQAJAAAAJQACAAAAAAAJsgACEgO2AASxAAAAAQAKAAAA" +
                "CgACAAAACgAIAAsAAQAMAAAAAgAN";
        byte[]  bytes = decode(helloBase64);
        return defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] decode(String base64) {
        System.out.println(Base64.getDecoder().decode(base64).getClass());
        return Base64.getDecoder().decode(base64);
    }

//    @Override
//    protected Class<?> findClass(String name) {
//        try {
//            String fullPath = path
//        }
//    }
}
