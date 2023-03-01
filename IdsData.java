import java.util.*;
public class IdsData {
    Id[] ids;
    Scanner input = new Scanner(System.in);
    Scanner input2 = new Scanner(System.in);
    public IdsData()
    {
        ids = new Id[20];
    }

    public void addId(Id id)
    {
        for (int i = 0; i < 10; i++)
        {
            if (ids[i] == null)
            {
                ids[i] = id;
                break;
            }
        }
    }

    public Delboy createDelboy()
    {
        String name;
        String address;
        String mobile;
        int age;
        String mail;
        String password;
        System.out.print("Delboy's name - ");
        name = input.nextLine();
        System.out.print("Delboy's address - ");
        address = input.nextLine();
        System.out.print("Delboy's mobile - ");
        mobile = input.nextLine();
        System.out.print("Delboy's age - ");
        age = input2.nextInt();
        System.out.print("Delboy's mail - ");
        mail = input.nextLine();
        System.out.print("Delboy's password - ");
        password = input.nextLine();
        return (new Delboy(name, address, mobile, age, mail, password));
    }

    public Admin createAdmin()
    {
        String name;
        String address;
        String mobile;
        int age;
        String mail;
        String password;
        System.out.print("Admins name - ");
        name = input.nextLine();
        System.out.print("Admins address - ");
        address = input.nextLine();
        System.out.print("Admins mobile - ");
        mobile = input.nextLine();
        System.out.print("Admins age - ");
        age = input2.nextInt();
        System.out.print("Admins mail - ");
        mail = input.nextLine();
        System.out.print("Admins password - ");
        password = input.nextLine();
        return (new Admin(name, address, mobile, age, mail, password));
    }

    public Delboy findDelboy(String mail, String password)
    {
        for (Id id : ids)
        {
            if (id != null)
            {
                if (id instanceof Delboy)
                {

                    if (id.getMail().equals(mail) && id.getPassword().equals(password))
                        return (Delboy)id;
                }
            }
        }
        System.out.println("Invalid mail or password.");
        return null;
    }

    public Admin findAdmin(String mail, String password)
    {
        for (Id id : ids)
        {
            if (id != null)
            {
                if (id instanceof Admin)
                {

                    if (id.getMail().equals(mail) && id.getPassword().equals(password))
                        return (Admin)id;
                }
            }
        }
        System.out.println("Invalid mail or password.");
        return null;
    }

    public void showDelboys()
    {
        for (Id id : ids)
        {
            if (id != null)
            {
                if (id instanceof Delboy)
                {
                    id.showInfo();
                }
            }
        }
    }
}