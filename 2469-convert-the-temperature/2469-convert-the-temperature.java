class Solution {
    public double[] convertTemperature(double celsius) {
        double f = Math.round((1.8 * celsius + 32) * 100000.0) / 100000.0;
        double k = Math.round((celsius + 273.15) * 100000.0) / 100000.0;
        return new double[] {k,f};
    }
}