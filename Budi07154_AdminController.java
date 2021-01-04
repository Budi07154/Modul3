package Controller;

import Entity.Budi07154_AdminEntity;

public class Budi07154_AdminController{
    public Budi07154_AdminController(){
 
    }
    int indexLogin = 0;

    public void login(String kode,String password){
        indexLogin = Budi07154_AllObjectModel.adminModel.cekData(kode,password);
    }
    
    public void insert(String kode, String nama, String notelp, String umur, String password){
        Budi07154_AllObjectModel.adminModel.insert(new Budi07154_AdminEntity(kode,nama,notelp,umur,password));
    }
    public Budi07154_AdminEntity AdminEntity(){
        return Budi07154_AllObjectModel.adminModel.getAdminEntityArrayList(indexLogin);
    }
}
