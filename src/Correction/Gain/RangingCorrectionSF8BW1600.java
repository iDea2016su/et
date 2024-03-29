package Correction.Gain;

import Correction.RangingCorrectionPolynomes_t;

public class RangingCorrectionSF8BW1600 {
    private static double[] cer = {
            7.2578e-10,
            -2.8033e-07,
            3.8153e-05,
            -0.0022174,
            0.053196,
            0.45123,
            1.0199,
    };
    private static RangingCorrectionPolynomes_t polynomes_t = new RangingCorrectionPolynomes_t(7,cer);
    public static RangingCorrectionPolynomes_t getPolynomes_t()
    {
        return polynomes_t;
    }
    private static double[] array =
            {
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -14.2767,
                    -8.9895,
                    -3.7596,
                    -2.043,
                    -0.57812,
                    2.7521,
                    6.0823,
                    7.0208,
                    5.6017,
                    5.7619,
                    6.5859,
                    6.5973,
                    5.3156,
                    3.4388,
                    2.3859,
                    3.8164,
                    3.5189,
                    3.4845,
                    4.2971,
                    3.7935,
                    3.3815,
                    3.4845,
                    3.5189,
                    3.5875,
                    3.3815,
                    3.1755,
                    2.9581,
                    3.0611,
                    3.0153,
                    2.9009,
                    2.8093,
                    3.5875,
                    3.3815,
                    2.7864,
                    2.7407,
                    2.672,
                    2.7864,
                    2.6949,
                    2.7178,
                    2.6949,
                    2.7407,
                    2.7864,
                    2.7636,
                    2.7864,
                    2.8322,
                    2.878,
                    3.702,
                    3.6562,
                    3.3358,
                    3.702,
                    3.3815,
                    3.6562,
                    3.9309,
                    3.8164,
                    4.0911,
                    4.4229,
                    4.6862,
                    4.6175,
                    4.7548,
                    4.9837,
                    6.5401,
                    6.0366,
                    5.4644,
                    5.9679,
                    7.4671,
                    5.6475,
                    5.121,
                    5.0295,
                    5.9221,
                    7.6845,
                    7.3183,
                    6.7003,
                    7.9363,
                    6.9979,
                    6.8834,
                    8.2338,
                    8.1423,
                    8.5085,
                    8.1194,
                    7.8676,
                    8.0278,
                    7.7761,
                    8.4398,
                    8.2567,
                    8.2338,
                    8.5543,
                    8.6,
                    8.5772,
                    8.8175,
                    9.1036,
                    8.8976,
                    8.8747,
                    9.1722,
                    9.1494,
                    9.63,
                    9.6071,
                    9.836,
                    10.0763,
                    9.7673,
                    9.8818,
                    9.7788,
                    9.7673,
                    9.7444,
                    9.8818,
                    9.9504,
                    9.9962,
                    10.1107,
                    10.042,
                    10.042,
                    10.2137,
                    10.0878,
                    9.9276,
                    10.1107,
                    9.5156,
                    9.0464,
                    9.3296,
                    9.6128,
                    9.8961,
                    10.1793,
                    10.1335,
                    8.2796,
                    8.169,
                    8.0584,
                    7.9477,
                    7.9477,
            };
    public static double run(int gain)
    {
        return array[gain];
    }
}
