import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Client {
    public String name;
    public List <Parcel> listOfSentParcels;
    public List <Parcel> listOfReceivedParcels;

    public Client(String name) {
        this.name = name;
        listOfReceivedParcels = new ArrayList();
        listOfSentParcels = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public List<Parcel> getListOfSentParcels() {
        return listOfSentParcels;
    }

    public List<Parcel> getListOfReceivedParcels() {
        return listOfReceivedParcels;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSentParcel (Parcel sentParcel){listOfSentParcels.add(sentParcel);}
    public void addReceivedParcel (Parcel receivedParcel){listOfReceivedParcels.add(receivedParcel);}

    public void displaySentParcels() {
        if (listOfSentParcels.isEmpty()) {
            System.out.println("There aren't any sent parcels.");
        } else {
            Iterator<Parcel> iterator = listOfSentParcels.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next() + " ");
            }
        }
    }

    public void displayReceivedParcels() {
        if (listOfReceivedParcels.isEmpty()) {
            System.out.println("There aren't any received parcels.");
        } else {
            Iterator<Parcel> iterator = llistOfReceivedParcels.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next() + " ");
            }
        }
    }
}
