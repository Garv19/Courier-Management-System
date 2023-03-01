import java.util.*;
public class ParcelsData {
    private Parcel[] parcels;
    private boolean check;
    private Scanner input = new Scanner(System.in);
    private Scanner input2 = new Scanner(System.in);
    public ParcelsData()
    {
        parcels = new Parcel[100];
    }
    public void addParcel(Parcel parcel)
    {

        for (int i = 0; i < 100; i++)
        {
            check = false;
            if (parcels[i] == null)
            {
                parcels[i] = parcel;
                check = true;
                break;
            }
        }
        if (check)
            System.out.println("Parcel added.");
        else
            System.out.println("No space to add Parcel.");
    }
    public void removeParcel(Parcel parcel)
    {
        for (int i = 0; i < 100; i++)
        {
            if (parcels[i] == parcel)
            {
                parcels[i] = null;
                break;
            }
        }
    }
    public Parcel createParcel()
    {
        String catagory = selectCatagory();
        String hub = selectHub();
        String destination = selectDestination();
        String estimatdDeliveryDate;
        System.out.print("Enter Estimatd Delivery Date - ");
        estimatdDeliveryDate = input.nextLine();
        Boolean confirmation = confirm();
        Double aproxweight;
        int quantity;
        int protectiveLayer;
        Sender sender;
        Reciver reciver;
        if (confirmation)
        {
            System.out.println("Confirmed.");
            System.out.print("Enter Aprox Weight - ");
            aproxweight = input2.nextDouble();
            Clear.cls();
            System.out.print("Enter Quantity - ");
            quantity = input2.nextInt();
            Clear.cls();
            System.out.print("Enter how many protectiveLayers - ");
            protectiveLayer = input2.nextInt();
            Clear.cls();
            sender = createSender();
            reciver = createReciver();
        }
        else
        {
            System.out.println("Cancelled.");
            return null;
        }
        return (new Parcel(destination,estimatdDeliveryDate,confirmation,aproxweight,catagory,quantity,hub,protectiveLayer,sender, reciver));
    }

    private String selectCatagory()
    {
        System.out.println("1.Refrigerator.\n2.Air condition.\n3.Bike.\n4.Mobile phone.\n5.Speaker.\n6.Tv.\n7.Laptop.\n8.Others.");
        int select = 0;
        try {
            select = input2.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input.");
        }
        Clear.cls();
        if (select == 1)
            return "Refrigerator";
        else if (select == 2)
            return "Air condition";
        else if (select == 3)
            return "Bike";
        else if (select == 4)
            return "Mobile phone";
        else if (select == 5)
            return "Speaker";
        else if (select == 6)
            return "Tv";
        else if (select == 7)
            return "Laptop";
        else if (select == 8)
            return "Others";
        else
            return "Unknown";
    }

    private String selectDestination()
    {
        System.out.println("1.Inside GreNo.\n2.Outside GreNo.");
        String destination;
        int select = 0;
        try {
            select = input2.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input.");
        }
        Clear.cls();
        if (select == 1)
        {
            System.out.print("Enter destination - ");
            destination = input.nextLine();
            Clear.cls();
            return destination;
        }
        else if (select == 2)
            return "According to Hub.";
        return "Unknown";
    }

    public Sender createSender()
    {
        String name;
        String address;
        String mobile;
        System.out.println("Sender name - ");
        name = input.nextLine();
        System.out.println("Sender address - ");
        address = input.nextLine();
        System.out.println("Sender mobile - ");
        mobile = input.nextLine();
        Clear.cls();
        return (new Sender(name, address, mobile));
    }

    private Reciver createReciver()
    {
        String name;
        String address;
        String mobile;
        System.out.print("Recivers name - ");
        name = input.nextLine();
        System.out.print("Recivers address - ");
        address = input.nextLine();
        System.out.print("Recivers mobile - ");
        mobile = input.nextLine();
        Clear.cls();
        return (new Reciver(name, address, mobile));
    }

    private String selectHub()
    {
        System.out.println("1.Noida.\n2.Gaziabad.\n3.Chandni Chowk.\n4.Anand Vihar.\n5.Mayur Vihar.\n6.Rajiv Chowk.\n7.Rajendra Nagar.\n8.Nehru Place.\n9.Pari Chowk.\n10.Faridabad.\n11.Gurugram.\n12.Kashmere Gate.\n13.Preet Vihar.\n14.Dwarka.\n15.Indira Port.\n16.RK Puram.\n17.Moti Nagar.\n18.Udyog Bhawan.\n19.Qutab Minar.\n20.Khan Market.");
        int select = 0;
        try {
            select = input2.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input.");
        }
        Clear.cls();
        if (select == 1)
            return "Noida";
        else if (select == 2)
            return "Gaziabad";
        else if (select == 3)
            return "Chandni Chowk";
        else if (select == 4)
            return "Anand Vihar";
        else if (select == 5)
            return "Mayur Vihar";
        else if (select == 6)
            return "Rajiv Chowk";
        else if (select == 7)
            return "Rajendra Nagar";
        else if (select == 8)
            return "Nehru Place";
        else if (select == 9)
            return "Pari Chowk";
        else if (select == 10)
            return "Faridabad";
        else if (select == 11)
            return "Gurugram";
        else if (select == 12)
            return "Kashmere Gate";
        else if (select == 13)
            return "Preet Vihar";
        else if (select == 14)
            return "Dwarka";
        else if (select == 15)
            return "Indira Port";
        else if (select == 16)
            return "RK Puram";
        else if (select == 17)
            return "Moti Nagar";
        else if (select == 18)
            return "Udyog Bhawan";
        else if (select == 19)
            return "Qutab Minar";
        else if (select == 20)
            return "Khan Market";
        else
            return "Unknown";
    }

    public boolean confirm()
    {
        System.out.println("1.Confirm.\n2.Cancel.");
        int select = 0;
        try {
            select = input2.nextInt();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Invalid Input.");
        }
        Clear.cls();
        if (select == 1)
            return true;
        else
            return false;
    }

    public void showUnconfirmedParcels()
    {
        for (Parcel parcel : parcels)
        {
            int index = 1;
            if (parcel != null && (!parcel.getTrack().equals("Picked")))
            {
                System.out.println(index + ". Sender name - " + parcel.getSender().getName() +
                        " Reciver name - " + parcel.getReciver().getName() + "\n Hub - " + parcel.getHub() +
                        " Destination - " + parcel.getDestination() + "\n Catagory - " + parcel.getCatagory() +
                        " Approx Weight - " + parcel.getAproxweight() + "\n Estimated Delivery Date - " + parcel.getEstimatdDeliveryDate());
            }
        }
    }

    public void findAndShowParcelDetails(String senderName, String senderMobile)
    {
        for (Parcel parcel : parcels)
        {
            if (parcel != null)
            {
                if (parcel.getSender().getName().equals(senderName) && parcel.getSender().getMobile().equals(senderMobile))
                {
                    System.out.println(parcel.getTrack());
                }
            }
        }
    }

    public Parcel confirmParcel(int index)
    {
        int i = 1;
        for (Parcel parcel : parcels)
        {
            if (i == index && parcel != null)
            {
                parcel.setTrack("Picked");
                System.out.println("Confirmed");
                return parcel;
            }
            else
                i++;
        }
        System.out.println("No parcel found at index.");
        return null;
    }

    public Parcel[] getParcels()
    {
        return parcels;
    }
}