public class RoundingNumbers {

    public void rounding(String[] massString, int[] massInt) {
        double[] massDouble = new double[massString.length];

        for (int i = 0; i < massString.length; i++) {
            if (massString[i].contains(".")){
                massDouble[i] = Double.parseDouble(massString[i]);
                massInt[i] = (int) Math.round(massDouble[i]);
            }
            else massInt[i] = Integer.parseInt(massString[i]);
        }
    }

}
