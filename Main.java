public class Main {


    public static void main(String[] args) {
        short p = 25;
        short[] c = new short[12];
        for(short i=0; i<c.length;++i){
                c[i]=p;
                p-=2;
        }


        double[] x = new double[10];

        for(int i = 0; i < x.length; ++i) {
            x[i] = Math.random() * 11.0 - 7.0;
        }

        double[][] answer = new double[12][10];

        int i;
        int j;
        for(i = 0; i < answer.length; ++i) {
            for(j = 0; j < answer[i].length; ++j) {
                if (c[i] == 23) {
                    answer[i][j] = Math.pow((Math.cos(Math.cos(x[j])) - 1.0) / 3.0 / 4.0, 3.0);
                }

                if (c[i] != 9 && c[i] != 11 && c[i] != 13 && c[i] != 19 && c[i] != 21 && c[i] != 25) {
                    answer[i][j] = Math.asin(Math.sin(Math.pow(Math.pow((0.0 + x[j]) / 1.0 / 4.0 - 0.25, Math.pow(0.0 + x[j], x[j])), (Math.pow(0.5 / (1.0 - (4.0 - x[j]) / Math.PI), 3.0) + Math.PI) / Math.pow(Math.pow(Math.E, x[j]), 2.0))));
                }
                else {
                    answer[i][j] = Math.pow(Math.pow((Math.log(Math.abs(x[j])) - 2.0) / 1.0 / 4.0, Math.tan(x[j])), 3.0);
                }
            }
        }

        for(i = 0; i < answer.length; ++i) {
            for(j = 0; j < answer[i].length; ++j) {
                System.out.printf(" %5.2f ", answer[i][j]);
            }

            System.out.printf("%n");
        }

    }
}
