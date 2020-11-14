package org.example;

import static org.junit.Assert.assertTrue;

import org.inventory.commons.dao.IItemDao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.inventory");

        IItemDao itemDao = context.getBean(IItemDao.class);

        System.out.println(itemDao);
    }
}
