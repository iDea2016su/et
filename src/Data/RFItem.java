package Data;

import Correction.RangingCorrection;

public class RFItem {
    private int antenna = 0;
    private int validNum = 0;
    private double median = 0.0;
    private double[] result = new double[40];

    public RFItem(int antenna,double[] data) {
        this.antenna = antenna;
        int len = data.length;
        if (len != 40) {
            System.out.println("RFItem Data Length is " + len + "not 40 error");
        }
        for (int i = 0; i < 40; i++)
        {
            if(data[i] !=0)
            {
                result[i] = RangingCorrection.ComputeRangingCorrectionPolynome(5,1600,data[i]);
            }
            else
            {
                result[i] = 0;
            }
        }
        double[] sortArr = sort(result);
        double[] med = new double[40];
        for(int i=0;i<40;i++)
        {
            if((sortArr[i]>0)&&(sortArr[i]<=20))
            {
                med[validNum] = sortArr[i];
                validNum ++;
            }
        }
        if(validNum%2==0)
        {
            median = (med[validNum/2-1] + med[validNum/2])/2;
        }
        else
        {
            int t = (validNum)/2;
            median = med[t];
        }


    }
    public int getValidNum()
    {
        return validNum;
    }
    public double getMedian()
    {
        return median;
    }
    public int getAntenna()
    {
        return antenna;
    }
    public double getResult(int index)
    {
        return result[index];
    }
    private double[] sort(double[] arr)
    {
        double[] res = new double[40];
        for(int i=0;i<40;i++)
        {
            res[i] = arr[i];
        }
        for(int i=0;i<40;i++) {
            for (int j = i + 1; j < 40; j++)
            {
                if(res[i]>res[j])
                {
                    double temp = res[i];
                    res[i] = res[j];
                    res[j] = temp;
                }
            }
        }
        return res;
    };
}
