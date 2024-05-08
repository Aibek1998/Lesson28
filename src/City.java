public class City implements Comparable<City> {
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public City() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.code, other.code);
    }

    @Override
    public String toString() {
        return "\n"+"City : " +"\n"+
                "code : " + code + "\n"+
                "name : " + name +"\n";
    }
}
