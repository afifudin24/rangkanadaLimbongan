package kbkm.th2023.limbonganready.objects;
public class Pengguna {
    public String email, password;
    private String key;
    public Pengguna() {
    }
    public Pengguna(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static boolean isEmpty() {
        return false;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
        this.key = key;
    }
}
