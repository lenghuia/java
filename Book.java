public class Book1 {
    private String id;
    private String bookname;
    private String unit;
    private String name;
    private int count;
    public Book1(String id, String bookname,String name, String unit, int count) {
        this.id = id;
        this.bookname = bookname;
        this.unit = unit;
        this.name = name;
        this.count = count;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
