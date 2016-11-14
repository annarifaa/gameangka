package com.facebook.istianaarifah.app12131324;

import java.util.Scanner;
public class app12131324 {
    String nama;
    byte level = 1;
    byte kesempatan = 5;
    short tebak;
    short banyak=0;
    int random, score=0;
    char jawab;

    public void setPilih(String nama) {
        this.nama = nama;
    }

    public void setTebak(short tebak) {
        this.tebak = tebak;
    }
    
    public int Level(){
        return level*100;
    }
    public int kesempatan(){
        kesempatan = 5;
    return kesempatan;}
    
    public void hasilTebakan() {
      
      kesempatan--;
      banyak++;
      
        System.out.println("Tebakan anda ? " + tebak);
        if (tebak<random){
            System.out.print("Tebakan Anda telalu kecil! ");
        }
        if (tebak>random){
            System.out.print("Tebakan Anda telalu besar! ");
        }
        if (tebak==random) {
            System.out.print("Selamat Anda berhasil menebak sebanyak " + banyak + " kali tebakan");
        }
        
        if (kesempatan>=1){
            System.out.println("Anda mempunyai kesempatan " + kesempatan + " kali lagi.");
        }
        if(kesempatan ==0) {
            System.out.println("nilai tebakan yang benar adalah " +random);
            System.out.println("Game Over");
          
        }
    }
    
    public void Score() {
        if (banyak == 1){
            score= 100*level;
        }
        if (banyak == 2){
            score= 70*level;
        }
        if (banyak == 3){
            score= 50*level;
        }
        if (banyak == 4){
            score= 30*level;
        }
        System.out.println(nama + "\t: " + score);
        
    }
    public static void main(String[] args) {
        app12131324 main = new app12131324();
        main.random = (short) (Math.random()*main.Level());
        System.out.println("Masukkan nama Anda untuk memulai atau tekan 'T' utuk keluar.");
        
        Scanner inputString = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);
        
        main.nama=inputString.nextLine();
        
        if (!"T".equals(main.nama))
        {   
         
            System.out.println("## Level " + main.level);  
            System.out.println("Selamat datang " + main.nama);   
            System.out.println("Silakan tebak angka antara 0 s/d " + main.Level());    
            System.out.println("Anda mempunyai kesempatan menebak " + main.kesempatan() + " kali");  
         do{
                System.out.println();   
                System.out.println("Masukkan tebakan : "); 
                main.tebak = inputAngka.nextShort();
                main.hasilTebakan();
            }while(main.tebak!=main.random&&main.kesempatan>0);
            
            main.Score();
                System.out.println("Apakah anda ingin melanjutkan ke level berikutnya ? (y/t)");
                main.jawab=inputString.nextLine().charAt(0);   
                do{
                  main.banyak = 0;
                  main.level++;
            System.out.println("\n ######################### \n"); 
            System.out.println("# Level " + main.level);  
            System.out.println("Selamat datang " + main.nama);   
            System.out.println("Silakan tebak angka antara 0 s/d " + main.Level());    
            System.out.println("Anda mempunyai kesempatan menebak " + main.kesempatan() + " kali");
            
            do{
                System.out.println();   
                System.out.println("Masukkan tebakan : "); 
                main.tebak = inputAngka.nextShort();
                main.hasilTebakan();
            }while(main.tebak!=main.random&&main.kesempatan>0);
            
            main.Score();  
            System.out.println("Apakah anda ingin melanjutkan ke level berikutnya ? (y/t)");
                main.jawab=inputString.nextLine().charAt(0);
                if(main.jawab=='y'){
                main.level++;}
           }while(main.jawab=='y');
        }
          
        }

    }
    

