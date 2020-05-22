package e31192047_stack;

/**
 *
 * @author Sidhat
 */
public class Stack {
    private boolean empty, full; 
    //deklarasi variabel empty(kosong) dan full(penuh) bertipe boolean untuk mengecek true/false
    private int pos; //deklarasi variabel pos bertipe int
    private int max_data=3; //deklarasi variabel max_data bertipe  int 
    private int item[]=new int[max_data]; //deklarasi array dengan nama item 
    public void Stack(){ //constructor digunakan untuk set nilai awal kelas Stack
        
        //deklarasi awal kelas Stack
        full=false;
        empty=true;
        pos=0;
    }
    public boolean isFull(){ //untuk mengecek apakah penuh atau tidak 
        return (full); //mengembalikan nilai full
    }
    public boolean isEmpty(){  //untuk mengecek apakah kosong atau tidak 
        return (empty);  //mengembalikan nilai empty
    }
    public void push(int data){  //method untuk menambahkan Stack
        if(!isFull()){  //jika tidak penuh
            item[pos++]=data;  // maka item posisi ditambahkan
            empty=false;  //dan kondisi empty salah
            if(pos==max_data){  //jika posisi = max data
                full=true;  //kondisi full = true
            }
            System.out.println("data sudah ditambahkan"); 
            //mencetak output bagian ini jika data belum penuh
            }else{
            System.out.println("stack sudah penuh");   
            //mencetak output bagian ini jika data sudah penuh
            }
        return;  //mengembalikan nilai
        }
    public int pop(){  //method untuk mengambil Stack
        int x=0;  //variabel x=0 untuk menampung array dari item
        if (!isEmpty()){  //jika tidak kosong
            x=item[--pos];  //indeks item dikurangi
            full=false;  //kondisi full = false
            System.out.println("data yang di pop adalah "+item[pos]);
            //maka ditampilkan data berikut
            System.out.println(""); //membuat jarak kosong 1 baris
            item[pos]=0; 
            if(pos==0){  //jika pos=0
                empty=true; //maka empty=true 
                System.out.println("stack adalah kosong");
                //mencetak output bagian ini jika posisi = 0
            }else{
                System.out.println("data sudah diambil");
                //mencetak output
            }
        }else{
            System.out.println("stack masih kosong ! \n");
            //mencetak output jika Stack masih kosong
        }
        return(x); //mengembalikan nilai x yang tadi buat menampung array
    }
    public void display(){  //method untuk menampilkan Stack
        System.out.println("isi stack adalah");
        //mencetak output tulisan diatas
        for(int i=0; i<pos; i++){
        //perulangan(int i=0; i<pos; i++)
            System.out.println(item[i]+"");
            //mencetak output
        }
        System.out.println("\n");
        //menampilkan spasi 1 baris
    }
}
