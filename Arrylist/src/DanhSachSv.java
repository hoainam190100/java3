
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachSv {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<String> nameSvlist= new ArrayList<>();
        System.out.println("Xin moi nhap lua chon");
        while (true) {
            System.out.println("1.Them sinh vien \n 2.Xoa sinh Vien \n 3.Sua sinh vien \n 4.In ra danh sach Sv \n 5. Quit");
            int selected = sc.nextInt();
            sc.nextLine();
            if(selected==5){
                break;
            }
            switch (selected) {
                case 1:
                    System.out.println("Nhap ten sinh vien");
                    String name = sc.nextLine();
                    while (!name.isEmpty()) {
                        System.out.println("Nhap ten sinh vien");
                        nameSvlist.add(name);
                        name=sc.nextLine();
                    }
                    break;
                case 2:
                    System.out.print("Ban Muon xoa Sv nao? ");
                    int indexRemove = sc.nextInt();
                    nameSvlist.remove(indexRemove);
                    for(int i=0;i<nameSvlist.size();i++){
                        nameSvlist.get(i);
                    }


                    break;
                case 3:
                    System.out.println("Input student name want update: ");
                    int findName = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Input student name update: ");
                    String updatedName = sc.nextLine();
                     nameSvlist.set(findName, updatedName);

                    for (String element : nameSvlist) {
                        System.out.println("List Name student " + element + " ");
                        continue;
                    }
                    break;
                case 4:
                    System.out.println("----Danh Sach sinh vien-----");
                    for (String nameSv:nameSvlist){
                        System.out.println(nameSv);
                    }

                    break;
            }
        }
    }
}
