public class Main {

    public static void main(String[] args) {
        // write your code here
        double tower1h = 72;
        double tower1d = 22;
        double tower2h = 19;
        double tower2d = 18;
        double tower3h = 50;
        double tower3d = 13;
        double tower4h = 67;
        double tower4d = 16;
        double tower5h = 16;
        double tower5d = 14;
        double tower6h = 53;
        double tower6d = 23;
        double tower7h = 69;
        double tower7d = 22;
        double tower8h = 30;
        double tower8d = 22;
        double tower9h = 52;
        double tower9d = 23;
        double tower10h = 40;
        double tower10d = 16;
        double tower11h = 31;
        double tower11d = 18;
        double tower12h = 75;
        double tower12d = 23;
        double population = 37640;
        double avgwatercm = 0.246;
        double avgwatergtocm =0.24605165;
        double days = 28;
        double pi = 3.14;
        double volume1 = pi * (tower1d / 2) * (tower1d / 2) * tower1h;
        double volume2 = pi * (tower2d / 2) * (tower2d / 2) * tower2h;
        double volume3 = pi * (tower3d / 2) * (tower3d / 2) * tower3h;
        double volume4 = pi * (tower4d / 2) * (tower4d / 2) * tower4h;
        double volume5 = pi * (tower5d / 2) * (tower5d / 2) * tower5h;
        double volume6 = pi * (tower6d / 2) * (tower6d / 2) * tower6h;
        double volume7 = pi * (tower7d / 2) * (tower7d / 2) * tower7h;
        double volume8 = pi * (tower8d / 2) * (tower8d / 2) * tower8h;
        double volume9 = pi * (tower9d / 2) * (tower9d / 2) * tower9h;
        double volume10 = pi * (tower10d / 2) * (tower10d / 2) * tower10h;
        double vol11 = pi * (tower11d / 2) * (tower11d / 2) * tower11h;
        double vol12 = pi * (tower12d / 2) * (tower12d / 2) * tower12h;
        double totvolume = volume1 + volume2 + volume3 + volume4 + volume5 + volume6 + volume7 + volume8 + volume9 + volume10 + vol11 + vol12;
        double water = totvolume / population;
        double waterday = water / days;
        double saving = waterday / avgwatercm;
        double savinggal = saving / avgwatergtocm;
        System.out.println("The amount of water each person need to save in cubic meters is" + saving + "for" + days + "days");
        System.out.println("The amount of water each person need to save in gallons is" + savinggal + "for" + days + "days");
    }
}


