package twowaybinding;

public class Test {
    public static void main(String[] args) {

        Country country=new Country();
        State state=new State();
        District district=new District();
        Mandal mandal=new Mandal();
        Village village=new Village();

        village.name="Chandragudem";
        village.vro="Babu";
        village.mandal=mandal;
        mandal.name="Mylavaram";
        mandal.mro="K.Sivaya";
        mandal.village=village;
        mandal.district=district;
        district.districtCollector="DilliRao";
        district.name="Vijayawada";
        district.mandal=mandal;
        district.mayor="Bhagyalakshmi";
        district.state=state;
        state.capital="Amaravathi";
        state.district=district;
        state.name="AndhraPradesh";
        state.language="Telugu";
        state.country=country;
        country.countryCode=91;
        country.name="INDIA";
        country.pm="NarendraModi";
        country.state=state;
        country.capital="Delhi";

        System.out.println(village.name);
        System.out.println(village.vro);
        System.out.println(village.mandal.name+" "+village.mandal.mro+" "+village.mandal.village.name+" "+village.mandal.district.name);
        System.out.println(mandal.mro);
        System.out.println(mandal.name);
        System.out.println(mandal.district);
        System.out.println(mandal.village);
        System.out.println(district.districtCollector);
        System.out.println(district.name);
        System.out.println(district.mayor);
        System.out.println(district.mandal);
        System.out.println(district.state);
        System.out.println(state.name);
        System.out.println(state.capital);
        System.out.println(state.language);
        System.out.println(state.district);
        System.out.println(state.country);
        System.out.println(country.name);
        System.out.println(country.countryCode);
        System.out.println(country.capital);
        System.out.println(country.pm);
        System.out.println(country.state);



    }
}
