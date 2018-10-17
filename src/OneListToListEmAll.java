import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class OneListToListEmAll {




        public static void main(String[] args)
        {

            int[] chunckList = new int[5];

            chunckList[0] = 123;
            chunckList[1] = 55;
            chunckList[2] = 9999;
            chunckList[3] = 7655;
            chunckList[4] = 331;

            int[] getallenReeks = { 4, 856, 123,42, 90 };

            System.out.println( Arrays.toString(getallenReeks));

            getallenReeks = Arrays.copyOf(getallenReeks, getallenReeks.length + 1);

            Scanner scan = new Scanner(System.in);

            getallenReeks[getallenReeks.length - 1] = scan.nextInt();

            System.out.println( Arrays.toString(getallenReeks));

        }
    }

