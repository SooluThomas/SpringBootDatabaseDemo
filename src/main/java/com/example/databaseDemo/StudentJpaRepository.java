package com.example.databaseDemo;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class StudentJpaRepository {
    @PersistenceContext
    EntityManager entityManager;
    public Student findById(int id){
        return entityManager.find(Student.class, id);
    }

    public Student insert(Student student){
        Student add = entityManager.merge(student);
        System.out.println(add);
        return add;
    }

    public Student update(Student student){
        return entityManager.merge(student);
    }

    public void remove(int id) {
        Student found = findById(id);
        entityManager.remove(found);
    }
}
