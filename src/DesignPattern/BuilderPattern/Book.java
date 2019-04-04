package DesignPattern.BuilderPattern;

public class Book {
    private String name = null;
    private String artist = null;
    private int id = -1;
    private String color = null;
    private String secondartist =null;

    private Book(BookBuilder bb){
        this.name = bb.name;
        this.artist = bb.artist;
        this.id = bb.id;
        this.color = bb.color;
        this.secondartist = bb.secondartist;
    }

    static class BookBuilder{
        private String name = null;
        private String artist = null;
        private int id = -1;
        private String color = null;
        private String secondartist =null;

        public BookBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public BookBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public BookBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public BookBuilder setSecondartist(String secondartist) {
            this.secondartist = secondartist;
            return this;
        }

        public Book build(){
            return new Book(this);
        }
    }

    @Override
    public String toString(){
        return "[name="+name+",artist="+artist+",id="+id+",color="+color+",second="+secondartist+"]";
    }
}
