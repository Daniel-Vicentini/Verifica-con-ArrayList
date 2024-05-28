import java.util.ArrayList;
public class MagazzinoSmartphone {
    private ArrayList <Smartphone> smartphones;
    private int count;

    public MagazzinoSmartphone() {
        smartphones = new ArrayList <Smartphone>(10); // Assuming initial capacity of 10
        count = 0;
    }

    public MagazzinoSmartphone(MagazzinoSmartphone other) {
        for(int i=0; i<other.smartphones.size();i++){
            if(smartphones.get(i)!=null){
                smartphones.set(i,other.smartphones.get(i));
            }
        }

    }


    public void addSmartphone(Smartphone smartphone) {
        smartphones.add(smartphone);

        
    }

    public void removeSmartphone(Smartphone smartphone) {
        smartphones.remove(smartphone);
    }

    public ArrayList <Smartphone> getSmartphonesArray() {
        ArrayList <Smartphone> smartphoneArray = new ArrayList<Smartphone>(smartphones.size());
        System.arraycopy(smartphones, 0, smartphoneArray, 0, smartphones.size());
        return smartphoneArray;
    }


    public Smartphone getSmartphoneByBrand(String brand) {
        Smartphone smartphone = null;
        int posizione=0;
        boolean trovato=false;
        while( trovato==false && posizione<smartphones.size()){
            if(smartphones.get(posizione).getBrand()==null){
                return null;
            }else{
                if(smartphones.get(posizione).getBrand().equals(brand)){
                    trovato=true;
                }
            }posizione++;
        }
        if(trovato==true){
            return smartphone=smartphones.get(posizione-1);
        }else{
            return null;
        }
    }

    public MagazzinoSmartphone getSmartphonesByStorageCapacity(int storageCapacity) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();
        int posizione;
        boolean trovato=false;
        for(posizione=0;posizione<smartphones.size();posizione++){
            while(trovato==false && posizione<smartphones.size()){
                if(smartphones.get(posizione).getStorageCapacity()==storageCapacity){
                    trovato=true;
                }posizione++;
            }
        }
        if(trovato==true){
            return magazzinoSmartphone.smartphones.add(smartphones.get(posizione-1));
        }


        
    }

    public MagazzinoSmartphone getSmartphonesByPriceRange(double minPrice, double maxPrice) {
        MagazzinoSmartphone magazzinoSmartphone = new MagazzinoSmartphone();

        return magazzinoSmartphone;
    }

    @Override
    public String toString() {
        String result = " ";
        for(int posizione=0; posizione<smartphones.size();posizione++){
            result+=smartphones.get(posizione).toString()+"/n";
            return result;
        }

        return result;
    }

    public int getCount() {
        return count;
    }

    public boolean equals(Object obj) {
       

        return true;
    }


}