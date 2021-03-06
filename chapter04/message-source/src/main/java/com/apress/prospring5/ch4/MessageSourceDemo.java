package com.apress.prospring5.ch4;

import java.util.Locale;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MessageSourceDemo {
    public static void main(String... args) {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-context-xml.xml");
        ctx.refresh();

        Locale english = Locale.ENGLISH;
        Locale korean = new Locale("ko", "KR");

        System.out.println(ctx.getMessage("msg", null, english));
        System.out.println(ctx.getMessage("msg", null, korean));

        System.out.println(ctx.getMessage("nameMsg", new Object[] { "John",
                "Mayer" }, english));
        System.out.println(ctx.getMessage("nameMsg", new Object[] { "John",
                "Mayer" }, korean));

        ctx.close();
    }
}
