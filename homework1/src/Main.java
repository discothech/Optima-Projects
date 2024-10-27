public class Main {
    public static void main(String[] args) {

        int mVoda = 10; // маса води в кг
        double n = 0.15; // енергія
        int to = 15; // температура води в струмку
        int t = 100; // температура кипіння
        int cWater = 4200; // теплоємність
        double qWood = 1e7; // тепло від дров
        double mWood;
        mWood = (cWater*mVoda*(t-to))/(n*qWood); // маса дров
        if (mWood == 2.38) {
            System.out.println("Мінімальна кількість сухих дров складає: " + mWood);
        }
    }
}