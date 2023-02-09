import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person(); // Person #1
        person.setName("Adilet");
        person.setNationality("Kyrgyz");
        person.setMoph("Redmi");

        Person p2 = new Person(); // Person #2
        p2.setName("Ivan");
        p2.setNationality("Russian");
        p2.setMoph("Samsung");

        Person p3 = new Person(); // Person #3
        p3.setName("Takuto");
        p3.setNationality("Japan");
        p3.setMoph("Iphone SE");

        Person p4 = new Person(); // Person #4
        p4.setName("Jhon");
        p4.setNationality("english"); //Philadelphia
        p4.setMoph("Google Pixel");

        Person p5 = new Person(); // Person #5
        p5.setName("Mueller");
        p5.setNationality("deutsch");
        p5.setMoph("Nokia");

        Person[] ar1 = {person, p2, p3, p4, p5};
        for (Person per : ar1) {
            System.out.println(per.getName() + " " + per.getNationality() + " " + per.getMoph());
        }
        System.out.println();

// **********************************************

        Adress adress = new Adress(); // Adress #1
        adress.setCountry("Kyrgyzstan");
        adress.setCity("Bishkek");
        adress.setStreet("Chyi");
        adress.setPwl("Adilet");

        Adress ad2 = new Adress(); // Adress #2
        ad2.setCountry("Russian");
        ad2.setCity("Sank-Piterburg");
        ad2.setStreet("Puwkinskaya");
        ad2.setPwl("Ivan");

        Adress ad3 = new Adress(); // Adress #3
        ad3.setCountry("Japan");
        ad3.setCity("Tokio");
        ad3.setStreet("Ameyoko");
        ad3.setPwl("Takuto");

        Adress ad4 = new Adress(); // Adress #4
        ad4.setCountry("USA");
        ad4.setCity("Philadelphia");
        ad4.setStreet("Chestnut");
        ad4.setPwl("Jhon");

        Adress ad5 = new Adress(); // Adress #5
        ad5.setCountry("Germany");
        ad5.setCity("Muenchen");
        ad5.setStreet("Kaufingerstrasse");
        ad5.setPwl("Mueller");

        Adress[] ar2 = {adress, ad2, ad3, ad4, ad5};
        for (Adress adr : ar2) {
            System.out.println(adr.getCountry() + " " + adr.getCity() + " " + adr.getStreet() + " " + adr.getPwl());
        }
        System.out.println();

        //********************************************************

        City city = new City(); // City #1
        city.setName("Bishkek");
        city.setVvp(20000);
        city.setRegions(new String[]{"Archa-Beshik ", "Ow bazar ", "Kok-Jar ", "Politeh "});

        City ci2 = new City();     // City #2
        ci2.setName("Sank-Piterburg");
        ci2.setVvp(100000);
        ci2.setRegions(new String[]{"Pitrogradskiy ", "Sentralnyi ", "Primorskiy ", "Admiraltaiskiy "});

        City ci3 = new City();     // City #3
        ci3.setName("Tokio");
        ci3.setVvp(250000);
        ci3.setRegions(new String[]{"Sibuya ", "Sinogava ", "Sindzyuku ", "Sigunami "});

        City ci4 = new City();        // City #4
        ci4.setName("Philadelphia");
        ci4.setVvp(200000);
        ci4.setRegions(new String[]{"Boathaus Row  ", "Independens Mall ", "Manayunk ", "Society Hall "});

        City ci5 = new City();    // City #5
        ci5.setName("Muenchen");
        ci5.setVvp(250000);
        ci5.setRegions(new String[]{"Glochenbach ", "Bogenhausen ", "Trudering ", "Harlaching " });

        City [] arr3 = {city, ci2, ci3, ci4, ci5};
        for (City ci: arr3){
            System.out.println(ci.getName()+ " " + ci.getVvp() + " " + Arrays.toString(ci.getRegions()));
        }
        //*******************************************************

        Country co1 = new Country(); // Country #1
        co1.setName("Kyrgyzstan");
        co1.setLanguage("kyrgyz");
        co1.setCapital("Bishkek");
        co1.setPapulation(7000000);

        Country co2 = new Country(); // Country #2
        co2.setName("Russian");
        co2.setLanguage("Russian");
        co2.setCapital("Moscow");
        co2.setPapulation(200000000);

        Country co3 = new Country(); // Country #3
        co3.setName("Japan");
        co3.setLanguage("Japan");
        co3.setCapital("Tokio");
        co3.setPapulation(186000000);

        Country co4 = new Country(); // Country #4
        co4.setName("USA");
        co4.setLanguage("English");
        co4.setCapital("Washington");
        co4.setPapulation(334234854);

        Country co5 = new Country(); // Country #5
        co4.setName("Germany");
        co4.setLanguage("Germany");
        co4.setCapital("Berlin");
        co4.setPapulation(84300000);

        Country [] arr4 = {co1, co2, co3, co4, co5};
        for (Country cou: arr4){
            System.out.println(cou.getName() + " " +cou.getLanguage()+ " " + cou.getCapital() + " "
                    + cou.getPapulation());
        }








    }
}