package Controller;

import Entity.Budi07154_PenyewaEntity;
import java.util.ArrayList;

public class Budi07154_PenyewaController{
    
    public Budi07154_PenyewaController(){
 
    }
    int index = 0;
    
    public void insert(String nama, String notelp,String umur, String alamat){
        Budi07154_AllObjectModel.penyewaModel1.insert(new Budi07154_PenyewaEntity(nama,notelp,umur,alamat));
    }
    public Budi07154_PenyewaEntity PenyewaEntity(){
        return Budi07154_AllObjectModel.penyewaModel1.getPenyewaEntityArrayList(index);
    }
    public void remove(int carikode){
        Budi07154_AllObjectModel.penyewaModel1.remove(carikode);
    }
    public ArrayList<Budi07154_PenyewaEntity> cekDaftarPenyewa(int index){
    return Budi07154_AllObjectModel.penyewaModel1.getPenyewaEntityArrayList();
    }
}