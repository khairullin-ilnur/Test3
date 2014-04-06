package ru.kpfu.itis.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Ilnur on 06.04.14.
 */

public class ParrotApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Parrot parrot = (Parrot) context.getBean("parrot");
        System.out.println(parrot.saySpeech());
    }
}
