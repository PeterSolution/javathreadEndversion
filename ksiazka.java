import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ksiazka {
    public ksiazka(){
    }

    private final Object lock=new Object();

    String kolej="czytelnicy";

    String txt="aaa";

    int kolejliczba=0;

    int kolejkapisarzy=0;
    int iloscpisarzy=0;
    int liczbaczytelnikow=0;


    boolean stop=false;



    public void write(String text,int id){
        kolej="czytelnicy";
        stop=true;

        kolejkapisarzy = 1;

        while(kolejliczba!=id){

        }
        kolejliczba++;
        iloscpisarzy++;


        txt = text;
        iloscpisarzy--;
        kolejkapisarzy = 0;
        stop=false;

    }

    public String read(){
        liczbaczytelnikow++;
        while (stop==true){

        }

        if(kolej=="czytelnicy"){
            liczbaczytelnikow--;

            return txt;
        }
        else{
            while (kolej!="czytelnicy"){

            }
            liczbaczytelnikow--;

            return txt;
        }


    }


    public String getKolej() {
        return kolej;
    }

    public int getIloscpisarzy() {
        return iloscpisarzy;
    }

    public int getKolejkapisarzy(){
        return kolejkapisarzy;
    }

    public int getLiczbaczytelnikow() {
        return liczbaczytelnikow;
    }

}
