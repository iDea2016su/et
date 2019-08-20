package Data;

import Correction.RangingCorrection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.lang.*;

public class ItemGroup {
    ArrayList group = new ArrayList<RFItem>();
    double angle = 0.0;
    String fileName;
    private boolean s1 = false;
    private boolean s2 = false;
    private boolean s3 = false;
    private boolean s4 = false;
    private double d1 = 0;
    private double d2 = 0;
    private double d3 = 0;
    private double d4 = 0;

    private void clear()
    {
        s1 = false;
        s2 = false;
        s3 = false;
        s4 = false;
        d1 = 0;
        d2 = 0;
        d3 = 0;
        d4 = 0;
    }
    private boolean getStatus()
    {
        if(s1&&s2&&s3&&s4)
            return true;
        return false;
    }

    public ItemGroup(String file)
    {
        fileName = file;
        try
        {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String temp;
            while((temp = in.readLine()) != null)
            {
                if(temp.contains("RF1"))
                {
                    String[] res = temp.split(":");
                    if(res.length==3) {
                        s1 = true;
                        d1 = Double.valueOf(res[2]);
                    }
                }
                if(temp.contains("RF2"))
                {
                    String[] res = temp.split(":");
                    if(res.length==3) {
                        s4 = true;
                        d4 = Double.valueOf(res[2]);
                        if (d1 > 0.1 && d4 > 0.1) {
                            if ((Math.abs(d4 - d1) < 30)) {
                                group.add(new RFItem(d1, d2, d3, d4));
                            }
                        }
                    }
                    clear();
                }
           // System.out.println(temp);
        }

        }catch (IOException e)
        {

        }
    }
    public int length()
    {
        return group.size();
    }
    public double getDelta41(int i)
    {
        RFItem rfItem = (RFItem) group.get(i);
        return rfItem.getDelta41();
    }
    public double getDelta42(int i)
    {
        RFItem rfItem = (RFItem) group.get(i);
        return rfItem.getDelta42();
    }
    public double getDelta43(int i)
    {
        RFItem rfItem = (RFItem) group.get(i);
        return rfItem.getDelta43();
    }
}
