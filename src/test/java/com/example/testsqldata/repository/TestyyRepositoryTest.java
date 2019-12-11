package com.example.testsqldata.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

import javax.persistence.Table;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestyyRepositoryTest {

    @Autowired
    private TestyyRepository repository;

    @Test
    public void workwork() {
        Object o = repository.findAll();
        assertEquals(1, 1);
    }

}