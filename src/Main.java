import Correction.RangingCorrection;
import Data.RFItem;

import java.io.*;

public class Main {
    public static void main (String[] argc)
    {
        double[] test =
                {
                        -10,
                        25,
                        33,
                        2,
                        4,
                        19,
                        150,
                        30,
                        0,
                        12,
                        11,
                        13,
                        14,
                        12,
                        13,
                        13,
                        12,
                        13,
                        56,
                        10,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0,
                        0
                };
        RFItem rfItem = new RFItem(1,test);
        System.out.println("system start"+ 4/2);

        for(int i=0;i<40;i++) {
            double dis = RangingCorrection.ComputeRangingCorrectionPolynome(5, 1600, test[i]);
            System.out.println("test dis " + dis);
        }

//        try
//        {
//            BufferedReader in = new BufferedReader(new FileReader("temp/0.txt"));
//            String temp;
//            while((temp = in.readLine()) != null)
//            {
//                    System.out.println(temp);
//            }
//
//        }catch (IOException e)
//        {
//
//        }
        System.out.println("system finish");
    }
}
