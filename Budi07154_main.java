package Project;

import Controller.Budi07154_AdminController;
import Controller.Budi07154_PenyewaController;
import Controller.Buid07154_TransaksiController;
import Entity.Budi07154_ApartemenEntity;
import java.util.Scanner;


public class Budi07154_main {
    private static final Budi07154_PenyewaController penyewa = new Budi07154_PenyewaController();
    private static final Budi07154_AdminController admin = new Budi07154_AdminController();
    private static final Buid07154_TransaksiController transaksiApartemen = new Buid07154_TransaksiController();
    private static final Buid07154_TransaksiController transaksi = new Buid07154_TransaksiController();
    
    static Scanner input = new Scanner(System.in);
    static int cekadmin, cekpenyewa, cekapartemen, cektransaksi;
    
       public static void main(String[] args) {
           
           int loop = 0 ;        
           do{
               
            System.out.print("Selamat Datang di Sewa Apartemen"
                   + "\n1. Daftar Pegawai"
                   + "\n2. Login Pegawai"
                   + "\n3. Exit"
                   + "\nPilih = ");
            int pilih = input.nextInt();
            if(pilih == 1){
               Daftar();
            }
            else if(pilih == 2){
               Login();
            }
            else{
               break;
            }
            
           }while(loop != 3);
           
       }
       
       static void Daftar(){
        System.out.print("Input Id = ");
        String kode = input.next();
        System.out.print("Input Nama = ");
        String nama = input.next();
        System.out.print("Input No Telp = ");
        String notelp = input.next();
        System.out.print("Input Umur = ");
        String umur = input.next();
        System.out.print("Password = ");
        String password = input.next();
        admin.insert(kode, nama, notelp, umur, password);
      }
       
