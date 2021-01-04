package Entity;

public class Budi07154_PenyewaEntity extends BudiAbstractEntity{
    
    private String alamat; //
    
    public Budi07154_PenyewaEntity(String nama, String notelp,String umur, String alamat){
        super(nama, notelp, umur);
        this.alamat=alamat;
    }

    public String getAlamat(){
        return this.alamat;

    }
}