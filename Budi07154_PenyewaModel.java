package Model;

import java.text.SimpleDateFormat;
import Entity.Budi07154_PenyewaEntity;
import java.util.ArrayList;

public class Budi07154_PenyewaModel {
    
    private ArrayList<Budi07154_PenyewaEntity> penyewaEntityArrayList;
    
    public Budi07154_PenyewaModel(){
        penyewaEntityArrayList = new ArrayList<Budi07154_PenyewaEntity>();
    }
    public void insert(Budi07154_PenyewaEntity penyewaEntity){ //method
        penyewaEntityArrayList.add(penyewaEntity);
    }
    public int size() {
      return penyewaEntityArrayList.size();
    }
    public void remove(int carikode) {
        penyewaEntityArrayList.remove(carikode);
    }
    public ArrayList<Budi07154_PenyewaEntity> getPenyewaEntityArrayList(){
        return penyewaEntityArrayList;
    }
    
    public Budi07154_PenyewaEntity getPenyewaEntityArrayList(int index){
        return penyewaEntityArrayList.get(index);
    }  

}
