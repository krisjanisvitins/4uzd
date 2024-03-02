// 231RDB085 Krišjānis Vītiņš 14. grupa

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  public static void main(String[] args) throws IOException {
    System.out.println("231RDB085 Krišjānis Vītiņš 14. grupa");

    Scanner sc = new Scanner(System.in);
    System.out.println("input file name: ");
    String fileName = sc.nextLine();

    sc.close();

    FileReader fr = new FileReader(fileName);
    sc = new Scanner(fr);

    System.out.println("result:");

    //String str;

    while (sc.hasNext()) {
        if (sc.hasNextLine()) {
          String str = sc.nextLine();
          String[] string = str.split(" ");
  
          int atzimesSum = 0;
          int nesekmigas = 0;
          int cipari = 0;
  
          for (String dala : string){
            if (Character.isDigit(dala.charAt(0))){
              break;
            }
            cipari++;
          }
          
          for (int i=cipari; i<string.length; i++) {
            int atzime = Integer.parseInt(string[i]);
            atzimesSum += atzime;
            if (atzime < 4) {
              nesekmigas++;
          }
            }
  
          double videjaAtzime = (double) atzimesSum / (string.length - cipari);
  
          if (videjaAtzime <=5) {
            String vards = String.join(" ", java.util.Arrays.copyOfRange(string, 0, cipari));
            System.out.println(vards + " " + nesekmigas);

          }

        }

      }
      sc.close();
      fr.close();
    }
  }
  
    // nolasīt failu

    // ievadīto no tastatūras faila nosaukumu fileName nemodificēt, 
    // nepievienot mapes vārdu, nepievienot tipu txt

    // izvadīt rezultātus	

  


  