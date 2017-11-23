package SixSong;

public class SongPlayer {

    static int count =0;


    static SongPlayer[] arr = new SongPlayer[10];


    String fname;
    String laname;

    SongPlayer(){

    }

    public SongPlayer(String fname, String laname) {
        this.fname = fname;
        this.laname = laname;
    }

    void  addToalbum(SongPlayer ob){

        arr[count] = new SongPlayer();
        arr[count] = ob;
        count++;
//        System.out.println(arr[0].fname);

    }

    void showlist(){

       // System.out.println(arr[0].fname);

        for(int i =0; i<count; i++){

            System.out.println(arr[i].fname +"  "+arr[i].laname);

        }
    }
}
