public class MyTestingClass {
    private int id;
    private String name;

    public MyTestingClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 17;

        hash = 31 * hash + id;

        if (name != null) {
            hash = 31 * hash + name.length();
        }
        else {
            hash = 31 * hash; }
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyTestingClass)) {
            return false;
        }

        MyTestingClass other = (MyTestingClass) o;

        return id == other.id && name.equals(other.name);
    }
}
