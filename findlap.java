import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class findlap{
    public static void main(String[] args) {
        
        notebook  note1 = new notebook("Redmi G 2022",3456,"Xiaomi");
        note1.setColor("black");
        note1.setHDD(512);
        note1.setOS("Windows 11");
        note1.setRAM(16);
        
        notebook note2 = new notebook("Mi Notebook Pro X",6899,"Xiaomi");
        note2.setColor("gray");
        note2.setHDD(1000);
        note2.setOS("Windows 10");
        note2.setRAM(32);

        notebook note3 = new notebook("Aspire V3-571G",3425,"Acer");
        note3.setColor("black");
        note3.setHDD(700);
        note3.setOS("Windows 8");
        note3.setRAM(6);

        notebook note4 = new notebook("ROG Zephyrus M16",1223,"ASUS");
        note4.setColor("black");
        note4.setHDD(2000);
        note4.setOS("Windows 11");
        note4.setRAM(32);

        notebook note5 = new notebook("MacBook Pro 14 2023 M2 Max",5476,"Apple");
        note5.setColor("silver");
        note5.setHDD(8000);
        note5.setOS("macOS");
        note5.setRAM(96);

        HashSet <notebook> notbooks = new HashSet<>(Arrays.asList(note1,note2,note3,note4,note5));
        HashSet <notebook> res = new HashSet<>();

        System.out.print("Введите цифру критерия: \n 1 - RAM \n 2 - Объем HDD \n 3 - Операционная система \n 4 - Цвет \n или 5 - Искать\n");
        Scanner scan = new Scanner(System.in);
        Integer number = scan.nextInt();
        scan.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(number != 5){
        if(number == 1){
            System.out.println("Введите минимальную RAM");
            Integer temp = scan.nextInt();
            scan.nextLine();
            filters.put("RAM", temp);
        }
        if(number == 2){
            System.out.println("Введите минимальный объем HDD" );
            Integer temp = scan.nextInt();
            scan.nextLine();
            filters.put("HDD", temp);
        }
        if(number == 3){
            System.out.println("Введите OS");
            String temp = scan.nextLine();
            filters.put("OS", temp);
        }
        if(number == 4){
            System.out.println("Введите цвет");
            String temp = scan.nextLine();
            filters.put("color", temp);
        }
        System.out.print("Введите цифру критерия: \n 1 - RAM \n 2 - Объем HDD \n 3 - Операционная система \n 4 - Цвет \n или 5 - Искать\n");
        number = scan.nextInt();
        scan.nextLine();
    }
        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator it = notbooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook) it.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                }
            }
             if(entry.getKey().equals("HDD")){
                Iterator it = notbooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook)it.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        res.add(lap);
                        }
                }
            }
            if(entry.getKey().equals("OS")){
                Iterator it = notbooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook)it.next();
                        if(lap.getOS().equals(entry.getValue())){
                            res.add(lap);
                        }
                }
            }
            if(entry.getKey().equals("color")){
                Iterator it = notbooks.iterator();
                while(it.hasNext()){
                    notebook lap = (notebook)it.next();
                        if(lap.getColor().equals(entry.getValue())){
                            res.add(lap);
                        }
                }
            }
        }
        
            Iterator it = res.iterator();
            while(it.hasNext()){
                notebook lap = (notebook)it.next();
            System.out.println(lap.toString());
            System.out.println();
        }
        
        
    }
}