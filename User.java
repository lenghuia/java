public class User {
    private String id;
    private String password;
    private int type;
    private String name;
    private String unit;
    private String telephone;
    private int count;

    public User(String id, String password, int type, String name,String unit, String telephone, int count) {
        this.id = id;
        this.password = password;
        this.type = type;
        this.name = name;
        this.unit = unit;
        this.telephone = telephone;
        this.count = count;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
