package Model;

import Entity.Budi07154_AdminEntity;
import java.util.ArrayList;

public class Budi07154_AdminModel {
    
    private ArrayList<Budi07154_AdminEntity> adminEntityArrayList;
    
    public Budi07154_AdminModel(){
        adminEntityArrayList = new ArrayList<Budi07154_AdminEntity>();
    }
    public void insert(Budi07154_AdminEntity adminEntity){ //method
        adminEntityArrayList.add(adminEntity);
    }
     

    public int cekData(String kode, String password) {
        int loop = 0;
        while (!adminEntityArrayList.get(loop).getPassword().equals(password)){
            loop++;
        }
        return loop;
    }
    
    public Budi07154_AdminEntity getAdminEntityArrayList(int index){
        return adminEntityArrayList.get(index);
    }
    
}
