public class Student {
    private String nim;
    private String name;
    private String klas;
    private String status;



    public Student() {
    }

    public Student(String nim, String name, String klas, String status) {
        this.nim = nim;
        this.name = name;
        this.klas = klas;
        this.status = status;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKlas() {
        return klas;
    }

    public void setKlas(String klas) {
        this.klas = klas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