       static void Login(){
        
        int pil;
        System.out.print("Id : ");
        String kode = input.next();
        System.out.print("Password : ");
        String password = input.next();
        try{
        admin.login(kode, password);
        do{
        System.out.println("Selamat datang "+admin.AdminEntity().getNama());
        System.out.println("1. Penyewa  ");
        System.out.println("2. Lihat  ");
        System.out.println("3. Update");
        System.out.println("4. Remove");
        System.out.println("5. Logout");
        System.out.print("Pilih = ");
        pil = input.nextInt();
        
        switch(pil){
            
            case 1 : Penyewa();
                     break;
            case 2 : 
                     if(penyewa.cekDaftarPenyewa(cekpenyewa).isEmpty()){
                         System.out.println("Data Kosong");
                     }else{
                         view();
                     } 
                     break;
            case 3:  
                     System.out.print("Masukkan ID yang mau tambah sewa :");
                     String kodee =input.next();
                     update(kodee);                   
                     break;
            case 4:  
                     System.out.print("Id Penyewa :");
                     String kodeee =input.next();
                     remove(kodeee);
                     break;            
           }
        }while(pil !=  5);
        }catch(Exception exception){
             System.out.println("Id Atau Password Salah !!");
         } 
       }
        
       
       static void Penyewa()
       {
          
         System.out.print("Id Penyewa :");
         String kode = input.next();
         System.out.print("Nama Penyewa : ");
         String nama = input.next();
         System.out.print("No Telp Penyewa : ");
         String notelp = input.next();
         System.out.print("Umur Penyewa : ");
         String umur = input.next();
         System.out.print("Alamat  : ");
         String alamat = input.next();
         System.out.print("No Antrian : ");
         String noantrian = input.next();
         System.out.print("Nama Pegawai : ");
         String indexadmin = input.next();
         penyewa.insert(nama, notelp, umur, alamat);
         transaksi.insertt(noantrian, indexadmin, kode);
          
         System.out.print("Jumlah yang Disewa : ");
         
         int jmlh=input.nextInt();
         for(int j=0;j<jmlh;j++){
             for(int i=0;i<Budi07154_ApartemenEntity.Apartemen.length;i++){
                System.out.println(i+". "+Budi07154_ApartemenEntity.Apartemen[i]);
                 }
                 System.out.print("Apartemen Yang Disewa : ");
                int indexapartemen = input.nextInt();
                transaksiApartemen.insert(indexapartemen, jmlh, kode);
                }
       }
       static void view()
       {                
            System.out.println("==========> Daftar Penyewa <==========");
            for(int i=0;i<penyewa.cekDaftarPenyewa(cekpenyewa).size();i++)
            {
                System.out.println("ID Penyewa = "+transaksi.cekDataPenyewa(cekpenyewa).get(i).getKodePenyewa());
                System.out.println("Nama Penyewa = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getNama());
                System.out.println("No Telp Penyewa = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getNotelp());
                System.out.println("Umur Penyewa = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getUmur());
                System.out.println("Alamat Penyewa = "+penyewa.cekDaftarPenyewa(cekpenyewa).get(i).getAlamat());
                System.out.println("No Antrian = "+transaksi.cekDataPenyewa(cekpenyewa).get(i).getNoantrian());
                System.out.println("===>["+transaksi.cekDataPenyewa(cekpenyewa).get(i).getIndexadmin()+"]<==");    
            }
             System.out.println("Masukkan ID Total Unit Sewa : "); //01
             String kodeP=input.next();
             
             for(int k=0;k<transaksiApartemen.cekDaftarApartemen(cekapartemen).size();k++){
                 
                 if(transaksiApartemen.cekDaftarApartemen(k).get(k).getKodeApartemen().equals(kodePenyewa)){
                 } else {
                     int indexapartemen=transaksiApartemen.cekDaftarApartemen(k).get(k).getIndexapartemen();
                     if(indexapartemen==0){
                         System.out.println("> Gunawangsa           = 900.000");    
                     }else if(indexapartemen==1){
                         System.out.println("> Manyar               = 400.000");
                     }else if(indexapartemen==2){
                         System.out.println("> Bale Hinggil         = 100.000");
                     }else if(indexapartemen==3){
                         System.out.println("> Puncak Kertajaya      = 600.000");
                     }else if(indexapartemen==4){
                         System.out.println("> Twin Tower            = 500.000");
                     }
                 }
                 
             }
             System.out.println("==========> Terimakasih <==========");
       }
    

       static void update(String kode)
       {
        for(int i=0;i<penyewa.cekDaftarPenyewa(cekapartemen).size();i++)
        {
          if(kode.equals(transaksi.cekDataPenyewa(i).get(i).getKodePenyewa()))
            {
                System.out.print("Nambah berapa unit? :");
                int jmlh=input.nextInt();
                for(int j=0;j<jmlh;j++){
                for(int l=0;l<Budi07154_ApartemenEntity.Apartemen.length;l++){
                System.out.println(l+". "+Budi07154_ApartemenEntity.Apartemen[l]);
                 }
                 System.out.print("Apartemen Yang Disewa : ");
                int indexapartemen = input.nextInt();
                transaksiApartemen.insert(indexapartemen, jmlh, kode);
                }
                 break;
                
            }
           else
           {
                System.out.println("ID salah");
           }
                
        }
       }
       
       static void remove(String kode)
       {
        for(int i=0;i<penyewa.cekDaftarPenyewa(cekpenyewa).size();i++)
        {
          if(kode.equals(transaksi.cekDataPenyewa(i).get(i).getKodePenyewa()))
          {
                penyewa.remove(i);
                System.out.println("Data Sudah Di Hapus");
                break;
          }
          
          else
          {
                System.out.println("ID SALAH");
               
          }
        }
        for(int j=0;j<transaksiApartemen.cekDaftarApartemen(cekapartemen).size();j++)
        {
            if(kode.equals(transaksiApartemen.cekDaftarApartemen(j).get(j).getKodeApartemen()))
            {
                transaksiApartemen.remove(j);
            }
        }
        for(int k=0;k<transaksi.cekDataPenyewa(cektransaksi).size();k++)
        {
            if(kode.equals(transaksi.cekDataPenyewa(k).get(k).getNoantrian()))
            {
                transaksi.remove(k);
            }
        }
       }
}
