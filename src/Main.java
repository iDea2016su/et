import Correction.RangingCorrection;
import Data.ItemGroup;
import Data.RFItem;

import java.io.*;

public class Main {
    public static void main (String[] argc)
    {
        ItemGroup[] itemGroups = new ItemGroup[19];
        itemGroups[0] = new ItemGroup("0-b.txt");
        itemGroups[1] = new ItemGroup("10-b.txt");
        itemGroups[2] = new ItemGroup("20-b.txt");
        itemGroups[3] = new ItemGroup("30-b.txt");
        itemGroups[4] = new ItemGroup("40-b.txt");
        itemGroups[5] = new ItemGroup("50-b.txt");
        itemGroups[6] = new ItemGroup("60-b.txt");
        itemGroups[7] = new ItemGroup("70-b.txt");
        itemGroups[8] = new ItemGroup("80-b.txt");
        itemGroups[9] = new ItemGroup("90-b.txt");
        itemGroups[10]= new ItemGroup("100-b.txt");
        itemGroups[11] = new ItemGroup("110-b.txt");
        itemGroups[12] = new ItemGroup("120-b.txt");
        itemGroups[13] = new ItemGroup("130-b.txt");
        itemGroups[14] = new ItemGroup("140-b.txt");
        itemGroups[15] = new ItemGroup("150-b.txt");
        itemGroups[16] = new ItemGroup("160-b.txt");
        itemGroups[17] = new ItemGroup("170-b.txt");
        itemGroups[18] = new ItemGroup("180-b.txt");

          long len = 0;
          double[] avr = new double[19];
          for(int i=0;i<19;i++)
          {
              len = itemGroups[i].length();
              //System.out.println("i:"+len);
              double sum = 0;
              for(int j=0;j<len;j++)
              {
                  double t = itemGroups[i].getDelta41(j);
//
               //   System.out.println(""+t);
                  sum += t;
              }
              sum = sum / len;
              avr[i] = sum;
          }
        for(int i=0;i<19;i++) {
          System.out.println(""+avr[i]);
        }
    }
}
