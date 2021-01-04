package Controller;

import Entity.Budi07154_TransaksiEntity;
import java.util.ArrayList;

public class Buid07154_TransaksiController{
    public Buid07154_TransaksiController(){
 
    }
    int index = 0;
    
    public void insert(int indexapartemen, int jmlh, String kodeapartemen){
        Budi07154_AllObjectModel.transaksiApartemenModel.insert(new Budi07154_TransaksiEntity(indexapartemen, jmlh, kodeapartemen));
    }
    public void insertt(String noantrian, String indexadmin, String kodepenyewa){
        Budi07154_AllObjectModel.transaksiModel.insertt(new Budi07154_TransaksiEntity(noantrian, indexadmin, kodepenyewa));
    }
    public Budi07154_TransaksiEntity TransaksiEntity(){
        return Budi07154_AllObjectModel.transaksiModel.getTransaksiArrayList(index);
    }
    public Budi07154_TransaksiEntity TransaksiApartemenEntity(){
        return Budi07154_AllObjectModel.transaksiApartemenModel.getTransaksiApartemenArrayList(index);
    }
    public ArrayList<Budi07154_TransaksiEntity> cekDataPenyewa(int index){
    return Budi07154_AllObjectModel.transaksiModel.getTransaksiEntityArrayList();
    }
    public ArrayList<Budi07154_TransaksiEntity> cekDaftarTas(int index){
    return Budi07154_AllObjectModel.transaksiApartemenModel.getTransaksiApartemenEntityArrayList();
    }
    public void remove(int carikode){
        Budi07154_AllObjectModel.transaksiApartemenModel.remove(carikode);
    }
    public void removee(int carikodee){
        Budi07154_AllObjectModel.transaksiModel.remove(carikodee);
    }

    public Object cekDaftarApartemen(int cekapartemen) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
