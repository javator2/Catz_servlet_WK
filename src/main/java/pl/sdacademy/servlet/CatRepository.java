package pl.sdacademy.servlet;

import java.util.List;

public interface CatRepository {

    void save(Cat cat);
    List<Cat> findAll();
    List<Cat> findByRase(String rasa);
}
