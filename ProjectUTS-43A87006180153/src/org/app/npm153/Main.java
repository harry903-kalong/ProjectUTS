
package org.app.npm153;

import org.app.npm153.model.Sparepart;
import java.util.List;

public class Main {
  private SparepartDataSource dataSource;
   public Main(){
       dataSource = new SparepartDataSource();
   }
    public static void main(String[] args){
    new Main().testDelete();
   }
public void testGetAll(){
    List<Sparepart> list = dataSource.getAll();
    for (Sparepart spr : list){
        System.out.println("Nama Part: "+ spr.getNamaPart() + " Merk Part :"+spr.getMerkPart());
    }
    }
 public void testGetByID(){
     Sparepart sparepart = dataSource.getByID("A0001");
     if(sparepart !=null){
         System.out.println("Nama Part: "+ sparepart.getNamaPart() + " Merk Part :"+sparepart.getMerkPart());
     }
 }
 
 public void testInsert(){
     Sparepart sparepart = new Sparepart("A0004", "Ban", "IRC", "150.000","1");
     boolean hasil = dataSource.Insert(sparepart);
     if(hasil){
         System.out.println("Insert Data Berhasil!");
     }
     
 }   
 
   public void testUpdate(){
     Sparepart sparepart = dataSource.getByID("A0003");
     sparepart.setMerkPart("Yamaha");
     boolean hasil = dataSource.Update(sparepart);
     if(hasil){
         System.out.println("Update Data Berhasil!");
     } 
 }
   
   public void testDelete(){
     boolean hasil = dataSource.Delete("A0002");
     if(hasil){
         System.out.println("Delete Data A0002 Berhasil!");
     } 
 }
}