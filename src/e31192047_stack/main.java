package e31192047_stack;

import java.util.Scanner;

/**
 *
 * @author Sidhat
 */
public class main {
        public static void main(String[] args) { //method main
        //deklarasi variabel pilihan dan data tipe integer
        int pilihan;
        int data;       
        Stack result = new Stack(); //untuk memanggil kelas stack
        do{ 
            
            //mencetak daftar pilihan
            System.out.println("1. PUSH");
            System.out.println("2. POP ITEM");
            System.out.println("3. LIHAT ISI DATA");
            System.out.println("4. KELUAR");         
            Scanner input=new Scanner(System.in);
            //deklarasi scanner
            pilihan=input.nextInt(); //untuk memasukkan pilihan dari keyboard
            if(pilihan==1){  //jika pilihannya 1
                System.out.println("data yang ditambahkan :");
                //manampilkan output "data yang ditambahkan :"
                data=input.nextInt();  //inputan dari keyboard
                result.push(data);  //memanggil method push
            }
            else if(pilihan==2){  //jika pilihannya 2
                result.pop();  //memanggil method pop
            }
                    
            else if (pilihan==3){  //jika pilihannya 3
                result.display();  //memanggil method display
            }else if(pilihan==4){  //jika pilihannya 4
                System.exit(0);  //maka akan keluar/berhenti
            }
            else {
                System.out.println("pilihan  yang anda masukkan tidak ada");
                //manampilkan output "pilihan  yang anda masukkan tidak ada" jika menginput pilihan selain 1,2 3,4
            }
        } while(pilihan !=4);  
        //selama pilihan tidak sama dengan 4 maka program akan diulang
        //jika memilih 4 program akan berhenti
    }
}

//kesimpulan : 
//stack merupakan tumpukan yang memiliki prinsip LIFO(Last In First Out) yang berarti masuk paling akhir namun di ambil paling awal
//stack mempunyai 2 istilah yaitu push untuk menyimpan dan pop untuk mengambil