package DesignPattern.BuilderPattern;

public class Toy {
    private String name ;
    private int id ;
    private String artist ;
    private String color ;
    private float price ;

    private Toy(ToyBuilder tb){
        name = tb.name;
        id = tb.id;
        artist = tb.artist;
        color = tb.color;
        price = tb.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    //Builder
    static class ToyBuilder{
        private String name = null;
        private int id = -1;
        private String artist = null;
        private String color = null;
        private float price = -1;

        public ToyBuilder setName(String name){
            this.name = name;
            return this;
        }

        public ToyBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public ToyBuilder setArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public ToyBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public ToyBuilder setPrice(float price) {
            this.price = price;
            return this;
        }

        public Toy build(){
            return new Toy(this);
        }
    }
}
