package builder;

/**
 * Created by Administrator on 19.03.2015.
 */
public class Programmer {
    private String name;
    private String type;

    private Programmer(){}

    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public static Builder newBuilder(){
        return new Programmer().new Builder();
    }

    public class Builder{
        private Builder(){}

        public Builder setName(String name){
            Programmer.this.name = name;
            return this;
        }
        public Builder setType(String type){
            Programmer.this.type = type;
            return this;
        }
        public Programmer build(){
            System.out.println("Hello, i`m " + name + " - " + type + " programmer");
            return Programmer.this;
        }
    }
}

