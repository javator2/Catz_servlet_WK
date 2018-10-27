package pl.sdacademy.servlet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class InMemoryCatRepository implements CatRepository {

    private List<Cat> cats;

    public InMemoryCatRepository() {
        this.cats = new ArrayList<>();
    }

    @Override
    public void save(Cat cat) {
        cats.add(cat);
    }

    @Override
    public List<Cat> findAll() {
        return cats;
    }

    @Override
    public List<Cat> findByRase(String rasa) {
        return findAll().stream().filter(cat -> cat.getRasa().equals(rasa)).collect(Collectors.toList());
    }
}
