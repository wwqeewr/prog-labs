public class Main {
    public static void main(String[] args){
        int lenE = (19 - 5) / 2 + 1;
        long[] e = new long[lenE];
        for (int i = 0; i < e.length; i++){
            e[i] = 5 + 2 * i; 
        }

        double maxX = 9.0;
        double minX = -8.0;
        double[] x = new double[20];
        for (int i = 0; i < x.length; i++){
            x[i] = Math.random() * (maxX - minX) + minX;
        }

        double[][] e1 = new double[e.length][x.length];
        for (int i = 0; i < e1.length; i++){
            for (int j = 0; j < e1[i].length; j++){
                e1[i][j] = calcElement(e[i], x[j]);
            }
        }
        printMatrix(e1);    
    }

    public static double formulaCbrt(double x) {
        return Math.cbrt(Math.sin(Math.cos(x)));
    }

    public static double formulaLog(double x) {
        double topPow = x / (1.0/2 + x);
        double midPow = 3 * Math.pow(x, topPow);
        double beforeSquare = 2 * Math.pow(Math.log(Math.abs(x)), midPow);
        return Math.pow(beforeSquare, 2);
    }

    public static double formulaTan(double x) {
        double temp1 = Math.pow(2 * Math.cos(x), 2);
        double temp2 = Math.exp(Math.tan(x));
        return Math.tan(temp1) * (Math.tan(temp2) + 1);
    }

    public static double calcElement(long eValue, double xValue){
        if (eValue == 19){
            return formulaCbrt(xValue);
        } else if (eValue == 5 || eValue == 7 || eValue == 11 || eValue == 17){
            return formulaLog(xValue);
        } else{
            return formulaTan(xValue);
        }
    }

    public static void printMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.printf("%24.3f", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
