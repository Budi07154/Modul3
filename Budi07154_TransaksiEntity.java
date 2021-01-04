package Entity;

public class Budi07154_TransaksiEntity {
    
    private int indexapartemen, jmlh; 
    private String kodeapartemen, noantrian, indexadmin, kodepenyewa;

    public Budi07154_TransaksiEntity(int indexapartemen, int jmlh, String kodeapartemen) {
        this.indexapartemen = indexapartemen;
        this.jmlh = jmlh;
        this.kodeapartemen = kodeapartemen;
        
    }
    
    public Budi07154_TransaksiEntity(String noantrian, String indexadmin, String kodepenyewa){
        this.noantrian = noantrian;
        this.indexadmin = indexadmin;
        this.kodepenyewa = kodepenyewa;
    }

    public int getIndexapartemen() {
        return indexapartemen;
    }

    public int getJmlh() {
        return jmlh;
    }

    public String getKodeApartemen() {
        return kodeapartemen;
    }
    
    public String getNoantrian(){
        return noantrian;
    }
    
    public String getIndexadmin(){
        return indexadmin;
    }
    public String getKodePenyewa(){
        return kodepenyewa;
    }
  
}
