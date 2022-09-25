package Array;


class Encapsulation {
    public static void main(String[] args) {
        StudentRecord data = new StudentRecord("Malang",20);
        data.setName("Theligos");
        System.out.println("Nama   : "+data.getName()+ "\nAlamat : "+data.getAlamat()+ "\nUmur   : "+data.getUmur());
    }
}
class StudentRecord {
    private String alamat;
    private int umur;

    public StudentRecord(String alm, int age) {
        this.alamat = alm;
        this.umur = age;
    }

    private String name;

    public void setName(String temp) {
        this.name = temp;
    }

    public String getName() {
        return this.name;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public int getUmur() {
        return this.umur;
    }
}