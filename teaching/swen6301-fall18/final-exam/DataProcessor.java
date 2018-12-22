public class DataProcessor extends Formula1 {
    // team, car, sensor
    public double[][][] data;
    public double[][] limit;

    // constructor
    public DataProcessor(double[][][] data, double[][] limit) {
        this.data = data;
        this.limit = limit;
    }

    // calculates average of sensor data
    private double average(double[] array) {
        int i = 0;
        double val = 0;
        for (i = 0; i < array.length; i++) {
            val += array[i];
        }

        return val / array.length;
    }

    // print sensor average
    private void printSensorAverage(int flag, int sId) {
        if (flag == 0)
            System.out.println(average(data[0][sId]));
        else if (flag == 1)
            System.out.println(average(data[1][sId]));
        else if (flag == 2)
            System.out.println(average(data[2][sId]));
        else if (flag == 3)
            System.out.println(average(data[3][sId]));
        else if (flag == 4)
            System.out.println(average(data[6][sId]));
        else
            System.out.println(average(data[8][sId]));
    }

    // load given data and check value
    private void loadData(String file, double val) {
        int flag = -1;
        boolean found = true;
        int i = 0;
        double[] dataArr;

        BufferedReader in;
        try {
            in = new BufferedReader(new FileReader(file));
            String data = in.readLine();

            StringTokenizer stk = new StringTokenizer(data, "\t");
            dataArr = new double[stk.countTokens()];

            while (stk.hasMoreTokens()) {
                dataArr[i] = Double.parseDouble(stk.nextToken());
                i++;
            }

            in.close();
        } catch (Exception e) {
            System.out.println("Error= " + e);
        }

        i = 0;

        // in a while loop, check whether the value is available
        while ((i < dataArr.length) && (!found)) {
            if (dataArr[i] == val)
                found = true;
            else
                i++;

        }

        if (found) {
            System.out.println("Entry is available");

            if (i < 3)
                flag = 0;
            else if (i < 6)
                flag = 1;
            else if (i < 10)
                flag = 2;
            else if (i < 15)
                flag = 3;
            else if (i < 20)
                flag = 4;
            else if (i < 25)
                flag = 5;

            // print sensor average
            printSensorAverage(flag, 0);
        }
    }

    // calculate data
    public void calculate(double d) {

        int i, j, k = 0;
        double[][][] data2 = new double[data.length][data[0].length][data[0][0].length];

        BufferedWriter out;

        // Write racing stats data into a file
        try {
            out = new BufferedWriter(new FileWriter("RacingStatsData.txt"));

            for (i = 0; i < data.length; i++) {
                for (j = 0; j < data[0].length; j++) {
                    for (k = 0; k < data[0][0].length; k++) {
                        data2[i][j][k] = data[i][j][k] / d - Math.pow(limit[i][j], 2.0);

                        if (average(data2[i][j]) > 10 && average(data2[i][j]) < 50)
                            break;
                        else if (Math.max(data[i][j][k], data2[i][j][k]) > data[i][j][k])
                            break;
                        else if (Math.pow(Math.abs(data[i][j][k]), 3) < Math.pow(Math.abs(data2[i][j][k]), 3)
                                && average(data[i][j]) < data2[i][j][k] && (i + 1) * (j + 1) > 0)
                            data2[i][j][k] *= 2;
                        else
                            continue;
                    }
                }
            }

            for (i = 0; i < data2.length; i++) {
                for (j = 0; j < data2[0].length; j++) {
                    out.write(data2[i][j] + "\t");
                }
            }

            out.close();

        } catch (Exception e) {
            System.out.println("Error= " + e);
        }
    }

}