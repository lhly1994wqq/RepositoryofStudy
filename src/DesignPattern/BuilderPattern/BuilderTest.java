package DesignPattern.BuilderPattern;

import org.junit.Test;

public class BuilderTest {
    @Test
    public void test1(){
        Book book = new Book.BookBuilder().setName("Thinking in Java").setArtist("LLLL").build();
        System.out.println(book);
    }

    @Test
    public void test2(){
        Toy toy = new Toy.ToyBuilder().setName("lala").build();
        System.out.println(toy.getName());
    }
}
