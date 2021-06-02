/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;
import java.util.*;
/**
 *
 * @author WINDOWS 10
 */
public class kuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner a = new Scanner(System.in);
        int pilih,nik = 0,tulis=0,coding=0,wawan=0,pilih2;
        String nama;
        System.out.println("FORM PENDAFTARAN PT.UDIN");
        System.out.println("1.Divisi Android Development");
        System.out.println("2. Web Development");
        System.out.print("pilih jenis form");
        pilih = a.nextInt();
    switch(pilih){
        case 1:
        System.out.print("Input NIK   :");nik=a.nextInt();
        System.out.print("Input nama  :");nama=a.next();
        System.out.print("input nilai tes tulis   :");tulis=a.nextInt();
        System.out.print("input nilai tes coding  :");coding=a.nextInt();
        System.out.print("Input tesnilaiwawancara :");wawan=a.nextInt();
        break;
        case 2:
        System.out.print("Input NIK   :");nik=a.nextInt();
        System.out.print("Input nama  :");nama=a.next();
        System.out.print("input nilai tes tulis   :");tulis=a.nextInt();
        System.out.print("input nilai tes coding  :");coding=a.nextInt();
        System.out.print("Input tesnilaiwawancara :");wawan=a.nextInt();
           break;
        default:
            System.out.println("salah input");
    }
    int hasil = 0;
    if(pilih==1)
        
    {
            hasil=(int) (tulis*0.2+coding*0.5+wawan*0.3);
        }
   else if(pilih==2)
        {
            hasil=(int) (tulis*0.4+0.35*coding+0.25*wawan);
        }
    do{
        System.out.println("MENU");
        System.out.println("1.edit");
        System.out.println("2.tampil");
        System.out.println("3.exit");
        System.out.print("pilih :");pilih2=a.nextInt();
        if(pilih2==1)
        {

        System.out.print("Input NIK   :");nik=a.nextInt();
        System.out.print("Input nama  :");nama=a.next();
        System.out.print("input nilai tes tulis   :");tulis=a.nextInt();
        System.out.print("input nilai tes coding  :");coding=a.nextInt();
        System.out.print("Input tesnilaiwawancara :");wawan=a.nextInt();
        }
        else if(pilih2==2)
        {
        System.out.println("Nillai Akhir :"+hasil);
        System.out.print("KETERANGAN    ");
        if(hasil>=85)
        {
            System.out.println("LULUS");
        }
        else
        {
            System.out.println("Tidak Lulus");
        }
        }
    }while(pilih2!=3);
    
    
    
    

   

    }}