package Model;

import Entity.Budi07154_TransaksiEntity;
import java.util.ArrayList;

public class Budi07154_TransaksiModel{
    private final ArrayList<Budi07154_TransaksiEntity> transaksiApartemenArrayList;
    private final ArrayList<Budi07154_TransaksiEntity> transaksiArrayList;
    
    
    public Budi07154_TransaksiModel(){
        transaksiApartemenArrayList = new ArrayList<>();
        transaksiArrayList = new ArrayList<>();
    }
    
    public void insert(Budi07154_TransaksiEntity transaksiApartemenEntity){ //method
        transaksiApartemenArrayList.add(transaksiApartemenEntity);
    }
    public void insertt(Budi07154_TransaksiEntity transaksiEntity){ //method
        transaksiArrayList.add(transaksiEntity);
    }
    public int size() {
      return transaksiApartemenArrayList.size();
    }
    public int sizee() {
      return transaksiArrayList.size();
    }
    public void remove(int carikode) {
        transaksiApartemenArrayList.remove(carikode);
    }
    public ArrayList<Budi07154_TransaksiEntity> getTransaksiApartemenEntityArrayList(){
        return transaksiApartemenArrayList;
    }
    public ArrayList<Budi07154_TransaksiEntity> getTransaksiEntityArrayList(){
        return transaksiArrayList;
    }
    
    public Budi07154_TransaksiEntity getTransaksiApartemenArrayList(int index){
        return transaksiApartemenArrayList.get(index);
    }
    public Budi07154_TransaksiEntity getTransaksiArrayList(int index){
        return transaksiArrayList.get(index);
    }


}
