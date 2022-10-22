public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int boyfriend = 21;
        System.out.println (boyfriend);
        byte girlfriend = 35;
        System.out.println (girlfriend);
        short boyfriendSalary = 32000;
        long girlfriendSalary = 55000;
        System.out.println(girlfriendSalary);
        System.out.println(boyfriendSalary);
        float boysScoreAtSchool = 3.34f;
        System.out.println(boysScoreAtSchool);
        double girlsScoreAtSchool = 9.76;
        System.out.println(girlsScoreAtSchool);
        float reaction = 27.12f;
        System.out.println(reaction);
        long rally = 987678965549L;
        System.out.println(rally);
        double angerLevel = 2.786;
        System.out.println(angerLevel);
        boolean realRally = rally >=9876789655492L;
        System.out.println(realRally);
        short oranges = 569;
        System.out.println(oranges);
        short temperatureInSiberia = -159;
        System.out.println(temperatureInSiberia);
        int peopleInVillage = 27897;
        System.out.println(peopleInVillage);
        byte numberOfParticipants = 67;
        System.out.println(numberOfParticipants);
        short apples = 517;
        System.out.println(apples);
        int cars = -1474836682;
        System.out.println(cars);
        float carpenter = 2.575f;
        System.out.println(carpenter);
        byte pressure = -57;
        System.out.println(pressure);
        short bananas = 28151;
        System.out.println(bananas);
        short pork = -32768;
        System.out.println(pork);
        int peopleInLasVegas = 2000000;
        System.out.println(peopleInLasVegas);
        long infinity = 999999999L;
        System.out.println(infinity);
        byte ludmilasStudents = 23;
        byte annasStudents = 27;
        byte ekaterinasStudents = 30;
        short paper = 480;
        int paperPerStudent = paper / (ludmilasStudents + annasStudents + ekaterinasStudents);
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
        int bottlesPerMinute = 16/2;
        System.out.println(bottlesPerMinute);
        int bottlesPerHour = bottlesPerMinute * 60;
        int bottlesPerDay = bottlesPerHour * 24;
        System.out.println("За 20 минут машину произвела бутылок: " + (bottlesPerMinute * 20) + " штук ");
        System.out.println("За сутки машина произвела бутылок: " + bottlesPerDay + " штук ");
        System.out.println("За 3 дня машина произвела бутылок: " + (bottlesPerDay * 3) + " штук ");
        System.out.println("За 1 месяц машина произвела бутылок: " + (bottlesPerDay * 30) + " штук ");
        byte allColorsPaintCans = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;
        int eachClassTotalPaint = brownPaintPerClass + whitePaintPerClass;
        int numberOfClasses = allColorsPaintCans / eachClassTotalPaint;
        int whitePaintTotal = whitePaintPerClass * numberOfClasses;
        int brownPaintTotal = brownPaintPerClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, " + "нужно " + whitePaintTotal + " банок белой краски и " + brownPaintTotal + " банок коричневой краски.");
        short oneBanana = 80;
        short hundredMlMilk = 105;
        short oneSundaeCake = 100;
        short oneRawEgg = 70;
        int totalWeightInG = (oneBanana * 5) + (hundredMlMilk * 2) + (oneSundaeCake * 2) + (oneRawEgg * 4);
        float totalWeightInKg = totalWeightInG / 1000f;
        System.out.println("Общий вес спорт-завтрака составляет " + totalWeightInG + " грамм. Вес в кг составляет: " + totalWeightInKg + " кг.");
        short desiredWeightLoss = 7 * 1000;
        short weightLossPerDay1 = 250;
        short weightLossPerDay2 = 500;
        int daysLosingWeight1 = desiredWeightLoss / weightLossPerDay1;
        int daysLosingWeight2 = desiredWeightLoss / weightLossPerDay2;
        System.out.println("Если спортсмен будет терять " + weightLossPerDay1 + " грамм в день, то он сможет похудеть до желаемого веса через " + daysLosingWeight1 + " дней.");
        System.out.println("Если спортсмен будет терять " + weightLossPerDay2 + " грамм в день, то он сможет похудеть до желаемого веса через " + daysLosingWeight2 + " дней.");





















    }

}