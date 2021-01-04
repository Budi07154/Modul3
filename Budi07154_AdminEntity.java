package Entity;

public class Budi07154_AdminEntity extends BudiAbstractEntity {
    private String kode,password;
    
    public Budi07154_AdminEntity(String nama, String notelp, String umur, String kode, String password){
        super(nama, notelp, umur);
        this.password = password;
        this.kode=kode;
    }
    public String getKode(){
        return kode;
    }
    public void setKode(String kode){
        this.kode = kode;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    
}
