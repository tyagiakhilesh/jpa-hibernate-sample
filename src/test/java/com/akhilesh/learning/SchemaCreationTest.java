package com.akhilesh.learning;

import com.akhilesh.learning.domain.Teacher;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.testcontainers.containers.PostgreSQLContainer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SchemaCreationTest {

    @BeforeAll
    public static void setUp() {
        PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer();
        postgreSQLContainer.start();
        System.setProperty("postgres.url", postgreSQLContainer.getJdbcUrl());
        System.setProperty("postgres.user", postgreSQLContainer.getUsername());
        System.setProperty("postgres.password", postgreSQLContainer.getPassword());
    }

    @Test
    public void test() {
        final EntityManagerFactory sessionFactory =
                Persistence.createEntityManagerFactory("org.hibernate.tutorial.jpa");
        final EntityManager entityManager = sessionFactory.createEntityManager();
        entityManager.getTransaction().begin();
        final Teacher teacher = new Teacher();
        teacher.setSpecialization("specialization");
        teacher.setName("Test Person");
        teacher.setEmailId("abc@xyz.com");
        entityManager.persist(teacher);
        entityManager.getTransaction().commit();
        entityManager.close();
        System.out.println("Okay");
    }
}
