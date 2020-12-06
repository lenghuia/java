
import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Method {
    public void studentchangesert() throws IOException {//改
        FileReader reader = new FileReader("src\\Data\\User.txt");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<User> userlist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String password = part[1];
            int type = Integer.parseInt(part[2]);
            String name = part[3];
            String unit = part[4];
            String telephone = part[5];
            int count = Integer.parseInt(part[6]);
            User user = new User(id, password, type, name, unit, telephone, count);
            userlist.add(user);
        }
        Scanner a = new Scanner(System.in);
        String ID = a.next();
        String name2 = a.next();
        for (i = 0; i < userlist.size(); i++) {
            User user1 = userlist.get(i);
            if (ID.equals(user1.getId())) {
                flag = 1;
                user1.setName(name2);
                userlist.remove(i);
                userlist.add(i, user1);
                break;
            }
        }
        if (flag != 1) {
            System.out.println("该用户未找到");
        }
        System.out.println("danflad1");
        if (flag == 1) {
            FileWriter ot = new FileWriter("src\\Data\\User.txt");
            BufferedWriter out = new BufferedWriter(ot);
            for (i = 0; i < userlist.size(); i++) {
                User user12 = userlist.get(i);
                out.write(user12.getId() + " " + user12.getPassword() + " " + user12.getType() + " " + user12.getName() + " " + user12.getUnit() + " " + user12.getTelephone() + " " + user12.getCount() + "\n");
                out.flush();
            }
        }
    }

    public void studentoutsert() throws IOException {//删

        FileReader reader = new FileReader("src\\Data\\User.txt");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<User> userlist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String password = part[1];
            int type = Integer.parseInt(part[2]);
            String name = part[3];
            String unit = part[4];
            String telephone = part[5];
            int count = Integer.parseInt(part[6]);
            User user = new User(id, password, type, name, unit, telephone, count);
            userlist.add(user);
        }
        Scanner a = new Scanner(System.in);
        String ID = a.next();//输进来id号
        for (i = 0; i < userlist.size(); i++) {
            User user1 = userlist.get(i);
            if (ID.equals(user1.getId())) {
                flag = 1;
                continue;
            }
        }
        if (flag != 1) {
            System.out.println("该用户未找到");
        }
        System.out.println("该用户找到了");
        if (flag == 1) {
            FileWriter ot = new FileWriter("src\\Data\\User.txt");
            BufferedWriter out = new BufferedWriter(ot);
            for (i = 0; i < userlist.size(); i++) {
                User user12 = userlist.get(i);
                out.write(user12.getId() + " " + user12.getPassword() + " " + user12.getType() + " " + user12.getName() + " " + user12.getUnit() + " " + user12.getTelephone() + " " + user12.getCount() + "\n");
                out.flush();
            }
        }
    }

    public void studentinsert() throws IOException {//增
        FileReader reader = new FileReader("src\\Data\\User.txt");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<User> userlist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String password = part[1];
            int type = Integer.parseInt(part[2]);
            String name = part[3];
            String unit = part[4];
            String telephone = part[5];
            int count = Integer.parseInt(part[6]);
            User user = new User(id, password, type, name, unit, telephone, count);
            userlist.add(user);
        }
        Scanner a = new Scanner(System.in);
        String id = a.next();//输进来id号
        String password = a.next();
        int type = Integer.parseInt(a.next());
        String name = a.next();
        String unit = a.next();
        String telephone = a.next();
        int count = Integer.parseInt(a.next());
        User u = new User(id, password, type, name, unit, telephone, count);
        userlist.add(u);
        FileWriter ot = new FileWriter("src\\Data\\User.txt");
        BufferedWriter out = new BufferedWriter(ot);
        for (i = 0; i < userlist.size(); i++) {
            User user12 = userlist.get(i);
            out.write(user12.getId() + " " + user12.getPassword() + " " + user12.getType() + " " + user12.getName() + " " + user12.getUnit() + " " + user12.getTelephone() + " " + user12.getCount() + "\n");
            out.flush();
        }
    }

    public void studentfindsert() throws IOException {//查

        FileReader reader = new FileReader("src\\Data\\User.txt");
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<User> userlist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String password = part[1];
            int type = Integer.parseInt(part[2]);
            String name = part[3];
            String unit = part[4];
            String telephone = part[5];
            int count = Integer.parseInt(part[6]);
            User user = new User(id, password, type, name, unit, telephone, count);
            userlist.add(user);
        }
        Scanner a = new Scanner(System.in);
        String ID = a.next();//输进来id号
        for (i = 0; i < userlist.size(); i++) {
            User user1 = userlist.get(i);
            if (ID.equals(user1.getId())) {
                flag = 1;
                break;
            }
        }
        if (flag != 1) {
            System.out.println("该用户未找到");
        } else {
            System.out.println("该用户找到了");
            User user1=userlist.get(i);
            System.out.println(user1.getId() + " " + user1.getPassword() + " " + user1.getType() + " " + user1.getName() + " " + user1.getUnit() + " " + user1.getTelephone() + " " + user1.getCount() + "\n");
        }
    }
    //书
    public void bookchangesert() throws IOException {//改
        FileReader reader = null;
        try {
            reader = new FileReader("src\\Data\\Book.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<Book1> booklist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String bookname = part[1];
            String name = part[2];
            String unit = part[3];
            int count = Integer.parseInt(part[4]);
            Book1 book = new Book1(id,bookname,name,unit,count);
            booklist.add(book);
        }
        Scanner a = new Scanner(System.in);
        String id=a.next();
        for (i = 0; i < booklist.size(); i++) {
            Book1 book1 = booklist.get(i);
            if (id.equals(book1.getId())) {
                flag = 1;
                book1.setId(id);
                booklist.remove(i);
                booklist.add(i,book1);
                break;
            }
        }
        if (flag != 1) {
            System.out.println("该书籍未找到");
        }
        System.out.println("danflad1");
        if (flag == 1) {
            FileWriter ot = new FileWriter("src\\Data\\Book.txt");
            BufferedWriter out = new BufferedWriter(ot);
            for (i = 0; i < booklist.size(); i++) {
                Book1 book2 = booklist.get(i);
                out.write(book2.getId() + " " + book2.getBookname() + " " + book2.getName() + " " + book2.getUnit() + " " + book2.getCount() + "\n");
                out.flush();
            }
        }
    }
    public void bookfindsert() throws IOException {//查
        FileReader reader = null;
        try {
            reader = new FileReader("src\\Data\\Book.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<Book1> booklist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String bookname = part[1];
            String name = part[2];
            String unit = part[3];
            int count = Integer.parseInt(part[4]);
            Book1 book = new Book1(id,bookname,name,unit,count);
            booklist.add(book);
        }
        Scanner a = new Scanner(System.in);
        String id=a.next();
        for (i = 0; i < booklist.size(); i++) {
            Book1 book2 = booklist.get(i);
            if (id.equals(book2.getId())) {
                flag = 1;
                System.out.println(book2.getId() + " " + book2.getBookname() + " " + book2.getName() + " " + book2.getUnit() + " " + book2.getCount() + "\n");
                break;
            }
        }
        if (flag != 1) {
            System.out.println("该书籍未找到");
        }
    }
    public void bookfoutdsert() throws IOException {//删
        FileReader reader = null;
        try {
            reader = new FileReader("src\\Data\\Book.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 0;
        int i;
        List<Book1> booklist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String bookname = part[1];
            String name = part[2];
            String unit = part[3];
            int count = Integer.parseInt(part[4]);
            Book1 book = new Book1(id,bookname,name,unit,count);
            booklist.add(book);
        }
        Scanner a = new Scanner(System.in);
        String id=a.next();
        for (i = 0; i < booklist.size(); i++) {
            Book1 book2 = booklist.get(i);
            if (id.equals(book2.getId())) {
                flag = 1;
                booklist.remove(i);
                break;
            }
        }
        if (flag != 1) {
            System.out.println("该书籍未找到");
        }
    }
    public void bookinsert() throws IOException {//增
        FileReader reader = null;
        try {
            reader = new FileReader("src\\Data\\Book.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(reader);
        String str = null;
        int flag = 1;
        int i;
        List<Book1> booklist = new LinkedList();
        while ((str = br.readLine()) != null) {
            String[] part = str.split(" ");
            String id = part[0];
            String bookname = part[1];
            String name = part[2];
            String unit = part[3];
            int count = Integer.parseInt(part[4]);
            Book1 book = new Book1(id,bookname,name,unit,count);
            booklist.add(book);
        }
        Scanner a = new Scanner(System.in);
        String id=a.next();
        String bookname=a.next();
        String name=a.next();
        String unit=a.next();
        int count=Integer.parseInt(a.next());
        Book1 book=new Book1(id,bookname,name,unit,count);
        booklist.add(book);
        if (flag == 1) {
            FileWriter ot = new FileWriter("src\\Data\\Book.txt");
            BufferedWriter out = new BufferedWriter(ot);
            for (i = 0; i < booklist.size(); i++) {
                Book1 book2 = booklist.get(i);
                out.write(book2.getId() + " " + book2.getBookname() + " " + book2.getName() + " " + book2.getUnit() + " " + book2.getCount() + "\n");
                out.flush();
            }
        }
    }
}