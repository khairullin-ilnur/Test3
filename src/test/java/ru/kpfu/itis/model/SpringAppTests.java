package ru.kpfu.itis.model;

import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class SpringAppTests {
    @Autowired
    private Parrot parrot;

    @Test
    public void testSaySpeech() {
        Assert.assertEquals("Hello! My name is OldPirate. My owner is Misha.I know some words: Fedor The best! ", parrot.saySpeech());
    }
}
