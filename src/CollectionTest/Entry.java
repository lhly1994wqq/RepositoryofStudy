package CollectionTest;

public class Entry {

    public Entry(Object key,Object value){
        super();
        this.key = key;
        this.value = value;
    }
    private Object key;
    private Object value;

    public Object getValue(){
        return this.value;
    }

    public Object getKey(){
        return this.key;
    }

    public void setKey(Object key){
        this.key = key;
    }

    public  void setValue(Object value){
        this.value = value;
    }

    @Override
    public String toString(){
        return "[key="+key+",value="+value+"]";
    }

}
